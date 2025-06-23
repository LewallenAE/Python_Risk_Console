package Collections_and_Data_Structures;

import java.util.Random;  // import Random utility
import java.util.ArrayList; // import ArrayList utility

public class ChallengeListManipulation {

    // create an arraylist with random numbers and return the intersection and union of both sets.

    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr1C = new ArrayList<>(arr1); // create a copy of arr 1

        for (int i = 0; i < 10; i++) {

            arr1.add(random.nextInt(10));
        }

        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr2C = new ArrayList<>(arr2); // create a copy of arr2


        // Note that the copies are for future challenges as a reference and this was just practice

        for (int i = 0; i < 10; i++) {

            arr2.add(random.nextInt(100));
        }

        // find the max of the arrayList

        int maxArr1 = 0;
        for (int j = 0; j < arr1.size(); j++) {
            if (maxArr1 < arr1.get(j)) {
                maxArr1 = arr1.get(j);
            }

            System.out.println("The max of arr1 is: " + maxArr1);
        }

        System.out.println("The max of arr1 is: " + maxArr1);


        int maxArr2 = 0;
        for (int k = 0; k < arr2.size(); k++) {
            if (maxArr2 < arr2.get(k)) {
                maxArr2 = arr2.get(k);
            }




        }
        System.out.println(maxArr1);
        System.out.println(maxArr2);

        System.out.println(arr1);
        System.out.println(arr2);
    }

}
