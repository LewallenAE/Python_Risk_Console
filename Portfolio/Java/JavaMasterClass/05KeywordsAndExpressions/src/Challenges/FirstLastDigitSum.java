package Challenges;

    public class FirstLastDigitSum {
        // write code here

        public static void main(String[] args) {

            System.out.println(sumFirstAndLastDigit(20309));
        }

        public static int sumFirstAndLastDigit(int number) {


            if (number < 0) {
                return -1;
            }

            int lastDigit = number % 10;
            int firstDigit = number;

            while (firstDigit >= 10) {
                firstDigit /= 10;
            }

            return firstDigit + lastDigit;
        }

    }

