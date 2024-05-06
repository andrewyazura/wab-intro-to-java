package Semester_1.Lab_08;

public class MultiCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(10.0);

        System.out.println(circle1);
        System.out.println(circle2);

        circle1.setRadius(7.0);
        circle2.setRadius(15.0);

        System.out.println(circle1);
        System.out.println(circle2);
    }
}
