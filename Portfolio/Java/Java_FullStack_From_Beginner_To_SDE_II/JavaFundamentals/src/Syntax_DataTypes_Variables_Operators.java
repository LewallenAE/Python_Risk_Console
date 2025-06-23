import java.util.Scanner;

public class Syntax_DataTypes_Variables_Operators {

    // Case Sensitive
    public static void main(String[] args) {
        int myVariable = 10;
        int Myvariable = 10;
        int myvariable = 10;
        int MYVARIABLE = 10;
        int mYvArIaBlE = 10;

        System.out.println(myVariable);
        System.out.println(Myvariable);
        System.out.println(myvariable);
        System.out.println(MYVARIABLE);
        System.out.println(mYvArIaBlE);

        // Class names should be MyClass, EmployeeData, CustomerService aka CamelCase.


        // Method Names start with lowercase calculateSalary();, getUserName();, processOrder(); remember the semicolon!

        // Java uses the .class extension MyClass.java, EmployeeData.java, CustomerService.java

        //  public class CodeBlock {   start of code block

        // code here

        // } end of code block

        // Single comment

        /*
        multi
        line
        comment
         */

        /**
         *
         * Java Document
         *
         */

        /*
        PRIMITIVE DATA TYPES:

        byte: 8 bit signed integer -128 - 127  notice this is 2^8
        short: 16 bit -32,768 - 32767 notice this is 2^16  if you add both numbers as positive it is one short we add 1
        because of the 0.
        int: 32 bit 2^32 you can do the math
        long 2^64 you can do the math

        float: 32 bit single digit decimal float price = 99f; <-- need f
        double: 64 bit double precision decimal double pi = 3.141592 etc
        boolean: true and false
        char:  single character use ' ' single quotes
         */

        /*

        REFERENCE DATA TYPES

        Classes, interfaces, arrays, enums (reference of the object memory)

        Class: User defined type using class keyword a String is a class String name = "My name"; notice double quotes
        Scanner scanner = new Scanner(System.in) scanner is a class must be imported using import java.util.Scanner;
        Scanner is the class, scanner is the variable name = new Scanner(System.in) is the assignment of getting input from a user

        you can also use import java.util.*; for all. But importing only what you need saves memory.

        Interface a blueprint of a class - more on this later
        Arrays: a collection of elements of the same data time int[] numbers = {1,2,3,4,5,6,7,8,9,0};
        Enums: A special class that represents a group of constants (unchangeable variables like final variables).
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("What is your age? ");
        int age = scanner.nextInt();
        scanner.nextLine(); // always consume the nextLine(); character after using nextInt();
        System.out.println("Where do you live?");
        String domicile = scanner.nextLine();

        System.out.println("To confirm your name is: " + name + " and you are " + age + " years old, and finally " +
                domicile + " is where you live.");

        scanner.close(); // always close the scanner.

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i);
        }


        /*

        STRING DATA TYPE
         */


        String hello = "Hello, world";

        System.out.println(hello);




        /*

        VARIABLES
         */

        // notice that hello, domicile, name, age, are all variables that store different "types" of data and their values.

        // int x;  declare x as a variable and sets it to an int;
        // x = 10; initializes x.
        // do not use keywords as variable names (class, int, public, byte etc) you cannot start variables with a digit
        // you CAN start variables with _ or $



        /*

        SCOPE OF VARIABLES



        Local variable: Declared inside block of code and only accessible in the method or code block

        Instance variables: Declared inside a class but outside any method belonging to an instance of the class aka
                            (an object)

        Static variables: Declared inside a class with the static keyword. These belong to the class itself and are
                            shared by all instances of the class.



         Example:


         public class VariableScope {

            static int staticVariable = 50;  <= static variable

            int instanceVariable = 50;       <= instance variable

            public static void main(String[] args) {

            int localVariable = 10;

            System.out.println("Local Variable" + localVariable);
            System.out.println("Static Variable" + staticVariable);

            VariableScope obj = new VariableScope();
            System.out.println("Instance variable" + obj.instanceVariable();

            obj.myMethod();
        }


        public void myMethod() {

            System.out.println("Instance variable in myMethod" + instanceVariable);
            System.out.println("Static variable in myMethod" + staticVariable);

            notice that we cannot access the local variable here.

         */



        /*

        OPERATORS


        ARITHMETIC OPERATORS
        + : addition
        - : subtraction
        * : multiplication
        / : division
        % : modulus (returns the remainder of a division)
        ++ : increment by 1
        -- : decrement by 1


        ASSIGNMENT OPERATORS

        =  : assignment
        += : add and assign to a variable  count += 1
        -= : subtract and assign to a variable count -= 3
        *= : multiply and assign to a variable
        /= : divide and assign to a variable
        %= : modulus and assign to a variable



        COMPARISON OPERATORS

        These return true or false

        == : Equal to (there is always .equals() which is covered later)
        != : Not equal (notice however we cannot do !< !> !<=) in this case you must do
                int x = 1, int y = 2  if !(x < y) <== this returns false because it says if NOT (x < y) meaning
                if (x > y)  and subbing the values for x and y  (1 > 2) is false so this will return false.
        <  : Less than
        >  : Greater than
        <= : Less than or equal to
        >= : Greater than or equal to




        LOGICAL OPERATORS

        && : AND -> both must be true
        || : OR -> At least ONE must be true
        !  : NOT the opposite see above.



        BITWISE OPERATORS


        &  : Bitwise AND
        |  : Bitwise OR
        ^  : Bitwise XOR
        ~  : Bitwise NOT
        << : Left Shifts bits of the left operand by the number of positions specified in the right operand
        >> : Right Shifts bits of the left operand by the number of positions specified in the right operand
        >>>: Unassigned right shift shift the bits of the left operand to the right by the number of positions specified
             by the right operand, filling the leftmost bits with zeroes.




        TERNARY OPERATOR


        Shorthand for if-else statements:

        (condition) ? true : false;

        int age = 22;
        String age = (age > 21) "You can't drink" : "You can drink";     <--- Ternary operator
        System.out.println(age);


         */




    }
}
