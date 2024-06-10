// Name: Andrii Yatsura
// Student ID: 19387
// Course: Algorithms and Data Structures
// University: Wroclaw Academy of Business

package Semester_2.Assignment_02;

import java.util.Comparator;

public class DefaultComparator<E> implements Comparator<E> {
    public int compare(E a, E b) throws ClassCastException {
        return ((Comparable<E>) a).compareTo(b);
    }
}
