package Lab_01;

import java.util.Scanner;

public class Problem_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number of seconds: ");
        int seconds = scanner.nextInt();

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        System.out.println(seconds + " seconds is " + hours + " hours, " + minutes
                + " minutes, and " + remainingSeconds + " seconds");

        scanner.close();
    }
}
