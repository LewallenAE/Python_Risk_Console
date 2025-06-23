package Collections_and_Data_Structures;


import java.util.ArrayList;
import java.util.Iterator;

public class Java_Collections_Framework {

    public static void main(String[] args) {

        // consists of ArrayList, LinkedList, HashSet,TreeSet, HashMap, TreeMap, PriorityQueue.


        ArrayList<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");


        String name1 = names.get(0); // get the name at index 0


        // Iterator

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String nameIt = iterator.next();
            System.out.println(nameIt);

            // Remove bob

            if (nameIt.equals("Bob")) {  // removes bob while iterating
                iterator.remove();
            }
        }

        //System.out.println(name1);
        System.out.println(names);
    }
}
