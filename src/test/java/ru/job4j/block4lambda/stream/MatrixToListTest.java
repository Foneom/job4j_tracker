package ru.job4j.block4lambda.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MatrixToListTest {
    @Test
    public void whenMatrixToListValid() {
        Integer[][] array = {
                {1, 2},
                {3, 4}
        };
        List<Integer> result = MatrixToList.convert(array);
        List<Integer> expect = Arrays.asList(1, 2, 3, 4);
        assertThat(result, is(expect));

    }

}