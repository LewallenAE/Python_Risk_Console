package Collections_and_Data_Structures;


import java.util.HashMap;
public class ChallengeHashMap {

    public static void main(String[] args) {


        HashMap<String, Double> groceryList = new HashMap<>();

        groceryList.put("Steak", 10.99);
        groceryList.put("Chicken", 8.99);
        groceryList.put("Milk", 2.99);
        groceryList.put("Chips", 3.59);
        groceryList.put("Banana", 10.50);

        double gSum = 0;

        for (Double value : groceryList.values()) {

            gSum += value;
        }

        double gSumFinal = gSum / groceryList.size();


        System.out.println(gSumFinal);
    }
}
