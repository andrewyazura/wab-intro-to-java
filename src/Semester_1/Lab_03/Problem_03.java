package Semester_1.Lab_03;

public class Problem_03 {
    public static void main(String[] args) {
        String[] employee_names =
                {"John", "Jane", "Jack", "Jill", "James", "Jenny", "Joe", "Jade", "Jade", "Jade"};
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        int[][] workload_per_day = new int[10][5];

        // fill workload_per_day with random values from 0 to 10
        for (int i = 0; i < 5; ++i)
            for (int j = 0; j < 10; ++j)
                workload_per_day[j][i] = (int) (Math.random() * 11);


        System.out.print("Employee\t");
        for (int i = 0; i < 10; ++i)
            System.out.printf("%-6s", employee_names[i]);

        for (int i = 0; i < 5; ++i) {
            System.out.println();
            System.out.printf("%-10s\t", weekdays[i]);

            for (int j = 0; j < 10; ++j)
                System.out.printf("%-6d", workload_per_day[j][i]);
        }
    }
}
