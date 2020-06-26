package ru.job4j.block_3collections.sort;

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 2, 4, 1);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
