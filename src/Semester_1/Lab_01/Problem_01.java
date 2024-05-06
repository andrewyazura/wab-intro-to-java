package Semester_1.Lab_01;

import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter another integer: ");
        int number2 = scanner.nextInt();

        System.out.print("And the last one: ");
        int number3 = scanner.nextInt();

        int average = (number1 + number2 + number3) / 3;
        System.out.println(
                "The average of " + number1 + " + " + number2 + " + " + number3 + " = " + average);

        scanner.close();
    }
}
