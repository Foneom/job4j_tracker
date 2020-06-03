package ru.job4j.tracker;



public class StartUI {

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
    /**
     * Метод создания новой заявки
     * @param input объект интерейса Input
     * @param tracker объект Tracker - хранилище заявок
     */
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }
    /**
     * Метод вывода списка заявок
     * @param tracker объект Tracker - хранилище заявок
     */
    public static void listItem(Tracker tracker) {
        System.out.println("=== List of Items ===");
        for (Item item : tracker.findAll())
            System.out.println("id: " + item.getId() + " name: " + item.getName());
    }
    /**
     * Метод изменения заявки
     * @param input
     * @param tracker
     */
    public static void changeItem(Input input, Tracker tracker) {
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
     * Метод удаения заявки
     * @param input
     * @param tracker
     */
    public static void deleteItem(Input input, Tracker tracker) {
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
     * Метод поиска заявки по id
     * @param input
     * @param tracker
     */
    public static void findItemById(Input input, Tracker tracker) {
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
     * Метод поиска заявки по названию
     * @param input
     * @param tracker
     */
    public static void findItemByName(Input input, Tracker tracker) {
        System.out.println("=== Find Item by name ===");
        String name = input.askStr("Enter name: ");
        for (Item item : tracker.findByName(name))
            System.out.println("id: " + item.getId() + " name: " + item.getName());
    }
    public static void exitProgram() {
        System.out.println("Good bye");
        System.exit(0);
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
            if (select == 0) {
                StartUI.createItem(input, tracker);
            }
            else if (select == 1) {
               StartUI.listItem(tracker);
            }
            else if (select == 2) {
                StartUI.changeItem(input, tracker);
            }
            else if (select == 3) {
               StartUI.deleteItem(input, tracker);
            }
            else if (select == 4) {
               StartUI.findItemById(input, tracker);
            }
            else if (select == 5) {
                StartUI.findItemByName(input, tracker);
            }
            else if (select == 6) {
              StartUI.exitProgram();
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
