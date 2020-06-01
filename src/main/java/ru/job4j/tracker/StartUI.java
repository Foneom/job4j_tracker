package ru.job4j.tracker;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StartUI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }

    public void init(Scanner scanner, Tracker tracker) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== List of Items ===");
                tracker.findAll();
            } else if (select == 2) {
                System.out.println("=== Change a Item ===");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                System.out.println("Enter id: ");
                String id = scanner.nextLine();
                Item item = new Item(name);
                tracker.replace(id, item);
            } else if (select == 3) {
                System.out.println("=== Delete a Item ===");
                System.out.println("Enter id: ");
                String id = scanner.nextLine();
                tracker.delete(id);
            } else if (select == 4) {
                System.out.println("=== Find Item by Id ===");
                System.out.println("Enter id: ");
                String id = scanner.nextLine();
                tracker.findById(id);
            } else if (select == 5) {
                System.out.println("=== Find Item by name ===");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                tracker.findByName(name);
            } else if (select == 6) {
                System.out.println("=== Good bye! ===");
                System.exit(0);
            }
        }
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
