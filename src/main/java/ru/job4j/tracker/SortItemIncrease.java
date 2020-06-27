package ru.job4j.tracker;

import java.util.Comparator;

public class SortItemIncrease implements Comparator<Item> {
    @Override
    public int compare(Item item, Item another) {
        return item.getName().compareTo(another.getName());
    }
}
