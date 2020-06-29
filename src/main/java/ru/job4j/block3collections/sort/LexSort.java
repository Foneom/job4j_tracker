package ru.job4j.block3collections.sort;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] leftLine = left.split(". ");
        String[] rightLine = right.split(". ");
        int leftLineInt = Integer.parseInt(leftLine[0]);
        int rightLineInt = Integer.parseInt(rightLine[0]);
        return Integer.compare(leftLineInt, rightLineInt);
    }
}
