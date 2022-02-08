package hashmap;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> cricketers = new HashMap<>();
        cricketers.put(7, "Dhoni");
        cricketers.put(26, "Kholi");
        cricketers.put(1, "Rohit");

        System.out.println(cricketers); // {1=Rohit, 7=Dhoni, 26=Kholi}
    }
}
