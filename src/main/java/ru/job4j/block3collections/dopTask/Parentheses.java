package ru.job4j.block3collections.dopTask;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Класс проверки корректности открытых и закрытых скобок
 */
public class Parentheses {
    public static boolean valid(char[] brаckets) throws StackOverflowError {
        try {
            Deque<Character> stack = new ArrayDeque<>();
            for (char c : brаckets) {
                switch (c) {
                    case '(':
                        stack.push(c);
                        break;
                    case ')':
                        if (stack.isEmpty() || stack.pop() != '(') {
                            return false;
                        }
                    default:
                        break;
                }
            }
            return stack.isEmpty();
        } catch (StackOverflowError e) {
            return false;
        }
    }
}
