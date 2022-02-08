package arraylist;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveTypes {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // In array list, we are supposed to add only objects
        // When we add int value 1, it is automatically converted to new Integer(1)
        numbers.add(1);

        // get element from arraylist
        System.out.println(numbers.get(0));
    }
}
