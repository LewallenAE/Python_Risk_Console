public class EqualSumChecker {
    // write code here

    public static boolean hasEqualSum(int one, int two, int three) {

        if ((one + two) == three) {
            return true;
        }
        else {
            return false;
        }
    }



    public static void main(String[] args) {

        System.out.println(hasEqualSum(1, 2, 3));
        System.out.println(hasEqualSum(0, 0, 0));
        System.out.println(hasEqualSum(1, -1, 0));
        System.out.println(hasEqualSum(1, -2, 0));
    }
}