package ru.job4j.tracker;

import java.util.Comparator;

public class SortItemDecrease implements Comparator<Item> {
    @Override
    public int compare(Item item, Item another) {
        return another.getName().compareTo(item.getName());
    }
}
