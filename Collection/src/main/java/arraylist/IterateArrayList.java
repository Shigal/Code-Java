package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterateArrayList {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,3,5,7));
        Iterator<Integer> myIterator = integerList.iterator();
        System.out.println(integerList); // [1, 3, 5, 7]

        // to iterate the elements in the arraylist
        while (myIterator.hasNext()){
            // next() returns the element at current index loc, and increment the index count
            System.out.println(myIterator.next());
        }

        for (int i=0; i<integerList.size(); i++){
            System.out.println(integerList.get(i));
        }

        for(int i : integerList){
            System.out.println(i);
        }

        integerList.forEach(i -> System.out.println(i));
        integerList.forEach(System.out::println);
    }
}
