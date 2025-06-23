package Challenges;

public class FlourPacker {


    public static void main(String[] args) {


        System.out.println(canPack(1,2,7));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {


        // can't have a remainder for big bags, we can have remainders for small bags

        if (bigCount < 0 || smallCount < 0 || goal < 0){

            return false;
        }

        int maxBigBagsUsable = goal/5;
        int bigBagsToUse = bigCount;


        if (bigCount > maxBigBagsUsable) {

            bigBagsToUse = maxBigBagsUsable;
        }

        int remaining = goal - (bigBagsToUse * 5);

        if (smallCount >= remaining) {

            return true;
        }

        return false;

    }
}
