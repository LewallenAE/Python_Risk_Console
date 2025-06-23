package Collections_and_Data_Structures;

import java.util.HashSet;

public class UniqueNames {



    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();


        boolean addedAlice = names.add("Alice");
        boolean addedBob = names.add("Bob");
        boolean addedAliceAgain = names.add("Alice");

        System.out.println("Alice added: " + addedAlice);
        System.out.println("Bob added: " + addedBob);
        System.out.println("Alice added again: " + addedAliceAgain);

        System.out.println("Full set of usernames: " + names);

    }
}
