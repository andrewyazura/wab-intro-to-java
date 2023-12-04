package Assignment_02;

import java.util.ArrayList;

public class Course {
    String name;
    ArrayList<Student> students;

    public Course(String course_name) {
        name = course_name;
        students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public double average() {
        double sum = 0;

        for (Student student : students)
            sum += student.average();

        return sum / (double) students.size();
    }

    public void roll() {
        System.out.print("Students enrolled in " + name + " course:");

        for (Student student : students) {
            System.out.println();
            System.out.println(student.toString());
        }
    }
}
