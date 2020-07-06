package ru.job4j.block4lambda.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-1, 2, -3, 4));
        List<Integer> positiveNumbers = list.stream()
                .filter(i -> i > 0)
                .collect(Collectors.toList());
        System.out.println(positiveNumbers);
    }
}
