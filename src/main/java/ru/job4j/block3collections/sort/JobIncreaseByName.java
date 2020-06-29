package ru.job4j.block3collections.sort;

import java.util.Comparator;

public class JobIncreaseByName implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
