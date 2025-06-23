package Collections_and_Data_Structures;

import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

class Student {

    private String name;
    private int age;
    private int id;

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;

    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", id=" + id +
                "}";
    }
}


public class UniqueHashSet {

    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        Student student1 = new Student("Alice", 21, 21);
        Student student2 = new Student("Charles", 35, 1);
        Student student3 = new Student("Niko", 40, 29);
        Student student4 = new Student("John", 40, 40);  // Notice this is added, even though Niko is also age 40.
        Student student5 = new Student("Ace", 32, 40); // Notice this is not added

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println("HashSet of students: " + students);
    }


}


