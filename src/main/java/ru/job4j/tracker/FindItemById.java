package ru.job4j.tracker;

public class FindItemById implements UserAction {
    @Override
    public String name() {
        return "Searching Items by id";
    }
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Searching Items by id ===");
        String id = input.askStr("Enter id: ");
        if (tracker.findById(id) != null) {
            System.out.println(tracker.findById(id).getName());
            return true;
        } else {
            System.out.println("id wrong");
            return false;
        }
    }
}
