package ru.job4j.block4lambda.stream.student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentList {

    public static Map<String, Student> getStudentList(List<Student> students) {
        Map<String, Student> result = students
                .stream()
                .collect(Collectors.toMap(
                        Student::getSurname,
                        Function.identity()
                ));
        return result;
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(75, "Ivanov"),
                new Student(10, "Pteerov"),
                new Student(50, "Sidorov"),
                new Student(76, "Antonov")
        );
        System.out.println(getStudentList(students));
    }
}
