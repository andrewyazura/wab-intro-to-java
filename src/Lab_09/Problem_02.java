package Lab_09;

import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int m = scanner.nextInt();
        int n = 1;

        while (true) {
            int product = m * n;
            double squareRoot = Math.sqrt(product);

            if (squareRoot == (int) squareRoot)
                break;

            ++n;
        }

        System.out.printf("The smallest number n for m * n to be a perfect square is %.0f\n", n);
        scanner.close();
    }
}
