import java.util.*;
public class HashSetExample {
    //In Java, a set is a collection that does not allow duplicate elements.
    // It models the mathematical set abstraction and provides various operations for manipulating sets, such as adding elements,
    // removing elements, checking for containment, and performing set operations
    // like union, intersection, and difference.
    public static void main(String[] args){
        System.out.println("hello from anand");

        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(11);
        set.add(10);
        set.add(12);
        set.add(12);


        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.contains(12));

    }
}
