package Semester_1.Lab_01;

import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a distance in miles: ");
        double miles = scanner.nextDouble();

        double kilometers = miles * 1.609;
        System.out.println(miles + " miles is " + kilometers + " kilometers");

        scanner.close();
    }
}
