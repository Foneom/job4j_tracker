package ru.job4j.tracker;

import org.junit.Test;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    /**
     * Тест на добавление заявки
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("first");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    /**
     * Тест метода вывода списка всех заявок
     */
    @Test
    public void whenFindAll() {
        Tracker tracker = new Tracker();
        Item item = new Item("f");
        tracker.add(item);
        List<Item> expect = Arrays.asList(item);
        assertThat(tracker.findAll(), is(expect));
    }

    /**
     * Тест поиска заявки по имени
     */
    @Test
    public void whenFindItemByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("f");
        tracker.add(item);
        List<Item> expect = Arrays.asList(item);
        assertThat(tracker.findByName(item.getName()), is(expect));
    }

    /**
     * Тест меода поиска заявки по ключу
     */
    @Test
    public void whenFindItemByName2() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("first");
        Item item2 = new Item("second");
        tracker.add(item1);
        tracker.add(item2);
        List<Item> expect = Arrays.asList(item1);
        assertThat(tracker.findByName("first"), is(expect));
    }

    /**
     * Тест метода замены заявки
     */
    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    /**
     * Тест метода удаления заявки
     */
    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        tracker.add(item1);
        Item item2 = new Item("test2");
        tracker.add(item2);
        Item item3 = new Item("test3");
        tracker.add(item3);
        tracker.delete(item3.getId());
        List<Item> expect = Arrays.asList(item1, item2);
        assertThat(tracker.findAll(), is(expect));
    }
}