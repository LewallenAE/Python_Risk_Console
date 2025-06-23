package Challenges;

public class LastDigitChecker {


    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41, 20, 32));
        System.out.println(hasSameLastDigit(51, 20, 51));
    }
    public static boolean hasSameLastDigit(int one, int two, int three) {

        if (one < 10 || one > 1000 || two < 10 || two > 1000 || three < 10 || three > 1000) {

            return false;

        }

        int oneLast = one % 10;
        int twoLast = two % 10;
        int threeLast = three % 10;

        return (oneLast == twoLast ||
                oneLast == threeLast ||
                twoLast == threeLast);
    }

    public static boolean isValid(int num) {

        if (num < 10 || num > 1000) {
            return false;
        }

        return true;
    }
}
