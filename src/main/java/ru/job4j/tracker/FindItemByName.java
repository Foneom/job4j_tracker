package ru.job4j.tracker;

public class FindItemByName implements UserAction {
    @Override
    public String name() {
        return "Searching Items by name";
    }
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Searching Item by name ===");
        String name = input.askStr("Enter name: ");
        Item[] byName = tracker.findByName(name);
        if (byName.length > 0) {
            for (Item item : byName) {
                System.out.println("id: " + item.getId() + " name: " + item.getName());
            }
        } else {
            System.out.println(String.format("Items by name: %s not found", name));
        }
        return true;
    }
}
