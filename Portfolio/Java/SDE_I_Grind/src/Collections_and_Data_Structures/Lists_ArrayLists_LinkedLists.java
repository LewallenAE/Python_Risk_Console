package Collections_and_Data_Structures;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Lists_ArrayLists_LinkedLists {


    public static void main(String[] args) {


        List<Integer> s = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {

            s.add(i);

        }
        System.out.println(s);

        s.remove(5);

        System.out.println(s);

        Iterator<Integer> iterator = s.iterator();



        while(iterator.hasNext()){

            Integer sInt = iterator.next();

            if(sInt.equals(7)) {

                System.out.println("True");
            }

        //if (sInt.equals(7)) {

        // System.out.println("True");
        }

      //  }

        for (int i = 0; i < s.size(); i++) {
            if (i == 7) {
                System.out.println("True");
            }

            if (i == 5) { // but this removes the number 5 and not the index 5.
                s.remove(i);
            }
        }

        if (s.contains(7)) {

            System.out.println("True");
        }

        s.remove(5); // This removes index 5

        System.out.println(s);
    }
}
