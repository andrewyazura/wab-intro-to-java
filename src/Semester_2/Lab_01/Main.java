// Name: Andrii Yatsura
// Student ID: 19387
// Course: Algorithms and Data Structures
// University: Wroclaw Academy of Business

package Semester_2.Lab_01;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);

        System.out.println("List size: " + list.size());
        System.out.println("List contents:");
        System.out.println(list.first());
        System.out.println(list.last());

        System.out.println("Removing elements:");
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());

        list.addFirst(3);
        list.addLast(1);

        System.out.println("List size: " + list.size());
        System.out.println("List contents:");
        System.out.println(list.first());
        System.out.println(list.last());
    }
}
