package inheritance;

import java.util.Scanner;

public class MyAccount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Account Details ");

        System.out.println("Enter The Account Number: ");
        String accountNumber = sc.nextLine();

        System.out.println("Enter The Account Holder Name: ");
        String holderName = sc.nextLine();

        System.out.println("Enter The Initial Amount to open the Account: ");
        double amount = sc.nextDouble();

        SavingsAccount b = new SavingsAccount(accountNumber, holderName, amount);
        CurrentAccount c = new CurrentAccount(accountNumber, holderName, amount);

        System.out.println("Enter The Account Type: ");

        int choice;

        System.out.println("\n\n---Account Type--- ");
        System.out.println("1. Savings \n 2. Current\n 3. Exit");
        choice = sc.nextInt();

        System.out.println("Bank Account Created Successfully");
        System.out.println("Bank Account Details");
        System.out.println("Account Number: " + b.getAccountNumber());
        System.out.println("Account Holder Name: " + b.getHolderName());
        System.out.println("Account Balance: " + b.getBalance());

        double amt = 0.0;
        int ch;
        switch (choice) {

            case 1:
                    System.out.println("Interest Rate: " + b.getInterestRate()+"%");

                    do {
                        System.out.println("\n\n---Menu--- ");
                        System.out.println("1. Deposit \n 2. Withdraw\n 3. Exit");
                        ch = sc.nextInt();

                        switch (ch) {

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
                                System.out.println("Thank you for Banking with us!!");
                        }

                    } while (ch != 3);

                    break;
            case 2:
                    do {
                        System.out.println("\n\n---Menu--- ");
                        System.out.println("1. Deposit \n 2. Withdraw\n 3. Exit");
                        ch = sc.nextInt();

                        switch (ch) {

                            case 1:
                                System.out.println("Enter the amount to be deposited");
                                amt = sc.nextDouble();
                                c.deposit(amt);
                                break;

                            case 2:
                                System.out.println("Enter the amount to be Withdrawn");
                                amt = sc.nextDouble();
                                c.withdraw(amt);
                                break;
                            default:
                                System.out.println("Thank you for Banking with us!!");
                        }

                    } while (ch != 3);
                    break;
            default:
                    System.out.println("Thank you for Banking with us!!");
            }
    }
}
