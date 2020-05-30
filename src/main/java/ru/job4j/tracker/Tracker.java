package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {

    private final Item[] items = new Item[100];
    private int position = 0;

    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item[] findAll() {
        Item[] result = new Item[position];
        for (int index = 0; index < position; index++) {
            if (items[index] != null) {
                result[index] = this.items[index];
            }
        }
        return result;
    }

    public Item findById(String id) {
        Item rsl = null;
        for (int index = 0; index < position; index++) {
            Item item = items[index];
            if (item != null && item.getId().equals(id)) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item findByName(String key) {
        Item rsl = null;
        for (int index = 0; index < position; index++) {
            Item item = items[index];
            if (item != null && item.getName().equals(key)) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}