package Semester_1.Lab_08;

public class GoalTracker {
    public static void main(String[] args) {
        NumberOfGoals goals = new NumberOfGoals();

        System.out.println(goals.getGoals());

        goals.setGoal();
        goals.setGoal();
        goals.setGoal();

        System.out.println(goals.getGoals());
    }
}
