package Challenges;

public class Main {

    public static void main(String[] args) {

        Account myAccount = new Account("134", 35938.09, "Ant man", "AntMan@antManCodes.com", "+1 520-505-9384");


        String myAccountInfo = String.format("""
                Account Number: %s
                Balance: %2f
                Customer Name: %s
                Customer Email: %s
                Customer Phone: %s                
                """,
                myAccount.getAccountNumber(),
        myAccount.getAccountBalance(),
        myAccount.getCustomerName(),
        myAccount.getEmail(),
        myAccount.getPhoneNumber()
        );

    System.out.println(myAccountInfo);
    }
}
