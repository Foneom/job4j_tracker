package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;


public class StartUITest {


    @Test
    public void whenFindItemById() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Item"));
        Input in = new StubInput(
                new String[] {"0", item.getId(), "1"}
        );
        UserAction[] actions = {
                new FindItemById(),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(item));
    }
    @Test
    public void whenFindItemByName() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Item"));
        Input in = new StubInput(
                new String[] {"0", item.getName(), "1"}
        );
        UserAction[] actions = {
                new FindItemByName(),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findByName(item.getName())[0], is(item));
    }
        @Test
        public void whenReplaceItem() {
            Output out = new StubOutput();
            Tracker tracker = new Tracker();
            Item item = tracker.add(new Item("Replaced item"));
            String replacedName = "New item name";
            Input in = new StubInput(
                    new String[] {"0", item.getId(), replacedName, "1"}
            );
            UserAction[] actions = {
                    new ReplaceAction(),
                    new ExitAction()
            };
            new StartUI(out).init(in, tracker, actions);
            assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
        }
@Test
public void whenDeleteItem() {
    Output out = new StubOutput();
    Tracker tracker = new Tracker();
    Item item = tracker.add(new Item("Deleted item"));
    Input in = new StubInput(
            new String[] {"0", item.getId(), "1"}
    );
    UserAction[] actions = {
            new DeleteAction(),
            new ExitAction()
    };
    new StartUI(out).init(in, tracker, actions);
    assertThat(tracker.findById(item.getId()), is(nullValue()));
}
    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new ExitAction()
        };
       new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }
    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu. " + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator()
        ));
    }
    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1", "0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                String.format(
                        "Menu. %n"
                                + "0. Exit%n"
                                + "Wrong input, you can select: 0... 0%n"
                                + "Menu. %n"
                                + "0. Exit%n"
                )
        ));
    }
}