package ru.job4j.tracker;

import java.util.Comparator;

public class Item {

    public Item() {
        System.out.println("load item");
    }

    private String id;
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Item item = new Item();
    }
}

