package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateArrayList {
    public static void main(String[] args) {
        // non-generic arraylist - not popular
        ArrayList list = new ArrayList();

        // generic arraylist with default capacity(16)
        List<Integer> list1 = new ArrayList<>();

        // generic arraylist with capacity 3
        List<String> names = new ArrayList<>(3);

        // generic arraylist initialized with another collection
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 4, 5, 6));
    }
}
