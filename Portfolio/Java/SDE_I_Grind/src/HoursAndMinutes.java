import java.util.*;

public class HoursAndMinutes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*int minutes = scanner.nextInt();

        int hours = minutes / 60;
        int minutes1 = minutes % 60;

        System.out.println(hours + " hours and " + minutes1 + " minutes"); */

       // int input = scanner.nextInt();

       /* if ((input > -15 && input <= 12) ||
                (input > 14 && input < 17) ||
                (input >= 19)) {
            System.out.println("True");
        } else{ System.out.println("False");
        } */

        /*
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();

        if ((one >= two && one <= three) ||
                (one <= two && one >= three)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
         */

       // Scanner scanner = new Scanner(System.in);
        // start coding here

        String input = scanner.next();
        int one = scanner.nextInt();
        int two = scanner.nextInt();

        System.out.println(input.substring(Math.min(one,two), Math.max(one,two) + 1));
    }



    }

