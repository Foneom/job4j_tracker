package ru.job4j.block4lambda.stream;

import org.junit.Test;
import ru.job4j.block4lambda.stream.student.School;
import ru.job4j.block4lambda.stream.student.Student;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class SchoolTest {

    @Test
    public void whenClassA() {
        List<Student> students = Arrays.asList(
                new Student(75, "Ivanov"),
                new Student(10, "Pteerov"),
                new Student(50, "Sidorov"),
                new Student(76, "Antonov")
        );
        List<Student> result = School.classA(students);
        List<Student> expected = Arrays.asList(
                new Student(75, "Ivanov"),
                new Student(76, "Antonov")
        );
        assertThat(result, is(expected));
    }

    @Test
    public void whenClassB() {
        List<Student> students = Arrays.asList(
                new Student(75, "Ivanov"),
                new Student(10, "Pteerov"),
                new Student(51, "Sidorov"),
                new Student(76, "Antonov")
        );
        List<Student> result = School.classB(students);
        List<Student> expected = Arrays.asList(
                new Student(51, "Sidorov")
        );
        assertThat(result, is(expected));
    }

    @Test
    public void whenClassV() {
        List<Student> students = Arrays.asList(
                new Student(75, "Ivanov"),
                new Student(10, "Pteerov"),
                new Student(51, "Sidorov"),
                new Student(76, "Antonov")
        );
        List<Student> result = School.classV(students);
        List<Student> expected = Arrays.asList(
                new Student(10, "Pteerov")
        );
        assertThat(result, is(expected));
    }

}