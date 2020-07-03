package ru.job4j.block3collections.controlTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (start.equals("")) {
                    tmp.add(el);
                    start = el;
                } else {
                    start = start + "/" +el;
                    tmp.add(start);
                }

            }
        }
        return new ArrayList<>(tmp);
    }

    public static List<String> sortAsc(List<String> orgs) {
        Collections.sort(orgs);
        return orgs;
    }

    public static List<String> sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
        return orgs;
    }
}
