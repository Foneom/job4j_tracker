package ru.job4j.tracker;


import java.util.ArrayList;
import java.util.List;

public class StartUI {

    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }
    /**
     * Запуск программы
     * @param args
     */
    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction(output));
        actions.add(new ShowListAction());
        actions.add(new DeleteAction());
        actions.add(new ReplaceAction());
        actions.add(new FindItemById());
        actions.add(new FindItemByName());
        actions.add(new ExitAction());
        new StartUI(output).init(input, tracker, actions);
    }
    /**
     * Основной цикл программы
     * @param input - входные данные
     * @param tracker - хранилище данных
     * @param actions - действия с заявками
     */
    public void init(Input input, Tracker tracker, List<UserAction> actions) {
boolean run = true;
while (run) {
    this.showMenu(actions);
    int select = input.askInt("Select: ");
    if (select < 0 || select >= actions.size()) {
        out.println("Wrong input, you can select: 0... "
        + (actions.size() - 1));
        continue;
    }
    UserAction action = actions.get(select);
    run = action.execute(input, tracker);
}
    }
    /**
     * Инициализатор главного меню
     * @param actions - пункты меню
     */
    private void showMenu(List<UserAction> actions) {
        out.println("Menu. ");
        for (int index = 0; index < actions.size(); index++) {
            out.println(index + ". " + actions.get(index).name());
        }
    }
}
