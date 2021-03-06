package ru.job4j.block2oop.ex;

public class Find {
    public static String get(String[] data, int index) {
        if (index < 0 || index > data.length) {
            throw new IllegalArgumentException("Index out of bound");
        }
        return data[index];
    }

    public static void main(String[] args) {
        String[] data = {"own", "two", "three"};
        String rsl = Find.get(data, 2);
        System.out.println(rsl);
    }
}
