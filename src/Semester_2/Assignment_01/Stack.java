// Name: Andrii Yatsura
// Student ID: 19387
// Course: Algorithms and Data Structures
// University: Wroclaw Academy of Business

package Semester_2.Assignment_01;

public interface Stack<E> {
    int size();

    boolean isEmpty();

    void push(E e);

    E top();

    E pop();
}
