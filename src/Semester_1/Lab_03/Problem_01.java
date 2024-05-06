package Semester_1.Lab_03;

import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();

        if (input < 0) {
            System.out.println("Error: Input value is less than 0.");
            System.exit(1);
        }

        int sum = 0;
        int count = 0;

        for (int i = 0; i <= input; i++) {
            if (i % 2 != 0) {
                sum += i;
                count++;
            }
        }

        System.out.println(
                "Average of all odd integers between 0 and " + input + " is " + (sum / count));

        scanner.close();
    }
}
