package ru.job4j.tracker;

public class ShowListAction implements UserAction {
    @Override
    public String name() {
        return "List of Items";
    }
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== List of Items ===");
        for (Item item : tracker.findAll()) {
            System.out.println("id: " + item.getId() + " name: " + item.getName());
        }
        return true;
    }
}
