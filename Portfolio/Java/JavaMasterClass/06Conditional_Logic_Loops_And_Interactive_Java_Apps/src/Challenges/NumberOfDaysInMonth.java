package Challenges;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {

        System.out.println(isLeapYear(1000));
        System.out.println(isLeapYear(10_000));
        System.out.println(isLeapYear(4_000));
        System.out.println(getDaysInMonth(1, 2025));
    }


    // write code here
        // write code here

        public static boolean isLeapYear(int year) {
            if (year < 1 || year > 9999) {
                return false;
            }

            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }






        public static int getDaysInMonth(int month, int year) {

            if (year < 1 || year > 9999 || month < 1 || month > 12) {
                return -1;
            } int days = switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> {
                    if (isLeapYear(year)) {
                        yield 29;
                    } else {
                        yield 28;
                    }
                }

                default -> {
                    yield -5;
                }
            };


            return days;


        }

    }

