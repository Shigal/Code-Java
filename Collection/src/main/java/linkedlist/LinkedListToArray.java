package linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListToArray {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("apple");
        list.add("orange");
        list.add("strawberry");
        System.out.println(list); // [apple, orange, strawberry]

        // linkedlist to array
        String[] array = new String[list.size()];
        list.toArray(array);
        System.out.println(array[0]); // apple
        System.out.println(Arrays.toString(array)); // [apple, orange, strawberry]

        // Array to linkedlist
        LinkedList<String> list1 = new LinkedList<>(Arrays.asList(array));
        System.out.println(list1); // [apple, orange, strawberry]


    }
}
