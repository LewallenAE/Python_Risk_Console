package Challenges;

public class DivisibleByThreeAndFive {


    public static void main(String[] args) {


        for (int n = 1; n <= 1000; n++) {
            if (isDivisible(n)){
                System.out.println(n + " is divisible by 3 and 5");
            }
        }
    }

    public static boolean isDivisible(int number) {
            if (number % 3 == 0 && number % 5 == 0) {
                return true;
            }
        return false;
        }
    }

