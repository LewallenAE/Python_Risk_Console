public class ForLoops {

    public static void main(String[] args) {


        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2));

        // automate with a for loop

        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("10,000.00 at " + rate + "% interest = " + interestAmount);
        }
    }


    public static double calculateInterest (double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }
}
