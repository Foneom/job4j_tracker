package ru.job4j.block3collections.controlTask;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] o1Line = o1.split("/");
        String[] o2Line = o2.split("/");
        int tmp = o2Line[0].compareTo(o1Line[0]);
        return (tmp == 0) ? o1.compareTo(o2) : tmp;
    }
}
