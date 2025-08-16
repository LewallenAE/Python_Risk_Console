package Challenges;

public class PerfectNumber {
    // write code here


    public static void main(String[] args) {


        System.out.println(isPerfectNumber(15));
        System.out.println(isPerfectNumber(6));
    }

    public static boolean isPerfectNumber(int num) {


        if (num < 1) {

            return false;
        }

        int sum = 0;

        for (int i = 1; i < num ; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;

    }
}

