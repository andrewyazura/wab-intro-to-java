// Name: Andrii Yatsura
// Student ID: 19387
// Course: Algorithms and Data Structures
// University: Wroclaw Academy of Business

package Semester_2.Assignment_01;

public class RoundRobinScheduling {
    public static void roundRobinScheduling(int[] tasks, int quantum) {
        Queue<Integer> queue = new LinkedQueue<>();
        for (int task : tasks) {
            queue.enqueue(task);
        }

        while (!queue.isEmpty()) {
            int task = queue.dequeue();
            task -= quantum;

            if (task > 0) {
                queue.enqueue(task);
                System.out.println("Remaining time on a task: " + task);
                continue;
            }

            System.out.println("Task completed");
        }
    }

    public static void main(String[] args) {
        int[] tasks = { 5, 3, 8, 10, 1, 1, 4 };
        int quantum = 1;

        roundRobinScheduling(tasks, quantum);
    }
}
