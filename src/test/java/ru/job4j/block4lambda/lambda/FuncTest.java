package ru.job4j.block4lambda.lambda;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FuncTest {

    @Test
    public void whenLinearFunction() {
        List<Double> result = Func.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }
    @Test
    public void whenSquareFunction() {
        List<Double> result = Func.diapason(5, 8, x -> x * x);
        List<Double> expected = Arrays.asList(25D, 36D, 49D);
        assertThat(result, is(expected));
    }
    @Test
    public void whenShowFunction() {
        List<Double> result = Func.diapason(1, 4, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(2D, 4D, 8D);
        assertThat(result, is(expected));
    }
}