package models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 50000));
        students.add(new Student("Bob", 60000));
        students.add(new Student("Charlie", 45000));
        students.add(new Student("David", 70000));
        students.add(new Student("Eve", 55000));

        students.stream().sorted(Comparator.comparingDouble(Student::getMarks).reversed()).limit(3).forEach(System.out::println);

        double sum = students.stream().mapToDouble(Student::getMarks).sum();
        System.out.println(sum/students.size());
    }
}
