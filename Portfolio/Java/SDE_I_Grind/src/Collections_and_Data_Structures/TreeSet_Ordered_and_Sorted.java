package Collections_and_Data_Structures;  // Treeset is O(log n)


import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;



        // comparator

        class Student1 {
            private String name;
            private int id;

            public Student1(String name, int id) {
                this.name = name;
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public int getId() {
                return id;
            }

            @Override
            public String toString() {
                return "Student{ " +
                        "name = " + name +
                        ", id = " + id +
                        "}";

            }
        }

public class TreeSet_Ordered_and_Sorted {
    public static void main(String[] args) {

        // Create a tree set of strings.

        /*
        Set<String> names = new TreeSet<>();

        names.add("Charlie");
        names.add("Lawrence");
        names.add("Johnny");
        names.add("Horatio");
        names.add("Squiggs");
        names.add("Andre");
        names.add("Juno");
        names.add("Charlie");

        System.out.println("List of names: " + names);
        // can remove with names.remove("name");
        // get size with int size = names.size();
        // System.out.println(size); */

        Set<Student1> students = new TreeSet<>(Comparator.comparing(Student1::getName));

        Student1 student1 = new Student1("Charlie", 3);
        Student1 student2 = new Student1("Ronnie", 4);
        Student1 student3 = new Student1("Harold", 2);
        Student1 student4 = new Student1("Mona", 1);

        for (Student1 s : List.of(student1, student2, student3, student4)) {
            students.add(s);
        }

        System.out.println("TreeSet of Students: " + students);

    }


    }

