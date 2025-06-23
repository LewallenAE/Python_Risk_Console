package Collections_and_Data_Structures;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSet_and_TreeSet {

    public static void main(String[] args) {

        // HashSet is unordered and fast with uniqueness for no duplicates.

        // create

        Set<String> names = new HashSet<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charles");

        System.out.println("HashSet: " + names);

        // check for containment
        boolean hasCharles = names.contains("Charles");

        System.out.println(hasCharles);

        // Size

        int size = names.size();
        System.out.println(size);

        names.remove("Charles");
        System.out.println("Size after removing Charles: " + size); // size is still 3
        System.out.println("Names: " + names); // no longer has charles
        System.out.println("Size: " + size); // still size 3.



    }
}
