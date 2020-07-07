package ru.job4j.block4lambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MatrixToList {
    public static List<Integer> convert(Integer[][] arr) {
        List<Integer> result = Arrays.stream(arr)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        return result;
    }
}
