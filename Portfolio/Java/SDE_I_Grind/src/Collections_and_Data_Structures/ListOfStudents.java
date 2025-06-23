package Collections_and_Data_Structures;


import java.util.ArrayList;

public class ListOfStudents {
    private String name;
    private int id;
    private int age;
    private String gender;

    public ListOfStudents(String name, int id, int age, String gender) {

        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "ListOfStudents{" +
                "name='" + name + '\''+
                ", id= " + id +
                ", age= " + age +
                ", gender= " + gender +
                        '}';
    }

    public static void main(String[] args) {

        ArrayList<ListOfStudents> students = new ArrayList<>();

        students.add(new ListOfStudents("Michael", 248596, 23, "Male"));
        students.add(new ListOfStudents("Jennifer", 29384, 30, "Female"));
        students.add(new ListOfStudents("Micheal", 3944032, 45, "Non-Binary"));


        System.out.println(students);

        ListOfStudents secondStudent = students.get(1);
        System.out.println("Second student: " + secondStudent);

        // remove a student with :

        // students.remove(index)

    }


}

