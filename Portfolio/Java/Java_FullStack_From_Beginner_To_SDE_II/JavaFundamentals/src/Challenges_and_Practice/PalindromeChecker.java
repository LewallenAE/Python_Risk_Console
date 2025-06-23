package Challenges_and_Practice;

import java.util.Scanner;

public class PalindromeChecker {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Palindrome game!");
        System.out.println();

        boolean gameOn = true;

        while (gameOn) {

            System.out.println("Enter a word to see if it is a palindrome: ");
            String isPalindrome = scanner.nextLine().toLowerCase().strip().replaceAll("\\s+", "");
            String isPalindromeReversed = "";

            for (int i = isPalindrome.length() - 1; i >= 0; i--) {
                isPalindromeReversed += isPalindrome.charAt(i);
                // for larger strings reversed.append(isPalindrome.charAt(i));
                // isPalindrome = isPalindrome.replaceAll("[^a-zA-Z0-9]", "")
            }

                if (!isPalindromeReversed.equals(isPalindrome)) {
                    System.out.println(isPalindromeReversed + " is not a palindrome of " + isPalindrome + " try again!");
                    System.out.println();
                } else {
                    System.out.println(isPalindromeReversed + " is a palindrome of " + isPalindrome + "!");
                    System.out.println();
                    System.out.println("Thanks for playing the Palindrome Game!");
                    gameOn = false;
                }

            }
        }
    }

