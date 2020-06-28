package ru.job4j.block_3collections.sort;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        char[] left1 = left.toCharArray();
        char[] right1 = right.toCharArray();
        int[] left2 = new int[left1.length];
        int[] right2 = new int[right1.length];
        int result = 0;
        for (int i = 0; i < Math.min(left1.length, left2.length); i++) {
            left2[i] = Character.getNumericValue(left1[i]);
            right2[i] = Character.getNumericValue(right1[i]);
            if ((left2[i] < right2[i] && left2.length != right2.length)
                    || (left2[i] < right2[i] && left2.length == right2.length)) {
                result = -1;
                break;
            } else if ((left2[i] > right2[i] && left2.length != right2.length)
                    || (left2[i] > right2[i] && left2.length == right2.length)) {
                result = 1;
                break;
            }
        }
            return result;
        }
    }







