package Lab_03;

import java.util.Scanner;

public class Problem_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        System.out.print("Enter the third string: ");
        String thirdString = scanner.nextLine();

        int countE = 0, countT = 0, countN = 0;

        for (char c : firstString.toCharArray()) {
            if (c == 'e') {
                countE++;
            }
        }

        for (char c : secondString.toCharArray()) {
            if (c == 't') {
                countT++;
            }
        }

        for (char c : thirdString.toCharArray()) {
            if (c == 'n') {
                countN++;
            }
        }

        System.out.println("The letter 'e' appears " + countE + " times in the first string.");
        System.out.println("The letter 't' appears " + countT + " times in the second string.");
        System.out.println("The letter 'n' appears " + countN + " times in the third string.");

        scanner.close();
    }
}
