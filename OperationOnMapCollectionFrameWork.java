package amd;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OperationOnMapCollectionFrameWork {
    public static void main(String[] args) {
        // Creating two Maps
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        
        // Adding elements to the first Map
        map1.put(0, 10);
        map1.put(1, 2);
        map1.put(2, 13);

        // Adding elements to the second Map
        map2.put(0, 54);
        map2.put(3, 25);
        map2.put(4, 13);

        // Printing the original Maps
        System.out.println("Original map1: " + map1);
        System.out.println("Original map2: " + map2);

        // Merging elements of map2 into map1
        map1.putAll(map2);
        System.out.println("After merging map2 into map1: " + map1);

        // Adding an element with a specific key
        map1.put(2, 18);
        System.out.println("After Adding Element at key 2: " + map1);

        // Sorting the Elements (Maps don't maintain order, so no explicit sorting needed)
        // Searching for key 2
        boolean found = map1.containsKey(2);
        System.out.println("Key 2 Found: " + found);
        
        boolean foundvalue = map1.containsValue(13);
        if(foundvalue) System.out.println("The Value 13 Found");
        else System.out.println("The Value 13 Not Found");
        

        // Removing elements from map1
        map1.remove(1); // Remove the element with key 1
        System.out.println("After removing element from map1: " + map1);

        // Creating a new Map to store the elements of map1
        Map<Integer, Integer> newMap = new HashMap<>(map1);
        System.out.println("New map created from map1: " + newMap);
    }
}
