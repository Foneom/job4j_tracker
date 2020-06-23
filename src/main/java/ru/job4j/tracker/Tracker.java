package ru.job4j.tracker;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Random;
public class Tracker {
    /**
     * Хранилище заявок
     */
    List<Item> items = new ArrayList<>();
  //  private final Item[] items = new Item[100];
    /**
     * Указатель ячейки новой заявки
     */
  //  private int position = 0;
    /**
     * Метод добавления новых зявок
     *
     * @param item новая заявка
     * @return
     */
    public Item add(Item item) {
        item.setId(generateId());
        //items[position++] = item;
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

     //   for (int index = 0; index < position; index++) {
       //     if (items[index].getId().equals(id)) {
        //        rsl = index;
          //      break;
            }
        }
        return rsl;
    }
    /**
     * Получение всех заявок
     *
     * @return
     */
   // public Item[] findAll() {
    public List<Item> findAll() {
        //return Arrays.copyOf(items, position;
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
    //public Item[] findByName(String key) {
            public List<Item> findByName(String key) {
                List<Item> result = new ArrayList<>();
                for(Item item : items) {
                    if (item.getName().equals(key)) {
                         result.add(item);
                    }
                }
                    return result;
                }

        //Item[] result = new Item[position];
      //   int count = 0;
      //  for (int index = 0; index < result.length; index++) {
       //     Item item = items[index];
       //     if (item.getName().equals(key)) {
         //       result[count++] = item;

      //  return Arrays.copyOf(result, count);

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
           //items[index] = item;
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
       // int start = index + 1;
        //int distPos = index;
       // int size = position - index;
        boolean rsl = index != -1;
        if (rsl) {
            items.remove(index);
        //    items[position - 1] = null;
       //     position--;
         //   System.arraycopy(items, start, items, distPos, size);
        }
        return rsl;
    }


}