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
    /**
     * Поиск ячейки по id
     *
     * @param id id искомой ячейки
     * @return индекс ячейки
     */
    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findByName(String key) {
        for (int index = 0; index < position; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                return Arrays.copyOf(items, position);
            }
        }
        return null;
    }
}