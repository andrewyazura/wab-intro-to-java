package Lab_03;

import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {
        // Write a program that reads a string from the user and prints it one character per line.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }

        scanner.close();
    }
}
