package ru.job4j.tracker;



public class StartUI {

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
    /**
     * Метод основного цкла программы
     * @param input объект интерейса Input
     * @param tracker объект Tracker - хранилище заявок
     */
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            /**
             * Создание новой заявки
             */
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
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
                String id = input.askStr("Enter id of Item you want to replace: ");
                String newItem = input.askStr("Enter new name of Item you want to replace: ");
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
                String id = input.askStr("Enter id of Item you want to delete");
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
                String id = input.askStr("Enter id: ");
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
                String name = input.askStr("Enter name: ");
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
