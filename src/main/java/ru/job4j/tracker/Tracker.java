package ru.job4j.tracker;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Tracker {
    /**
     * Хранилище заявок
     */
    private final List<Item> items = new ArrayList<>();
    /**
     * Метод добавления новых зявок
     *
     * @param item новая заявка
     * @return
     */
    public Item add(Item item) {
        item.setId(generateId());
        items.add(item);
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
        for(Item item : items) {
            if(item.getId().equals(id)) {
                rsl = items.indexOf(item);
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
    public List<Item> findAll() {
        return items;
    }
    /**
     * Поиск заявки по id
     *
     * @param id искомой ячейки
     * @return индекс ячейки
     */
    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }
    /**
     * Метод поиска заявки по имени
     *
     * @param key уникальный ключ
     * @return
     */
            public List<Item> findByName(String key) {
                List<Item> result = new ArrayList<>();
                for(Item item : items) {
                    if (item.getName().equals(key)) {
                         result.add(item);
                    }
                }
                    return result;
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
            items.set(index, item);

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
        boolean rsl = index != -1;
        if (rsl) {
            items.remove(index);
        }
        return rsl;
    }


}