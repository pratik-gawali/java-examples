package encapsulation;

import java.util.Scanner;

public class BankAccount {

    private final String accountNumber;
    private final String holderName;
    private double balance=0.0;


    public BankAccount(String accountNumber, String holderName, double initialBalance) {

        if (accountNumber == null || accountNumber.isBlank() ) {
            throw new IllegalArgumentException("Invalid Account Number");
        }
        if(holderName == null || holderName.isBlank()){
            throw new IllegalArgumentException("Invalid Account Holder Name");
        }
        if(initialBalance<0){
            throw new IllegalArgumentException("Initial Balance cannot be negative");
        }
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){

        if(amount<=0){
            throw new IllegalArgumentException("Amount cannot be zero or Negative");
        }
        balance+=amount;
        System.out.println(amount+" Deposited");
        System.out.println("Total Balance: "+balance);
    }

    public void withdraw(double amount){


        if(amount<=0) {
            throw new IllegalArgumentException("Invalid amount");
        }
        if(balance<amount) {
            throw new IllegalStateException("Insufficient Balance");
        }

        balance-=amount;
        System.out.println(amount+" Withdraw Successfully");
        System.out.println("Total Balance: "+balance);


    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Account Details ");

        System.out.println("Enter The Account Number: ");
        String accountNumber = sc.nextLine();

        System.out.println("Enter The Account Holder Name: ");
        String holderName = sc.nextLine();

        System.out.println("Enter The Initial Amount: ");
        double amount = sc.nextDouble();

        BankAccount b = new BankAccount(accountNumber, holderName, amount);

        System.out.println("Bank Account Created Successfully");
        System.out.println("Account Number: " + b.getAccountNumber());
        System.out.println("Account Holder Name: " + b.getHolderName());
        System.out.println("Account Balance: " + b.getBalance());


        int choice;
        do {
            System.out.println("\n\n---Menu--- ");
            System.out.println("1. Deposit \n 2. Withdraw\n 3. Exit");
            choice = sc.nextInt();
            double amt = 0.0;
            switch (choice) {

                case 1:
                    System.out.println("Enter the amount to be deposited");
                    amt = sc.nextDouble();
                    b.deposit(amt);
                    break;

                case 2:
                    System.out.println("Enter the amount to be Withdrawn");
                    amt = sc.nextDouble();
                    b.withdraw(amt);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 3);
    }
}

