package ru.job4j.block3collections.controlTask;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int result = o1.length() - o2.length();
            if (result == 0) {
                return o1.compareTo(o2);
            }
        return result;
    }
}
