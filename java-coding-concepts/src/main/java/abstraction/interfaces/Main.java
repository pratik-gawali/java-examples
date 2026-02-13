package abstraction.interfaces;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PaymentMethod payment;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the amount to Pay: ");
        double amount = sc.nextDouble();

        System.out.println("\n----Payment Method----");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. ApplePay");
        System.out.println("4. Exit");
        System.out.print("\nEnter your Preference: ");
        int ch = sc.nextInt();

        switch (ch) {

            case 1:
                payment = new CreditCard();
                System.out.println(payment.processPayment(amount));
                break;

            case 2:
                payment = new PayPal();
                System.out.println(payment.processPayment(amount));
                break;
            case 3:
                payment = new ApplePay();
                System.out.println(payment.processPayment(amount));
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }

}
