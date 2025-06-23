package Challenges;

public class SecondsAndMinutesChallenge {

    // time in seconds as parameter
    // transform seconds to hours
    // display the time in hours with the remaining minutes and seconds in a String
    // two steps with overloaded methods
    // getDurationString(int seconds)
    // getDurationString(int minutes, int seconds)
    // return String XXh YYm ZZs

    public static void main(String[] args) {

        System.out.println(getDurationString(2000000));
        System.out.println(getDurationString(700, 9000));
        System.out.println(getDurationString(3945));


    }

    public static String getDurationString(int seconds) {

        if (seconds >= 0) {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;

            return getDurationString(minutes, remainingSeconds);
        } else {
            return "Invalid value for seconds";
        }


    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {

            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;


            return hours + "h" + remainingMinutes + "m" + seconds + "s";

            // return String.format("%02dh %02dm %02ds", hours, remainingMinutes, seconds);

        } else {
            return "Invalid, seconds must be between 0 and 59, and minutes must be >= 0 inclusive.";
        }



    }

}
