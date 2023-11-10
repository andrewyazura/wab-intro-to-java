package Lab_02;

import java.util.Scanner;

public class Problem_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter starting velocity in m/s: ");
        double starting_velocity = scanner.nextDouble();

        System.out.println("Enter ending velocity in m/s: ");
        double ending_velocity = scanner.nextDouble();

        System.out.println("Enter time span in seconds: ");
        double time_span = scanner.nextDouble();

        double average_acceleration = (ending_velocity - starting_velocity) / time_span;
        System.out.println("The average acceleration is " + average_acceleration + " m/s^2");

        scanner.close();
    }
}
