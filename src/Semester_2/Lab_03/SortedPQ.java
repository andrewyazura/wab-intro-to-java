package Semester_2.Lab_03;

import java.util.Comparator;

public class SortedPQ<K, V> extends AbstractPriorityQueue<K, V> {
    private LinkedPositionalList<Entry<K, V>> list = new LinkedPositionalList<>();

    public SortedPQ() {
        super();
    }

    public SortedPQ(Comparator<K> comp) {
        super(comp);
    }

    public int size() {
        return list.size();
    }

    public Entry<K, V> removeMin() {
        if (list.isEmpty())
            return null;
        return (Entry<K, V>) list.remove(list.first());
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
        return (Entry<K, V>) newest;
    }

    public Entry<K, V> min() {
        if (list.isEmpty())
            return null;
        return (Entry<K, V>) list.first().getElement();
    }
}
