import java.util.Scanner;

public class Parsing_Values {



    public static void main(String[] args) {

    int currentYear = 2025;
    String usersDateOfBirth = "1985";

    int dateOfBirth = Integer.parseInt(usersDateOfBirth);

    System.out.println("Age: " + (currentYear - dateOfBirth));

    String doubleBirth = "22.5";
    Double dDoubleBirth = Double.parseDouble(doubleBirth);

    String intBirth = "25";
    Integer iIntBirth = Integer.parseInt(intBirth);

    System.out.println("dDoubleBirth = " + dDoubleBirth + " " + dDoubleBirth.getClass());
    System.out.println("iIntBirth = " + iIntBirth + " " + iIntBirth.getClass());

    // Get user input

        System.out.println("Enter a double: ");
        Scanner scan = new Scanner(System.in);

        Double userAge = scan.nextDouble();


        Double dude = 22.5;

        System.out.println(dude + " " + userAge + " Are the values of the variables dude and userAge.");

    }
}
