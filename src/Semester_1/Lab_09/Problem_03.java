package Semester_1.Lab_09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        for (int row = 0; row < matrix.length; ++row)
            for (int col = 0; col < matrix[row].length; ++col)
                matrix[row][col] = (int) (Math.random() * 2);

        System.out.println("The random matrix is");
        for (int[] row : matrix) {
            for (int col : row)
                System.out.print(col + " ");

            System.out.println();
        }

        ArrayList<Integer> rowSums = new ArrayList<Integer>();
        ArrayList<Integer> colSums = new ArrayList<Integer>();

        for (int row = 0; row < matrix.length; ++row) {
            int sum = 0;
            for (int col = 0; col < matrix[row].length; ++col)
                sum += matrix[row][col];

            rowSums.add(sum);
        }

        for (int col = 0; col < matrix[0].length; ++col) {
            int sum = 0;
            for (int row = 0; row < matrix.length; ++row)
                sum += matrix[row][col];

            colSums.add(sum);
        }

        int maxRowSum = Collections.max(rowSums);
        int maxColSum = Collections.max(colSums);

        System.out.printf("The largest row index %d with sum %d\n", rowSums.indexOf(maxRowSum),
                maxRowSum);
        System.out.printf("The largest column index %d with sum %d\n", colSums.indexOf(maxColSum),
                maxColSum);

        scanner.close();
    }
}
