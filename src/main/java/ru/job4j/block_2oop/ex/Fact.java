package ru.job4j.block_2oop.ex;

public class Fact {
    public void main(String[] args) {
        System.out.println(new Fact().calc(-1));
    }
    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("!!!");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
