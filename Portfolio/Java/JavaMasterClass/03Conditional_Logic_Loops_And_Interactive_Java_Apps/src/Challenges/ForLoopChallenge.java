package Challenges;

public class ForLoopChallenge {


    public static void main(String[] args) {

        System.out.println(isPrime(9));

        for (int n = 2; n < 1000; n++) {
            if (isPrime(n)) {
                System.out.println(n + " is Prime");
            }
        }

    }


    public static boolean isPrime(int wholeNumber) {
        for (int i = 2; i <= Math.sqrt(wholeNumber); i++) {
            if (wholeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

}