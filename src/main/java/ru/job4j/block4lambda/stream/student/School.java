package ru.job4j.block4lambda.stream.student;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {

    public static List<Student> collect(List<Student> students,
                                        Predicate<Student> predicate) {
        List<Student> rsl = students.stream()
                .filter(predicate)
                .collect(Collectors.toList());
        return rsl;
    }

    public static List<Student> classA(List<Student> students) {
        Predicate<Student> getStudentsClassA = student ->
                student.getScore() >= 70 && student.getScore() <= 100;
        return collect(students, getStudentsClassA);
    }

    public static List<Student> classB(List<Student> students) {
        Predicate<Student> getStudentsClassB = student ->
                student.getScore() >= 50 && student.getScore() <= 70;
        return collect(students, getStudentsClassB);
    }

    public static List<Student> classV(List<Student> students) {
        Predicate<Student> getStudentsClassV = student ->
                student.getScore() >= 0 && student.getScore() <= 50;
        return collect(students, getStudentsClassV);
    }

}

