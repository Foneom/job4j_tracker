package ru.job4j.block4lambda.doptask;

import ru.job4j.block3collections.dopTask.Parentheses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Даны вложенные итераторы. Нужно написать метод, который соберет все элементы их итераторов в List.
 */
public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        Iterable<Integer> iterable = it::next;
            return StreamSupport
                    .stream(iterable.spliterator(), false)
                    .filter(integer -> it.hasNext())
                    .collect(Collectors.toList());
    }
}
