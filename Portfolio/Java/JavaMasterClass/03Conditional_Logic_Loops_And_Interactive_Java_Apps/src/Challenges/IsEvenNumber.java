package Challenges;

public class IsEvenNumber {

    public static void main(String[] args) {

        int n = 5;

        while (n <= 20) {
            if (isEvenNumber(n)) {
                System.out.println(n);
            }
            n++;
        }

    }
    public static boolean isEvenNumber(int num) {

        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
}
