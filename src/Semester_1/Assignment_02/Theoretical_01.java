package Semester_1.Assignment_02;

import java.util.Random;

class Color {
    private int red;
    private int green;
    private int blue;

    public Color(int red, int green, int blue) {
        this.red = validateColorValue(red);
        this.green = validateColorValue(green);
        this.blue = validateColorValue(blue);
    }

    private int validateColorValue(int value) {
        return Math.min(255, Math.max(0, value));
    }

    @Override
    public String toString() {
        return ("Color(red=" + red + ", green=" + green + ", blue=" + blue + ')');
    }
}


public class Theoretical_01 {
    public static Color randomColor() {
        Random rand = new Random();
        int red = rand.nextInt(256);
        int green = rand.nextInt(256);
        int blue = rand.nextInt(256);

        return new Color(red, green, blue);
    }

    public static void main(String[] args) {
        Color randomColor = randomColor();

        System.out.println("Random Color: " + randomColor.toString());
    }
}
