package ru.job4j.block4lambda.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SearchAtt {

    public static List<Attachment> filterSize(List<Attachment> list) {
        Predicate<Attachment> predicate =  attachment -> attachment.getSize() > 100;
        return filter(list, predicate);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
       Predicate<Attachment> predicate = attachment -> attachment.getName().contains("bug");
        return filter(list, predicate);
    }

    public static List<Attachment> filter(List<Attachment> list, Predicate<Attachment> predicate) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (predicate.test(att)) {
                rsl.add(att);
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 101),
                new Attachment("image 2", 34),
                new Attachment("bug", 13)
        );
        List<Attachment> size = filterSize(attachments);
        System.out.println(size);
        List<Attachment> name = filterName(attachments);
        System.out.println(name);
    }
}
