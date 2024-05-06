// Name: Andrii Yatsura
// Student ID: 19387
// Course: Introduction to programming
// University: Wroclaw Academy of Business

package Semester_1.Assignment_01;

public class Problem_02 {
    public static void main(String[] args) {
        int base = (int) (Math.random() * 20) + 10;
        int height = (int) (Math.random() * 20) + 10;
        int side = (int) (Math.random() * 20) + 10;

        int area = base * height;
        int perimeter = 2 * (base + side);

        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Side: " + side);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
