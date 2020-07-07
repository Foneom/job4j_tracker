package ru.job4j.block3collections.dopTask;

/**
 * Класс проверки корректности открытых и закрытых скобок
 */
public class Parentheses {
    public static boolean valid(char[] data) {
        boolean flag = false;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[0] == '(' && data[data.length - 1] == ')'
                    && data[data.length - 2] == ')' && data[i + 1] == ')' ||
                    data[0] == '(' && data[data.length - 1] == ')'
                            && data[data.length - 2] == '(' && data[i + 1] == '(') {
                flag = true;
            }
        }
        return flag;
    }

}
