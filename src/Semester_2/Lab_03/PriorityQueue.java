package Semester_2.Lab_03;

/**
 *
 * @author lukaszjelen
 */
public interface PriorityQueue<K, V> {

    int size();

    boolean isEmpty();

    Entry<K, V> insert(K key, V value) throws IllegalArgumentException;

    Entry<K, V> min();

    Entry<K, V> removeMin();
}
