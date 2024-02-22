import java.util.*;

public class treesetExample {
    public static void main(String[] args){
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Print the contents of the TreeSet
        System.out.println("Contents of the TreeSet: " + treeSet);

        // Check if the TreeSet contains a specific element
        System.out.println("Contains 30? " + treeSet.contains(30));

        // Remove an element from the TreeSet
        treeSet.remove(30);
        System.out.println("After removing 30: " + treeSet);

        // Iterate over the TreeSet using an iterator
        System.out.println("Iterating over TreeSet using Iterator:");
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Get the first and last elements of the TreeSet
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());

        // Get a subset of the TreeSet
        System.out.println("Subset (inclusive) from 20 to 40: " + treeSet.subSet(20, true, 40, true));

        // Clear the TreeSet
        treeSet.clear();
        System.out.println("After clearing TreeSet: " + treeSet);
    }
}
