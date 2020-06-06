package ru.job4j.tracker;

public class ReplaceAction implements UserAction {

    @Override
    public String name() {
        return "Replace a Item";
    }
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Replace a Item ===");
        String id = input.askStr("Enter id of Item you want to replace: ");
        String newItem = input.askStr("Enter new name of Item you want to replace: ");
        if (tracker.replace(id, new Item(newItem))) {
            System.out.println("Item changed");
        } else {
            System.out.println("Id not founded");
        }
        return true;
    }
}
