package Semester_1.Lab_05;

public class Problem_01 {
    public static void main(String[] args) {
        double base_tuition = 10000;
        double annual_interest_rate = 0.05;

        double tuition_in_ten_years = calculate_tuition(base_tuition, annual_interest_rate, 10);

        double four_years_total = calculate_total_cost(base_tuition, annual_interest_rate, 14)
                - calculate_total_cost(base_tuition, annual_interest_rate, 10);

        System.out.printf("Tuition in ten years: $%.2f\n", tuition_in_ten_years);
        System.out.printf("In 10 years, 4 years' worth of tuition would be $%.2f\n",
                four_years_total);
    }

    public static double calculate_tuition(double base_tuition, double annual_interest_rate,
            int years) {
        return base_tuition * Math.pow(1 + annual_interest_rate, years);
    }

    public static double calculate_total_cost(double base_tuition, double annual_interest_rate,
            int years) {
        double total_cost = 0;

        for (int i = 0; i < years; i++)
            total_cost += calculate_tuition(base_tuition, annual_interest_rate, i);

        return total_cost;
    }
}
