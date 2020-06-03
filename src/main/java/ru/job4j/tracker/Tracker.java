package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Хранилище заявок
     */
    private final Item[] items = new Item[100];
    /**
     * Указатель ячейки новой заявки
     */
    private int position = 0;

    /**
     * Метод добавления новых зявок
     *
     * @param item новая заявка
     * @return
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    /**
     * Генерация уникального ключа
     *
     * @return
     */
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

    /**
     * Получение всех заявок
     *
     * @return
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    /**
     * Поиск заявки по id
     *
     * @param id искомой ячейки
     * @return индекс ячейки
     */
    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    /**
     * Метод поиска заявки по имени
     *
     * @param key уникальный ключ
     * @return
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[position];
        int count = 0;
        for (int index = 0; index < position; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                result[index] = items[index];
                count++;
            }
        }
        return Arrays.copyOf(items, count);
    }

    /**
     * Метод изменения заявки
     *
     * @param id   уникальный ключ
     * @param item новая заявка
     * @return
     */
    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            items[index] = item;
        }
        return rsl;
    }
    /**
     * Метод удаления заявки
     * @param id уникальный ключ
     * @return
     */
    public boolean delete(String id) {
        int index = indexOf(id);
        int start = index + 1;
        int distPos = index;
        int size = position - index;
        boolean rsl = index != -1;
        if (rsl) {
            items[position - 1] = null;
            position--;
            System.arraycopy(items, start, items, distPos, size);
        }
        return rsl;
    }
}