package Challenges;

public class Conversion {

    public static void main(String[] args){

        System.out.println(convertToCentimeters(5, 8));
        System.out.println(convertToCentimeters(68));

    }

    public static double convertToCentimeters( int entireHeight){



        return entireHeight * 2.54;

    }

    public static double convertToCentimeters(int heightInFeet, int remainingHeightInches) {


           //  return convertToCentimeters((heightInFeet * 12) + remainingHeightInches); single line return

        // this is more readable, clear and usually better

        int feetToInches = heightInFeet * 12;
        int totalInches = feetToInches + remainingHeightInches;
        double result = convertToCentimeters(totalInches);
        return result;

    }
}
