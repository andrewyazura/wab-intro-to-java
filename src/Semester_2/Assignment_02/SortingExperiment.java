// Name: Andrii Yatsura
// Student ID: 19387
// Course: Algorithms and Data Structures
// University: Wroclaw Academy of Business

package Semester_2.Assignment_02;

import java.util.Random;
import java.util.Arrays;

public class SortingExperiment {
    private static final int[] SIZES = { 100, 1000, 10000, 100000, 500000, 1000000 };

    public static void main(String[] args) {
        Integer[][] arrays = new Integer[SIZES.length][];
        for (int i = 0; i < SIZES.length; i++) {
            arrays[i] = generateRandomArray(SIZES[i]);
        }

        runExperiments(arrays);
    }

    private static Integer[] generateRandomArray(int size) {
        Random random = new Random();
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    private static void runExperiments(Integer[][] arrays) {
        System.out.println("Array Size | Insertion Sort (ms) | Selection Sort (ms) | Heap Sort (ms)");

        for (Integer[] array : arrays) {
            Integer[] copy1 = Arrays.copyOf(array, array.length);
            Integer[] copy2 = Arrays.copyOf(array, array.length);
            Integer[] copy3 = Arrays.copyOf(array, array.length);

            long insertionTime = timeInsertionSort(copy1);
            long selectionTime = timeSelectionSort(copy2);
            long heapTime = timeHeapSort(copy3);

            System.out.printf("%10d | %18d | %17d | %14d\n", array.length, insertionTime,
                    selectionTime, heapTime);
        }
    }

    private static long timeInsertionSort(Integer[] array) {
        PriorityQueue<Integer, Void> pq = new SortedPriorityQueue<>();
        long startTime = System.nanoTime();
        PriorityQueueSort.priorityQueueSort(array, pq);
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000;
    }

    private static long timeSelectionSort(Integer[] array) {
        PriorityQueue<Integer, Void> pq = new UnsortedPriorityQueue<>();
        long startTime = System.nanoTime();
        PriorityQueueSort.priorityQueueSort(array, pq);
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000;
    }

    private static long timeHeapSort(Integer[] array) {
        PriorityQueue<Integer, Void> pq = new HeapPriorityQueue<>();
        long startTime = System.nanoTime();
        PriorityQueueSort.priorityQueueSort(array, pq);
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000;
    }
}
