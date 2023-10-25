import java.util.Scanner;

public class Lab_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // read three integers and display their average
        System.out.print("Enter an integer: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter another integer: ");
        int number2 = scanner.nextInt();

        System.out.print("And the last one: ");
        int number3 = scanner.nextInt();

        int average = (number1 + number2 + number3) / 3;
        System.out.println("The average of " + number1 + " + " + number2 + " + " + number3 + " = " + average);

        // convert an input distance in miles into kilometers
        System.out.print("\n\n");
        System.out.print("Enter a distance in miles: ");
        double miles = scanner.nextDouble();

        double kilometers = miles * 1.609;
        System.out.println(miles + " miles is " + kilometers + " kilometers");

        // read an integer number representing a number of seconds and convert it
        // into hours, minutes, and seconds, ex: 9999 sec = 2 hours, 46 minutes, 39 seconds
        System.out.print("\n\n");
        System.out.print("Enter a number of seconds: ");
        int seconds = scanner.nextInt();

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        System.out.println(seconds + " seconds is " + hours + " hours, " + minutes + " minutes, and " + remainingSeconds + " seconds");

        // write a simple console application that calculates car fuel consumption (liters per 100 km)
        // on a given trip. User should be allowed to enter a starting and ending odometer readings
        // as well as the amount of refueled gas
        System.out.print("\n\n");
        System.out.print("Enter the starting odometer reading: ");
        int startingOdometer = scanner.nextInt();

        System.out.print("Enter the ending odometer reading: ");
        int endingOdometer = scanner.nextInt();

        System.out.print("Enter the amount of refueled gas: ");
        double refueledGas = scanner.nextDouble();

        double fuelConsumption = (refueledGas / (endingOdometer - startingOdometer)) * 100;
        System.out.println("The fuel consumption is " + fuelConsumption + " liters per 100 km");
    }
}
