package Lab_08;

public class Circle {
    private double radius = 0.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        if (radius > 0.0) {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2.0);
    }

    public double getCircumference() {
        return 2.0 * Math.PI * this.radius;
    }

    public String toString() {
        return String.format("Circle:\nRadius: %.2f\nArea: %.2f\nCircumference: %.2f\n",
                this.radius, this.getArea(), this.getCircumference());
    }
}
