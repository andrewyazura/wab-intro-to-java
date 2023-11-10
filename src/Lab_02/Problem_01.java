package Lab_02;

import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of a cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the length of a cylinder: ");
        double length = scanner.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);

        scanner.close();
    }
}
