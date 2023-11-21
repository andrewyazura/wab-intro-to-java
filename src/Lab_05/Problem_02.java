package Lab_05;

import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        input.close();

        int gcd = get_gcd(n1, n2);
        System.out.printf("The greatest common divisor of %d and %d is %d\n", n1, n2, gcd);
    }

    public static int get_gcd(int n1, int n2) {
        int d = Math.min(n1, n2);

        for (int i = d; i > 1; i--)
            if (n1 % i == 0 && n2 % i == 0)
                return i;

        return 1;
    }
}
