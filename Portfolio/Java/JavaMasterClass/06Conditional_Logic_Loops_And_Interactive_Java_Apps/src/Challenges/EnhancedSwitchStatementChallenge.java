package Challenges;

public class EnhancedSwitchStatementChallenge {


    public static void main(String[] args) {

        System.out.println(printDayOfWeek(0));
        System.out.println(printDayOfWeek(1));
        System.out.println(printDayOfWeek(2));
        System.out.println(printDayOfWeek(3));
        System.out.println(printDayOfWeek(4));
        System.out.println(printDayOfWeek(5));
        System.out.println(printDayOfWeek(6));
        System.out.println(printDayOfWeek(7));

        System.out.println(printDayOfWeek2(0));

    }

    public static String printDayOfWeek(int day) {

        return switch (day) {

            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Not a day of the week";
        };

    }


    public static String printDayOfWeek2(int day1) {

        String dayOfWeek = switch (day1) {
            case 0 -> { yield "Sunday";}
            case 1 -> {yield "Monday";}
            case 2 -> {yield "Tuesday";}
            case 3 -> {yield "Wednesday";}
            case 4 -> {yield "Thursday";}
            case 5 -> {yield "Friday";}
            case 6 -> {yield "Saturday";}
            default -> {yield "Not a day of the week";}
        };

        System.out.println(day1 + " stands for " + dayOfWeek);
        return dayOfWeek;

    }

}



