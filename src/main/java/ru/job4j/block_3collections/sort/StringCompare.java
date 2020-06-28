package ru.job4j.block_3collections.sort;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;
        char[] left1 = left.toCharArray();
        char[] right1 = right.toCharArray();
        int[] left2 = new int[left1.length];
        int[] right2 = new int[right1.length];
        for (int i = 0; i < left1.length; i++) {
            for (int j = 0; j < right1.length; j++) {
                left2[i] = Character.getNumericValue(left1[i]);
                right2[j] = Character.getNumericValue(right1[j]);
                if (left2[i] == right2[j]) {
                    result = 0;
                } else if (left2[i] > right1[j]) {
                    result = 1;
                } else if (left2[i] < right1[j]) {
                    result = -1;
                }
            }
        }
        return result;
    }
}
