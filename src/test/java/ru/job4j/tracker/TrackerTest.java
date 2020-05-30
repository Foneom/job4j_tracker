package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("first");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }
    @Test
    public void whenFindAll() {
        Tracker tracker = new Tracker();
        Item item = new Item("f");
        tracker.add(item);
        Item[] result = {item};
        assertThat(tracker.findAll()
                , is(result));
    }
    @Test
    public void whenFindItemByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("f");
        tracker.add(item);
        Item[] result = {item};
        assertThat(tracker.findByName(item.getName())
                , is(result));
    }
}