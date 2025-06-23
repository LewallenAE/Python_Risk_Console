package Collections_and_Data_Structures;


import java.util.*;

public class ChallengeHashSet2 {

    public static void main(String[] args) {

        Set<Integer> n = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            n.add(i);
        }

        System.out.println("HashSet of numbers: " + n);

        Iterator<Integer> iterator = n.iterator();

        while(iterator.hasNext()) {
            int k = iterator.next();
            if (k == 0 || k % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("Even numbers removed: " + n);

    }
}
