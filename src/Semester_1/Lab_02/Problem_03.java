package Semester_1.Lab_02;

import java.util.Scanner;

public class Problem_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the subtotal in $: ");
        double subtotal = scanner.nextDouble();

        System.out.print("Enter the gratuity rate in %: ");
        double gratuityRate = scanner.nextDouble();

        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);

        scanner.close();
    }
}
