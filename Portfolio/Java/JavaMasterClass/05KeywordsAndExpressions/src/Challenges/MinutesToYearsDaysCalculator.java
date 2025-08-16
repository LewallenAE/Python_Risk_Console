package Challenges;

public class MinutesToYearsDaysCalculator {
    // write code here

    public static void main(String[] args) {

        printYearsAndDays(50009002);
    }
    public static void printYearsAndDays (long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {

            long days = (minutes % 525600L) / 1440;
            long years = minutes / 525600L;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }

    }
}