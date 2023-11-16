// Name: Andrii Yatsura
// Student ID: 19387
// Course: Introduction to programming
// University: Wroclaw Academy of Business

package Assignment_01;

import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        double amount = input.nextDouble();

        input.close();

        double amountLeft = amount;

        int bills[] = {100, 50, 20, 10, 5, 1};
        double coins[] = {1, 0.25, 0.1, 0.05, 0.01};


        int billsCount[] = new int[bills.length];
        int coinsCount[] = new int[coins.length];

        for (int i = 0; i < bills.length; i++) {
            billsCount[i] = (int) Math.floor(amountLeft / bills[i]);
            amountLeft = amountLeft - billsCount[i] * bills[i];
        }

        for (int i = 0; i < coins.length; i++) {
            coinsCount[i] = (int) Math.floor(amountLeft / coins[i]);
            amountLeft = amountLeft - coinsCount[i] * coins[i];
        }

        System.out.println("The amount of " + amount + " can be represented as:");

        for (int i = 0; i < bills.length; i++)
            if (billsCount[i] != 0)
                System.out.println(billsCount[i] + " x " + bills[i] + " zloty");



        for (int i = 0; i < coins.length; i++)
            if (coinsCount[i] != 0)
                System.out.println(coinsCount[i] + " x " + coins[i] + " grosz");
    }
}
