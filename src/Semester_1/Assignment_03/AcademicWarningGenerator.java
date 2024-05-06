// Name: Andrii Yatsura
// Student ID: 19387
// Course: Introduction to programming
// University: Wroclaw Academy of Business

package Semester_1.Assignment_03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AcademicWarningGenerator {
    public static void main(String[] args) {
        File inputFile = getExistingFile();
        writeWarningsToFile(inputFile, "warnings.txt");

        System.out.println("Done.");
    }

    public static void writeWarningsToFile(File inputFile, String outputFileName) {
        Scanner inputScanner = null;
        PrintWriter outFile = null;

        try {
            inputScanner = new Scanner(inputFile);
            outFile = new PrintWriter(new FileWriter(outputFileName));

            while (inputScanner.hasNext()) {
                String name = inputScanner.next();
                int creditHours = inputScanner.nextInt();
                double qualityPoints = inputScanner.nextDouble();

                double gpa = qualityPoints / creditHours;

                if (shouldWarnStudent(creditHours, gpa)) {
                    outFile.println(name + " " + creditHours + " " + gpa);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Number format exception: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO exception: " + e.getMessage());
        } finally {
            if (inputScanner != null) {
                inputScanner.close();
            }
            if (outFile != null) {
                outFile.close();
            }
        }
    }

    public static File getExistingFile() {
        Scanner console = new Scanner(System.in);

        File inputFile;

        do {
            System.out.print("Enter the name of the input file: ");
            String fileName = console.next();
            inputFile = new File(fileName);
        } while (!inputFile.exists());

        console.close();
        return inputFile;
    }

    private static boolean shouldWarnStudent(int creditHours, double gpa) {
        if (creditHours < 30)
            return gpa < 1.5;
        if (creditHours < 60)
            return gpa < 1.75;
        return gpa < 2.0;
    }
}
