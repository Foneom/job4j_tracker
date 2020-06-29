package ru.job4j.block_3collections.sort;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    /**
     * Если длина строк равна, то идет простое сравнение строк,
     * если не равна, то большей считается длинная строка
     * @param left
     * @param right
     * @return
     */
    @Override
    public int compare(String left, String right) {
        int diff = left.length() - right.length();
        if (diff == 0) {
            return left.compareTo(right);
        } else {
            return diff;
        }
    }
}
