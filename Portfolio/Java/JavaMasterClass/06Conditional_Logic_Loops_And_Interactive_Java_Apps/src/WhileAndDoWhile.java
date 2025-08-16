public class WhileAndDoWhile {


    public static void main(String[] args) {

        /*
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;

        // int k = 0;
        int k = 99;
        while (true) {
            if (k > 100) { // this prints the numbers 0 - 100 until k reaches 5.
                // if we change k to 99; because it;s inside the int j = 1 loop
                break;
            }
            System.out.println(k);
            k++;
        }
        */

        int j = 1;
        boolean isReady = true;
        while (isReady) {
            if (j == 2000) {
                isReady = false;
            }
            System.out.println(j);
            j++;
        }


        }
    }

