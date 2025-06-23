import java.util.Scanner;

public class calcFact {

    public static int calculateFactorial(int n) {

        int factorial =  1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;

        }
        return factorial;
    }

    public static void main(String[] args) {
        // 3.2 Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // TODO: 1. Ask user for an integer 'n' using scanner.nextInt()

        System.out.println("Enter an integer: ");
        int n = scanner.nextInt();

        // TODO: 2. Print the factorial of 'n'
        System.out.println(calculateFactorial(n));
        scanner.close(); // Always close the scanner when done
    }

}
