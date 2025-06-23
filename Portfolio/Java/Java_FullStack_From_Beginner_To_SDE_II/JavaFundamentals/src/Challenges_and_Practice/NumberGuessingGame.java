package Challenges_and_Practice;

import java.util.Scanner; // import scanner class
import java.util.Random;  // import random class

public class NumberGuessingGame {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // initialize the Scanner class with scanner variable.
        Random random = new Random(); // initialize the Random class with random variable



        boolean gameOn = true;  // set the game to be on
        int randomNumber = random.nextInt(200) + 1; // generate a random number from 1 - 200
        // because random.nextInt(200) is 0 - 199 with + 1 it is (1 - 200);


        while (gameOn) {
            System.out.println("Enter a number: ");
            int guess = scanner.nextInt();
            if (guess != randomNumber && guess < randomNumber) {
                System.out.println("The secret number is higher! Try again.");
                System.out.println();
            } else if (guess != randomNumber && guess > randomNumber) {
                System.out.println("The secret number is lower! Try again.");
                System.out.println();
            } else {
                System.out.println("You guessed the secret number! The secret number is: " + randomNumber);
                gameOn = false;
            }
        }

        // A second way to do this

        /*

        int guess = -1;     <--- must have this otherwise Java will yell at you.

        while (guess != randomNumber) {
            System.out.println("Enter a number: ");
            int guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("The secret number is higher! Try again");
            } else if (guess > randomNumber) {
                System.out.println("The secret number is lower! Try again");
            } else {
                System.out.println("You guessed the secret number!");
            }
        }
         */



    }
}
