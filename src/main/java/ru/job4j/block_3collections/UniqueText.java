package ru.job4j.block_3collections;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String word : origin) {
        check.add(word);
        }
        for (String nWord : text) {
            if (!check.contains(nWord)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}