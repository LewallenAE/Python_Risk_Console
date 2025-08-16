package Challenges;

public class GreatestCommonDivisor {

    public static void main(String[] args) {


        System.out.println(getGreatestCommonDivisor(21, 84));

    }


        public static int getGreatestCommonDivisor(int first, int second) {

            if (first < 10 || second < 10) {
                return -1;
            }

            int min;
            if (first < second) {
                min = first;
            } else {
                min = second;
            }

            for (int i = min; i >= 1; i--) {

                if (first % i == 0 && second % i == 0) {

                    return i;
                }
            }

            return -1;

        }
    }

