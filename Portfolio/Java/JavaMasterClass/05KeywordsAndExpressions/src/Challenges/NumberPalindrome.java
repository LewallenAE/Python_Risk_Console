package Challenges;

public class NumberPalindrome {
    // write code here

    public static void main(String[] args) {


        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(23));
        System.out.println(isPalindrome(233444332));
    }

    public static boolean isPalindrome(int number) {

        int originalNumber = number;
        int reverse = 0;


        if (number < 0) {
            number = -number;

        }


        while (number > 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }

        if (originalNumber < 0) {
            originalNumber = -originalNumber;
        }

        return reverse == originalNumber;

    }
}
