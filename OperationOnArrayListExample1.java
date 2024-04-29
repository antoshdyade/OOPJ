package amd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OperationOnArrayListExample1 {
    public static void main(String[] args) {
        // Creating two ArrayLists
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>(List.of(54,25,13));

        // Adding elements to the first ArrayList
        list1.add(10);
        list1.add(2);
        list1.add(13);
       

        // Printing the original ArrayLists
        System.out.println("Original list1: " + list1);
        System.out.println("Original list2: " + list2);
        
         // Adding all elements of list2 to list1
        list1.addAll(list2);
        System.out.println("After merging list2 into list1: " + list1);

        //Adding an element at location 2
        
        list1.add(2, 18);
        System.out.println("After Adding Element at location 2: "+list1);
        
        //Sorting the Elements
        Collections.sort(list1);
        System.out.println("After Sorting: "+list1);
        
        //Searching the Element using Binary Search
        int location=Collections.binarySearch(list1, 18);
        System.out.println("The Element 18 Found at location "+location);
        
        // Removing elements from list1
        list1.remove(Integer.valueOf(2)); // Remove the element with value 2
        list1.remove(3); // Remove the element at index 3
        System.out.println("After removing elements from list1: " + list1);

        // Creating a sublist of list1
        List<Integer> sublist = list1.subList(1, 4); // sublist from index 1 (inclusive) to 4 (exclusive)
        System.out.println("Sublist of list1: " + sublist);

        // Removing elements from sublist
        sublist.remove(1); // Remove the element at index 1 from sublist
        System.out.println("After removing element from sublist: " + sublist);
        System.out.println("Original list1 after removing element from sublist: " + list1);

        // Creating a new ArrayList to store the elements of sublist
        List<Integer> newList = new ArrayList<>(sublist);
        System.out.println("New list created from sublist: " + newList);
    }
}
