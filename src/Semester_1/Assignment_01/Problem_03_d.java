// Name: Andrii Yatsura
// Student ID: 19387
// Course: Introduction to programming
// University: Wroclaw Academy of Business

package Semester_1.Assignment_01;

public class Problem_03_d {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i += 2)
            System.out.println(" ".repeat((10 - i) / 2) + "*".repeat(i));

        for (int i = 9; i > 0; i -= 2)
            System.out.println(" ".repeat((10 - i) / 2) + "*".repeat(i));
    }
}
