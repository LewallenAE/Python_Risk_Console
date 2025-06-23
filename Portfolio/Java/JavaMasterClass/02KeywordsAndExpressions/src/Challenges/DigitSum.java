package Challenges;

public class DigitSum {

    public static void main(String[] args) {
        System.out.println(sumDigits(589));
        System.out.println(sumDigits(600));
        System.out.println(sumDigits(100));
        System.out.println(sumDigits(-150));
        System.out.println(sumDigits(-111));
    }

    public static int sumDigits(int number) {

        if (number < 0) return -1;

        int sum = 0;

        while (number >0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
