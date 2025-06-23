package Challenges_and_Practice;

public class FibonacciSequence {


    public static void main(String[] args) {


        int prev = 0;
        int current = 1;

        do {
            int next = prev + current;
            System.out.println("Fibonacci sequence: " + prev + " + " + current + " = " + next);
            prev = current;
            current = next;

        } while (current < 1000);
    }
}
