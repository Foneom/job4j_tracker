package ru.job4j.tracker;

import java.util.Comparator;

public class Item implements Comparator<Item> {

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
        return "Item{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compare(Item o1, Item o2) {
        return 0;
    }

    public static void main(String[] args) {
      Item item = new Item();
        }
    }
