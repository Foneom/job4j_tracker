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
        Item item = tracker.findById(id);
               if (item != null) {
            System.out.println(item.getName());
        } else {
            System.out.println("Id not founded");
        }
        return true;
    }
}
