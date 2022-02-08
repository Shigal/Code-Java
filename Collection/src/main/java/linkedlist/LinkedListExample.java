package linkedlist;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        list.remove(); // removed first element: 5
        System.out.println(list); // [10, 15, 20, 25]


        list.add(3, 30);
        System.out.println(list); // [10, 15, 20, 30, 25]
    }
}
