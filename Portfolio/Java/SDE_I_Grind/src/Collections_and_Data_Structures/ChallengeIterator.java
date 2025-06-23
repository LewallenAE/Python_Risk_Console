package Collections_and_Data_Structures;


import java.util.Iterator;
import java.util.ArrayList;

public class ChallengeIterator {


    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("John");
        names.add("Shawn");
        names.add("James");
        names.add("Alicia");
        names.add("Veronica");
        names.add("Sophie");
        names.add("Ryan");
        names.add("Frank");
        names.add("Corinthea");
        names.add("Victoria");

        System.out.println("All names: " + names);

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String namesIt = iterator.next();

            if (namesIt.contains("a")) {
                iterator.remove();
            }

        }

        System.out.println("List of names after removal: " + names);

    }
}
