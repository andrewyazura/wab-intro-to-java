package Assignment_02;

public class Student {
    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    private int[] testScores = new int[3];

    public Student(String first, String last, Address home, Address school, int math_test,
            int english_test, int science_test) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;

        testScores[0] = math_test;
        testScores[1] = english_test;
        testScores[2] = science_test;
    }

    public Student(String first, String last, Address home, Address school) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;

        for (int i = 0; i < testScores.length; ++i)
            testScores[i] = 0;
    }

    public void setTestScore(int subject, int score) {
        if (subject < 0 || subject >= testScores.length)
            System.out.println("Invalid subject number. Please provide a number between 0 and "
                    + (testScores.length - 1) + ".");

        testScores[subject] = score;
    }

    public int getTestScore(int subject) {
        if (subject < 0 || subject >= testScores.length) {
            System.out.println("Invalid subject number. Please provide a number between 0 and "
                    + (testScores.length - 1) + ".");
            return -1;
        }

        return testScores[subject];
    }

    public double average() {
        int sum = 0;

        for (int element : testScores)
            sum += element;

        return sum / 3.0;
    }

    public String toString() {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += "Math Test Score: " + testScores[0] + "\n";
        result += "English Test Score: " + testScores[1] + "\n";
        result += "Science Test Score: " + testScores[2] + "\n";
        result += "Average Score: " + average();

        return result;
    }
}
