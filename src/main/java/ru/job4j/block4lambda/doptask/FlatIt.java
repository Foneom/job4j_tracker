package ru.job4j.block4lambda.doptask;

import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Даны вложенные итераторы. Нужно написать метод, который соберет все элементы их итераторов в List.
 */
public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        List<Integer> list = Stream.iterate(it, Iterator::hasNext, i -> i)
                .flatMap(i -> Stream.iterate(i.next(), Iterator::hasNext,  k -> k))
                .map(Iterator::next)
                .collect(Collectors.toList());
        return list;
    }
}
