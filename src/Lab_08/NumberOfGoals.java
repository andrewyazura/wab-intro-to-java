package Lab_08;

public class NumberOfGoals {
    private int goals = 0;

    public NumberOfGoals() {
        this.goals = 0;
    }

    public void setGoal() {
        ++this.goals;
    }

    public int getGoals() {
        return this.goals;
    }
}
