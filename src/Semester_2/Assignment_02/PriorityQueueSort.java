package Semester_2.Assignment_02;

public class PriorityQueueSort {
    public static <K> void priorityQueueSort(K[] array, PriorityQueue<K, Void> pq) {
        for (K element : array) {
            pq.insert(element, null);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = pq.removeMin().getKey();
        }
    }
}
