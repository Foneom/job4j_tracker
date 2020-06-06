package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
       // StartUI.(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }
        @Test
        public void whenReplaceItem() {
            Tracker tracker = new Tracker();
            Item item = tracker.add(new Item("Replaced item"));
            /* Входные данные должны содержать ID добавленной заявки item.getId() */
            String replacedName = "New item name";
            Input in = new StubInput(
                    new String[] {"0", item.getId(), "1"}
            );
            UserAction[] actions = {
                    new ReplaceAction(),
                    new ExitAction()
            };
            new StartUI().init(in, tracker, actions);
            assertThat(tracker.findById(item.getId()), is(replacedName));
        }
@Test
public void whenDeleteItem() {
    Tracker tracker = new Tracker();
    Item item = tracker.add(new Item("Deleted item"));
    Input in = new StubInput(
            new String[] {"0", item.getId(), "1"}
    );
    UserAction[] actions = {
            new DeleteAction(),
            new ExitAction()
    };
    new StartUI().init(in, tracker, actions);
    assertThat(tracker.findById(item.getId()), is(nullValue()));
}

    @Test
    public void whenCreateItem() {
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ExitAction()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }
}