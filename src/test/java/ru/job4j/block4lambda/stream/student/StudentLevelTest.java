package ru.job4j.block4lambda.stream.student;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StudentLevelTest {

    @Test
    public void whenSorted() {
        List<Student> input = new ArrayList<>();
        input.add(new Student(128, "Petty"));
        input.add(new Student(28,  "Masha"));
        List<Student> expected = List.of(
                new Student(28, "Masha"),
                new Student(128, "Petty")
        );
        assertThat(StudentLevel.levelOf(input, 20), is(expected));
    }

    @Test
    public void whenOnlyNull() {
        List<Student> input = new ArrayList<>();
        input.add(null);
        List<Student> expected = List.of();
        assertThat(StudentLevel.levelOf(input, 100), is(expected));
    }

    @Test
    public void whenHasNull() {
        List<Student> input = new ArrayList<>();
        input.add(null);
        input.add(new Student(28, "Petty"));
        List<Student> expected = List.of(new Student(28, "Petty"));
        assertThat(StudentLevel.levelOf(input, 10), is(expected));
    }
}