package ru.job4j.block3collections.sort;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int diff = left.length() - right.length();
        /**
         * Делим строки
         */
        String[] leftLine = left.split(". ");
        String[] rightLine = right.split(". ");
        /**
         * Преобразуем строковую цифру в примитивный тип
         */
        int leftLineInt = Integer.parseInt(leftLine[0]);
        int rightLineInt = Integer.parseInt(rightLine[0]);
        /**
         * Сравниваем значения, если не равны, то идет сортировка по убыванию,
         * если равны, то большей считается длинная сторка
         */
        if (leftLineInt != rightLineInt) {
           return Integer.compare(leftLineInt, rightLineInt);
        }
        return diff;
    }
}
