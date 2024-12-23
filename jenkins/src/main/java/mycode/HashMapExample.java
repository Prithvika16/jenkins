package mycode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Step 1: Create a HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Step 2: Add 4 items to the HashMap
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Cherry");
        hashMap.put(4, "Mango");

        // Step 3: Print the entire HashMap
        System.out.println("HashMap: " + hashMap);

        // Step 4: Access and print the 3rd item (simulated by iteration)
        int index = 0;
        String thirdItem = null;

        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            index++;
            if (index == 3) {
                thirdItem = entry.getValue();
                break;
            }
        }

        System.out.println("3rd item in the HashMap: " + thirdItem);
    }
}

