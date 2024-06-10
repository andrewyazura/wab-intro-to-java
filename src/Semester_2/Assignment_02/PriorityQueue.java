// Name: Andrii Yatsura
// Student ID: 19387
// Course: Algorithms and Data Structures
// University: Wroclaw Academy of Business

package Semester_2.Assignment_02;

public interface PriorityQueue<K, V> {
    int size();

    boolean isEmpty();

    Entry<K, V> insert(K key, V value) throws IllegalArgumentException;

    Entry<K, V> min();

    Entry<K, V> removeMin();
}
