package ru.job4j.block4lambda.lambda;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FI {
    public static void raw(List<Attachment> list, Function<Attachment, InputStream> func) {
        for (Attachment att : list) {
            func.apply(att);
        }
    }
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 23)
        };
        Comparator<Attachment> comparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
        Arrays.sort(atts, comparator);
        System.out.println(Arrays.toString(atts));
    }
    @FunctionalInterface
    public interface Function<T, R> {
        R apply(T t);
    }
}
