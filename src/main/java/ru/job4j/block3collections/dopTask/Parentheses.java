package ru.job4j.block3collections.dopTask;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Класс проверки корректности открытых и закрытых скобок
 */
public class Parentheses {
    public static boolean valid(char[] brаckets) throws StackOverflowError {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : brаckets) {
            if (c == '(') {
                stack.push(c);
            } else if (stack.isEmpty() || stack.pop() != '(') {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

