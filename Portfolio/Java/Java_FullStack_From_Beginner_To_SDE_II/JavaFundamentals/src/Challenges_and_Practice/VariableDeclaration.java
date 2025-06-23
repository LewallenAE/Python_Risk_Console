package Challenges_and_Practice;

public class VariableDeclaration {


    public static void main(String[] args) {

        int age = 20;
        boolean isTrue = false;
        String name = "Train main";
        long population = 1000000000000L;
        short num = 10;
        float fl = 99.00f;
        double doubles = 29.983957395;
        char a = 'a';


        int ageAge = age + age;
        int ageMinus = age - age;
        int ageMult = age * age;
        int ageDiv = age / age;
        int ageMod = age % age;
        int ageSquare = (int) Math.pow(age, 3); // should print 20^3 = 20 * 20 * 20
                        // Math.pow always returns a double so casting to an int is done with
                        // (int) Math.pow(base, exponent)
        boolean ageMinusGreaterThanAgeAge = (ageMinus > ageAge);
        String ternary = (age < 20) ? "Yes, age is less than 20" : "No, age is not less than 20";
        String nestedTernary = (age < 20) ? "Age is not less than 20" :
                                (age > 20) ? "Age is over 20":
                                (age == 20) ? "The age is 20" : "The age is not 20";
        String evenOdd = (age % 2 == 0) ? "Even" : "Odd";
        String stringOne = "Hello";
        String stringTwo = "World";
        String string1and2 = stringOne + stringTwo;

        int count = 0;
        for (int i = 0; i < string1and2.length(); i++) {
            count ++;
        }

        System.out.println(age);
        System.out.println(isTrue);
        System.out.println(name);
        System.out.println(population);
        System.out.println(num);
        System.out.println(fl);
        System.out.println(doubles);
        System.out.println(a);
        System.out.println(ageAge);
        System.out.println(ageMinus);
        System.out.println(ageMult);
        System.out.println(ageDiv);
        System.out.println(ageMod);
        System.out.println(ageSquare);
        System.out.println(ageMinusGreaterThanAgeAge);
        System.out.println(ternary);
        System.out.println(nestedTernary);
        System.out.println(evenOdd);
        System.out.println(stringOne);
        System.out.println(stringTwo);
        System.out.println(string1and2);
        System.out.println("The total index of count is: " + count);


    }
}
