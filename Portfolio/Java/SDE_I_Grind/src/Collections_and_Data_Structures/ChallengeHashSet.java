package Collections_and_Data_Structures;

import java.util.HashSet;

public class ChallengeHashSet {

    public static void main(String[] args) {


        HashSet<String> s = new HashSet<>();

        s.add("Jeff");
        s.add("tony");
        s.add("Frank");
        s.add("John");
        s.add("Emily");
        s.add("Jason");

        HashSet<String> s2 = new HashSet<>();

        s2.add("jeff");
        s2.add("tony");
        s2.add("frank");
        s2.add("John");
        s2.add("emily");
        s2.add("Tommy");

        HashSet<String> s3 = new HashSet<>(s);


        s3.retainAll(s2);

        System.out.println("Intersection of s and s2 saved to s3: " + s3);
        System.out.println("The union of s and s2: " + s + s2);

    }
}
