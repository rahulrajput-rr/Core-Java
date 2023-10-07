// package bankAccount;

import java.util.Scanner;

class BankAccount {
    private String accountHolderName;
    private int accountHoloderNumber;
    private double accountHolderBalance;

    // public BankAccount(String accountHolderName, int accountHoloderNumber, double
    // accountHolderBalance) {

    // this.accountHolderName = accountHolderName;
    // this.accountHoloderNumber = accountHoloderNumber;
    // this.accountHolderBalance = accountHolderBalance;

    // }

    // Setter methods

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setaccountHolderNumber(int accountHoloderNumber) {
        this.accountHoloderNumber = accountHoloderNumber;
    }

    public void setAccountHolderBalance(double accountHolderBalance) {
        this.accountHolderBalance = accountHolderBalance;
    }

    // Getter methods
    public int getaccountHoloderNumber() {
        return accountHoloderNumber;

    }

    public String getaccountName() {
        return accountHolderName;
    }

    public double getaccountHololderBalance() {
        return accountHolderBalance;
    }

    void displayDetails() {
        System.out.println(accountHolderName + " " + accountHoloderNumber + "  " + accountHolderBalance);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter Number: ");
        int userNumber = scanner.nextInt();

        System.out.print("Enter Balance: ");
        double balance = scanner.nextDouble();

        BankAccount account = new BankAccount();

        account.setAccountHolderName(userName);
        account.setaccountHolderNumber(userNumber);
        account.setAccountHolderBalance(balance);
        account.displayDetails();
        // BankAccount account = new BankAccount(userName, userNumber, balance);

        // System.err.println("Name: " + userName + "\tNumber: " + userNumber +
        // "\tBalance: " + balance);

        scanner.close();

    }
}
