package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete a Item";
    }
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete a Item ===");
        String id = input.askStr("Enter id of Item you want to delete: ");
        if (tracker.delete(tracker.findById(id).getId())) {
            return true;
        } else
            return false;
    }
}
