package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterator {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Canada");
        list.add("Australia");
        list.add("Malaysia");
        list.add("Dubai");

        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
