public class SwitchStatements_Enhanced_And_Traditional {

    public static void main(String[] args) {

        // int value = 1;
        // int value = 2;
        // int value = 3;
        int value = 4;

        // Switch is switch (condition) {
        //    case 1:
                // add a break; statement after each case #:
        //    case 2:
        //    case 3:
        //    etc.
        // }

        // Usually the choice between the if and switch statements is just that, a matter of choice.
        switch (value) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            case 3:
                System.out.println("Value is 3");
                break;
            case 4: case 5: case 6:
                System.out.println("The value is either 4, 5, or 6");
                System.out.println("In fact it was: " + value);
                break;
            default:
                System.out.println("Value is not 1, 2, or 3");
                break;
        }

        // enhanced switch statement, no break and using an ->
        int value2 = 4;

        switch (value2) {
            case 1 -> System.out.println("Value is: " + value);
            case 2 -> System.out.println("Value is: " + value);
            case 3 -> System.out.println("Value is: " + value);
            case 4, 5, 6, 7, 8, 9, 10 -> System.out.println("Value is: " + value);
            default -> System.out.println("Value is: null");
        }

        String month = "December";

        System.out.println(month + " is in the " + getQuarter(month) + " quarter of the year.");


        String month2 = "July";

        System.out.println(month2 + " is in the " + getQuarter2(month2) + " quarter!");

    }

    public static String getQuarter(String month) {

        switch (month) {

            case "January":
            case "February":
            case "March":
                return "1st";
            case "April":
            case "May":
            case "June":
                return "2nd";
            case "July":
            case "August":
            case "September":
                return "3rd";
            case "October":
            case "November":
            case "December":
                return "4th";
        }
        return "bad";
    }

    public static String getQuarter2(String month2) {

        return switch (month2) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> "bad";
        };

    }
}
