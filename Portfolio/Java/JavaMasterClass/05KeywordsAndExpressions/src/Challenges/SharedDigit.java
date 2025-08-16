package Challenges;

public class SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(23, 42));


    }


    public static boolean hasSharedDigit(int numOne, int numTwo) {

        if (numOne < 10 || numOne > 99 || numTwo < 10 || numTwo > 99) {

            return false;
        }

        int firstOne = numOne / 10;
        int secondOne = numOne % 10;

        int firstTwo = numTwo / 10;
        int secondTwo = numTwo % 10;

        return (firstOne == firstTwo ||
                firstOne == secondTwo ||
                secondOne == firstTwo ||
                secondOne == secondTwo);

    }



}
