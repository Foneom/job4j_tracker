package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class SortByNameItem implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return o1.getName().compareTo(o2.getName());
    }
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("second"),
                new Item("first"),
                new Item("third")
        );
        System.out.println(items);
        Collections.sort(items, new SortByNameItem());
        System.out.println(items);
        Collections.reverse(items);
        System.out.println(items);
    }
}
