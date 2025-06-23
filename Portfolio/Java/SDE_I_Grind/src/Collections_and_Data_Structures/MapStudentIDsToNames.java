package Collections_and_Data_Structures;

import java.util.HashMap;
public class MapStudentIDsToNames {

    public static void main(String[] args) {

        // Key value pair ID is the key string is the value so we use HashMap.
        HashMap<Integer, String> studentIdToName = new HashMap<>();

        studentIdToName.put(101, "Alice");
        studentIdToName.put(102, "Bob");
        studentIdToName.put(103, "John");
        studentIdToName.put(104, "Jane");

        String name = studentIdToName.get(102);
        System.out.println("The name of the student with ID 102 is: " + name);

        System.out.println("The name of the student with ID 103 is: " + studentIdToName.get(103));

        boolean containsId104 = studentIdToName.containsKey(104);
        System.out.println("Does Jane contain the student ID 104? " + containsId104);

        System.out.println("The full HashMap of students: " + studentIdToName);


    }
}
