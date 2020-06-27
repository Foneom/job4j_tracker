package ru.job4j.tracker;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class SortByNameItem {

    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("second"),
                new Item("first"),
                new Item("third")
        );
        System.out.println(items);
        Collections.sort(items, new SortItemDecrease());
        System.out.println(items);
        Collections.sort(items, new SortItemIncrease());
        System.out.println(items);
    }
}
