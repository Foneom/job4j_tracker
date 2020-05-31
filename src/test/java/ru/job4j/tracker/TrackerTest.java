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
    @Test
    public void whenFindItemByName2() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("first");
        Item item2 = new Item("second");
        tracker.add(item1);
        tracker.add(item2);
        Item[] result = {item1};
        assertThat(tracker.findByName("first"), is(result));
    }
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


}