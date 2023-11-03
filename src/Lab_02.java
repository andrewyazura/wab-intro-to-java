import java.util.Scanner;

public class Lab_02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // write a program that reads radius and length of a cylinder
    // and computes its area and volume
    System.out.print("Enter the radius of a cylinder: ");
    double radius = scanner.nextDouble();

    System.out.print("Enter the length of a cylinder: ");
    double length = scanner.nextDouble();

    double area = radius * radius * Math.PI;
    double volume = area * length;

    System.out.println("The area is " + area);
    System.out.println("The volume is " + volume);

    // sum digits of an integer between 0 and 1000
    System.out.print("\n\n");
    System.out.print("Enter an integer between 0 and 1000: ");
    int number = scanner.nextInt();

    int sum = 0;
    while (number > 0) {
      sum += number % 10;
      number /= 10;
    }

    System.out.println("The sum of the digits is " + sum);

    // calculate tip for a given subtotal
    System.out.print("\n\n");
    System.out.print("Enter the subtotal in $: ");
    double subtotal = scanner.nextDouble();

    System.out.print("Enter the gratuity rate in %: ");
    double gratuityRate = scanner.nextDouble();

    double gratuity = subtotal * (gratuityRate / 100);
    double total = subtotal + gratuity;

    System.out.println("The gratuity is $" + gratuity + " and total is $" + total);

    // calculate average acceleration from starting and ending velocity in mps,
    // and time span in seconds
    System.out.println("\n\n");
    System.out.println("Enter starting velocity in m/s: ");
    double starting_velocity = scanner.nextDouble();

    System.out.println("Enter ending velocity in m/s: ");
    double ending_velocity = scanner.nextDouble();

    System.out.println("Enter time span in seconds: ");
    double time_span = scanner.nextDouble();

    double average_acceleration = (ending_velocity - starting_velocity) / time_span;
    System.out.println("The average acceleration is " + average_acceleration + " m/s^2");
  }
}
