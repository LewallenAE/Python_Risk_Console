package Collections_and_Data_Structures;


import java.util.*;

public class Stream {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "bob", "tom", "ren", "Stimpy");

        names.stream().forEach(name -> System.out.println("Name: " + name));


        List<String> names1 = Arrays.asList("Alice", "bob", "tom", "ren", "Stimpy", "Rocko", "Heffer", "Spunky", "Doug",
                "Roger");

        names1.stream().forEachOrdered(name -> System.out.println("Name: " + name));

        // name.stream().filter(name -> name.startsWith("A"))
        // .map(String::toUpperCase)


    }
}
