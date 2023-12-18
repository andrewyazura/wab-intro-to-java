package Lab_09;

import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of points: ");
        int numberOfPoints = scanner.nextInt();

        System.out.printf("Enter %d points in clockwise order\n", numberOfPoints);
        double[][] points = new double[numberOfPoints + 1][2];

        for (int i = points.length - 1; i > 0; --i) {
            System.out.printf("Enter coordinates for point #%d:\n", points.length - i);
            points[i][0] = scanner.nextDouble();
            points[i][1] = scanner.nextDouble();
        }

        // copy the last point to avoid dealing with the last product
        points[0][0] = points[points.length - 1][0];
        points[0][1] = points[points.length - 1][1];

        double firstSum = 0;
        double secondSum = 0;

        for (int i = 0; i < points.length - 1; ++i) {
            firstSum += points[i][0] * points[i + 1][1];
            secondSum += points[i][1] * points[i + 1][0];
        }

        double area = 0.5 * (firstSum - secondSum);
        System.out.printf("The total area is %.2f\n", area);

        scanner.close();
    }
}
