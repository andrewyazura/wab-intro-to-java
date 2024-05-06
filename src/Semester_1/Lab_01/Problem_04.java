package Semester_1.Lab_01;

import java.util.Scanner;

public class Problem_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting odometer reading: ");
        int startingOdometer = scanner.nextInt();

        System.out.print("Enter the ending odometer reading: ");
        int endingOdometer = scanner.nextInt();

        System.out.print("Enter the amount of refueled gas: ");
        double refueledGas = scanner.nextDouble();

        double fuelConsumption = (refueledGas / (endingOdometer - startingOdometer)) * 100;
        System.out.println("The fuel consumption is " + fuelConsumption + " liters per 100 km");

        scanner.close();
    }
}
