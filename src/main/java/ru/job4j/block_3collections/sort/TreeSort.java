package ru.job4j.block_3collections.sort;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSort {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);
    }
}
