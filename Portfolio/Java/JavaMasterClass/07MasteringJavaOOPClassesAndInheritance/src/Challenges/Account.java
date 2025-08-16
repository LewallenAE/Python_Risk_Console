package Challenges;

import static java.lang.System.out;


public class Account {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        out.println("Empty constructor called");
    }

    public Account(String accountNumber, double accountBalance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public double deposit(double depositAmount) {
        if (depositAmount > 0) {
            accountBalance += depositAmount;
        } else {
            out.println("Deposit amount must be a positive amount.");
        }
        return accountBalance;
    }

    public double withdraw(double withdrawAmount) {
        if (withdrawAmount <= accountBalance && withdrawAmount > 0) {
           accountBalance -= withdrawAmount;
        } else {
            out.println("Your balance is too low for that withdrawal.");
        }
        return accountBalance;
    }


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

