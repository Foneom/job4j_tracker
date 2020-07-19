package ru.job4j.block4lambda.doptask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Даны вложенные итераторы. Нужно написать метод, который соберет все элементы их итераторов в List.
 */
public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        List<Integer> list = new ArrayList<>();
        Iterator<Integer> itr = list.iterator();
        while (it.hasNext() && !itr.hasNext()) {
            itr = it.next();
            list.add(itr.next());
        }
        list.add(itr.next());
        return list;
    }
}
