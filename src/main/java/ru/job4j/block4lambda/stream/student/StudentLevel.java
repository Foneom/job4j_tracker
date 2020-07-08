package ru.job4j.block4lambda.stream.student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentLevel {
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .sorted((left, right) -> Integer.compare(right.getScore(), left.getScore()))
                .takeWhile(student -> student.getScore() > bound)
                .collect(Collectors.toList());
    }
}
