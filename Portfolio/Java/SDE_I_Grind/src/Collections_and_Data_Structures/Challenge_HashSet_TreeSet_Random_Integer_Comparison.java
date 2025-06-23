package Collections_and_Data_Structures;

import java.util.*;

public class Challenge_HashSet_TreeSet_Random_Integer_Comparison {

    public static void main(String[] args) {

        Set<Integer> hash = new HashSet<>();
        Set<Integer> tree = new TreeSet<>();

        long hashAdd = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            hash.add(i);
        }
        long endHashAdd = System.nanoTime();



        long treeAdd = System.nanoTime();
        for (int k = 0; k < 100_000; k++) {
            tree.add(k);
        }
        long endTreeAdd = System.nanoTime();

        long hashLookupStart = System.nanoTime();
        boolean hasInHash = hash.contains(95_000);
        long hashLookupEnd = System.nanoTime();

        long treeLookupStart = System.nanoTime();
        boolean hasInTree = tree.contains(95_000);
        long treeLookupEnd = System.nanoTime();

        /*System.out.print(hash);
        System.out.print(tree);*/

        System.out.println("Hash add in nano time: " + (endHashAdd - hashAdd) / 1_000_000);
        System.out.println("Tree add in nano time: " + (endTreeAdd - treeAdd) / 1_000_000);

        if (hasInHash) {
            System.out.println("Hash lookup time: " + (hashLookupEnd - hashLookupStart) / 1_000_000 + " in ms.");
        }

        if (hasInTree) {
            System.out.println("Tree lookup time: " + (treeLookupEnd - treeLookupStart) / 1_000_000 + " in ms.");
        }


    }
}
