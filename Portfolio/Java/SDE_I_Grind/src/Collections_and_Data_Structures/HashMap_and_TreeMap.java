package Collections_and_Data_Structures;


import java.util.*;

public class HashMap_and_TreeMap {

public static void main(String[] args) {

    Map<String, Integer> studentGrades = new HashMap<>();

    studentGrades.put("Alice", 95);
    studentGrades.put("John", 50);
    studentGrades.put("Myron", 100);
    studentGrades.put("Clarence", 100);
    studentGrades.put("Keegan", 95);

    if (studentGrades.containsKey("Alice")) {
        System.out.println("Alice's grade is in the map.");
    }

    if (studentGrades.containsValue(100)) {
        System.out.println("Someone got a 100!");
    }

   // studentGrades.remove("Myron");
    System.out.println(studentGrades);

    for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }

    for (String key : studentGrades.keySet()) {
        System.out.println("Key: " + key + ", Grade: " + studentGrades.get(key));
    }

}

}
