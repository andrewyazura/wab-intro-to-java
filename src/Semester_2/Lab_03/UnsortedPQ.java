// Name: Andrii Yatsura
// Student ID: 19387
// Course: Algorithms and Data Structures
// University: Wroclaw Academy of Business

package Semester_2.Lab_03;

import java.util.Comparator;

public class UnsortedPQ<K, V> extends AbstractPriorityQueue<K, V> {
    private LinkedPositionalList<Entry<K, V>> list = new LinkedPositionalList<>();

    public UnsortedPQ() {
        super();
    }

    public UnsortedPQ(Comparator<K> comp) {
        super(comp);
    }

    public int size() {
        return list.size();
    }

    public Entry<K, V> removeMin() {
        if (list.isEmpty())
            return null;

        Position<Entry<K, V>> minPos = findMin();
        return (Entry<K, V>) list.remove(minPos);
    }

    public Entry<K, V> insert(K key, V value) throws IllegalArgumentException {
        checkKey(key);
        Entry<K, V> newest = new PQEntry<>(key, value);
        list.addLast(newest);
        return newest;
    }

    public Entry<K, V> min() {
        if (list.isEmpty())
            return null;

        Position<Entry<K, V>> minPos = findMin();
        return (Entry<K, V>) minPos.getElement();
    }

    private Position<Entry<K, V>> findMin() {
        Position<Entry<K, V>> minPos = list.first();
        for (Position<Entry<K, V>> pos : list.positions()) {
            if (compare(pos.getElement(), minPos.getElement()) < 0)
                minPos = pos;
        }
        return minPos;
    }

    public static void main(String[] args) {
        UnsortedPQ<Integer, String> pq = new UnsortedPQ<>();

        // the two min elements are 26 and 36
        Integer[] data = { 49, 58, 45, 81, 95, 26, 36, 75, 55, 55 };

        for (Integer num : data) {
            pq.insert(num, "Value " + num);
        }

        System.out.println("Priority Queue Keys:");
        for (Entry<Integer, String> entry : pq.list) {
            System.out.println(entry.getKey());
        }

        // expected output: 26
        System.out.println("Min: " + pq.min().getKey());
        System.out.println("Removing min: " + pq.removeMin().getKey());

        // expected output: 36
        System.out.println("New min: " + pq.min().getKey());
    }
}
