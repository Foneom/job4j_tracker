package ru.job4j.max;

import java.security.spec.RSAOtherPrimeInfo;

public class Reduce {
    private int[] array;

    public int[] to(int[] array) {
        return array;
    }

    public void print(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print(reduce.to(array));
    }
}
