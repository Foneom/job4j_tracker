package ru.job4j.block3collections.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl task", 2),
                new Job("Reboot server", 11)
        );
        //Collections.sort(jobs, new JobDescByName().thenComparing(new JobDescByPriority()));
        //System.out.println(jobs);
        Comparator<Job> comb = new JobIncreaseByName()
                .thenComparing(new JobIncreaseByPriority())
                .thenComparing(new JobDescByName())
                .thenComparing(new JobDescByPriority());
        Collections.sort(jobs, comb);
        System.out.println(jobs);
    }
}
