package amd;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class OperationOnSetCollectionEx1 {
    public static void main(String[] args) {
        // Creating two Sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>(Set.of(54, 25, 13));

        // Adding elements to the first Set
        set1.add(10);
        set1.add(2);
        set1.add(13);

        // Printing the original Sets
        System.out.println("Original set1: " + set1);
        System.out.println("Original set2: " + set2);

        // Merging elements of set2 into set1, the element 13 exist in both the set, duplicates are not allowed only one element will be there in merged list
        set1.addAll(set2);
        System.out.println("After merging set2 into set1: " + set1);

        // Adding an element at location 2
        set1.add(18);
        System.out.println("After Adding Element 18: " + set1);

        // Sorting the Elements (TreeSet is inherently sorted)
        Set<Integer> sortedSet = new TreeSet<>(set1);
        System.out.println("After Sorting: " + sortedSet);

        // Searching for element 18
        boolean found = sortedSet.contains(18);
        System.out.println("Element 18 Found: " + found);

        // Removing elements from set1
        set1.remove(2);
        set1.remove(3); // If you want to remove element at index 3, convert set1 to List or use another approach
        System.out.println("After removing elements from set1: " + set1);

        // Creating a subset of set1
        Set<Integer> subset = new HashSet<>(sortedSet);
        System.out.println("Subset of set1: " + subset);

        // Removing elements from subset
        subset.remove(1); // Remove the element 1 from subset
        System.out.println("After removing element from subset: " + subset);
        System.out.println("Original set1 after removing element from subset: " + set1);

        // Creating a new Set to store the elements of subset
        Set<Integer> newSet = new HashSet<>(subset);
        System.out.println("New set created from subset: " + newSet);
    }
}
