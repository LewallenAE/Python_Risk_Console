public class ControlFlow_Conditional_Statements {

    public static void main(String[] args) {

        // if else statement

        int age = 18;

        if (age >= 20) {
            System.out.println("You are old enough to vote");
        }

        if (age >= 65) {
            System.out.println("You are old enough to retire");
        } else {
            System.out.println("You are not old enough to retire");
        }

        int score = 95;

        if (score >= 90) {
            System.out.println('A');
        } else if (score >= 80) {
            System.out.println('B');
        } else if (score >= 70) {
            System.out.println('C');
        } else if (score >= 60) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }



        // If and nested if else

        boolean hasLicense = true;
        boolean hasCar = false;

        int agePermit = 10;
        if (agePermit >= 16) {
            System.out.println("You are old enough to drive");
            if (hasLicense) {
                System.out.println("You have a license this means you can drive");
                if (hasCar) {
                    System.out.println("And you have a car!");
                } else {
                    System.out.println("You need a car before you can drive!");
                }
            }
        } else {
            System.out.println("You are not old enough to drive");
        }


        // For loop

        String mumboJumbo = "kaaihnjk wehang knasgohisgn kjasehg keid go";
        int count = 0;
        int countTwo = 0;
        for (int i = 0; i < mumboJumbo.strip().length(); i++) {
            count ++;
        }

        for (int i = 0; i < mumboJumbo.length(); i++) {
            countTwo++;
        }

        System.out.println(count);
        System.out.println(countTwo); // notice that the white space stripping doesn't change the length.


        // While Loop

        int countThree = 0;

        while (countThree < 20) {
            System.out.println("Count is: " + countThree);
            countThree++;  // <--- if we didn't increment here the loop would run forever and crash the program.
        }


        // DO WHILE LOOP

        int countFour = 20;

        do {
            System.out.println("Count is: " + countFour + " Notice that the previous loop" +
                    " stops at 19 because the comparator is < 20" +
                    " And this is printing the DO WHILE LOOP");     // the DO portion always executes at least once.
            count++;
        } while (countFour < 20);



        // CONTINUE AND BREAK;


        /* Break: immediately terminates the loop
           Continue: Skips the current iteration and proceeds to the next;
         */

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // this skips even numbers
            }
            System.out.println("Odd numbers i: " + i);
        }

        // SWITCH STATEMENTS


        /*

        switch (condition) (
                case 1:
                "someting here";
                break;
                case 2:
                "something here";
                break;
                default;
         }

         */

        /*
         ENHANCED SWITCH

         switch (condition) {
                case 1 -> "thing";
                case 2 -> "thing";
                case 3 -> "thing";
                default -> "thing";
          }

          no need for break
         */

    }
}
