// Name: Andrii Yatsura
// Student ID: 19387
// Course: Algorithms and Data Structures
// University: Wroclaw Academy of Business

package Semester_2.Assignment_02;

public class SortedPriorityQueue<K, V> extends AbstractPriorityQueue<K, V> {
    private LinkedPositionalList<Entry<K, V>> list = new LinkedPositionalList<>();

    public SortedPriorityQueue() {
        super();
    }

    public SortedPriorityQueue(DefaultComparator<K> comp) {
        super(comp);
    }

    public Entry<K, V> insert(K key, V value) throws IllegalArgumentException {
        checkKey(key);
        Entry<K, V> newest = new PQEntry<>(key, value);
        Position<Entry<K, V>> walk = list.last();
        while (walk != null && compare(newest, walk.getElement()) < 0)
            walk = list.before(walk);
        if (walk == null)
            list.addFirst(newest);
        else
            list.addAfter(walk, newest);
        return newest;
    }

    public Entry<K, V> min() {
        if (list.isEmpty())
            return null;
        return list.first().getElement();
    }

    public Entry<K, V> removeMin() {
        if (list.isEmpty())
            return null;
        return list.remove(list.first());
    }

    public int size() {
        return list.size();
    }
}
