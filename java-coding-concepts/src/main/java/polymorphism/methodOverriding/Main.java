package polymorphism.methodOverriding;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Notifications n;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter the message to send: ");
        String msg = sc.nextLine();

        System.out.println("\n Enter the medium of Message ");
        System.out.println("1. Email ");
        System.out.println("2. SMS ");
        System.out.println("3. PUSH ");
        System.out.println("4. Exit ");

        int ch = sc.nextInt();

        switch (ch) {

            case 1:
                n= new EmailNotification();
                System.out.println("Sending Email: "+n.send(msg));
                break;

            case 2:
                n= new SMSNotification();
                System.out.println("Sending SMS: "+n.send(msg));
                break;

            case 3:
                n= new PushNotification();
                System.out.println("Sending Push Notification: "+n.send(msg));
                break;

            default:
                System.out.println("Thank you!!!");
        }
    }
}
