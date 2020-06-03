package ru.job4j.tracker;


import java.util.Scanner;

public class StartUI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
    /**
     * Метод основного цкла программы
     * @param scanner объект класса Scanner
     * @param tracker объект Tracker - хранилище заявок
     */
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            /**
             * Создание новой заявки
             */
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            }
            /**
             * Вывод списка всех заявок
             */
            else if (select == 1) {
                System.out.println("=== List of Items ===");
                for (Item item : tracker.findAll())
                    System.out.println("id: " + item.getId() + " name: " + item.getName());
            }
            /**
             * Именение заявки
             */
            else if (select == 2) {
                System.out.println("=== Change a Item ===");
                System.out.println("Enter id of Item you want to replace: ");
                String id = scanner.nextLine();
                System.out.println("Enter new name of Item you want to replace: ");
                String newItem = scanner.nextLine();
                Item item = tracker.findById(id);
                Item newIt = new Item(newItem);
                tracker.replace(item.getId(), newIt);
                if(item != null) {
                    System.out.println("Item changed");
                }
                else
                    System.out.println("id wrong");
            }
            /**
             * Удаление заявки
             */
            else if (select == 3) {
                System.out.println("=== Delete a Item ===");
                System.out.println("Enter id of Item you want to delete");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                tracker.delete(item.getId());
                if(item != null) {
                    System.out.println("Item deleted");
                }
                else
                    System.out.println("id wrong");
            }
            /**
             * Поиск зявки по id
             */
            else if (select == 4) {
                System.out.println("=== Find Item by Id ===");
                System.out.println("Enter id: ");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                if(item != null) {
                    System.out.println(item.getName());
                }
                else
                    System.out.println("id wrong");
            }
            /**
             * Поиск заявки по имени
             */
            else if (select == 5) {
                System.out.println("=== Find Item by name ===");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                for (Item item : tracker.findByName(name))
                    System.out.println("id: " + item.getId() + " name: " + item.getName());
            }
            /**
             * Выход из программы
             */
            else if (select == 6) {
                System.out.println("=== Good bye! ===");
                System.exit(0);
            }
        }
    }
    /**
     * Метод отобраения заглавного меню программы
     */
    private void showMenu() {
        System.out.println("Menu." +
                "\n0.Add new Item" +
                "\n1.Show all items" +
                "\n2.Edit item" +
                "\n3.Delete item" +
                "\n4.Find item by Id" +
                "\n5.Find items by name" +
                "\n6.Exit Program");
    }
    }
