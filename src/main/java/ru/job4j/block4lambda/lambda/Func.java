package ru.job4j.block4lambda.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Func {
        public static List<Double> diapason (int start, int end, Function<Double, Double> func) {
            List<Double> rsl = new ArrayList<>();
            for (int i = start; i < end; i++) {
                double result = func.apply((double) i);
                rsl.add(result);
            }
            return rsl;
        }
    }
