package abstraction.abstractClass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Vehicle v;

        System.out.println("\nWhich vehicle you want to Ride today");
        System.out.println("1. Car");
        System.out.println("2. Motorcycle");
        System.out.println("3. Exit");
        System.out.print("\nEnter your Preference: ");

        int ch = sc.nextInt();

        String model;
        sc.nextLine();
        switch(ch){

            case 1:
                    System.out.println("\nEnter the car model you want to drive: ");
                    model = sc.nextLine();
                    v= new Car(model);
                    System.out.println(v.startEngine());
                    System.out.println("\nRiding... \n");
                    System.out.println(v.stopEngine());
                    break;

            case 2:
                    System.out.println("\nEnter the motorcycle model you want to drive: ");
                    model = sc.nextLine();
                    v= new Motorcycle(model);
                    System.out.println(v.startEngine());
                    System.out.println("\nRiding... \n");
                    System.out.println(v.stopEngine());
                    break;

            default: System.out.println("\n Thank you!!!");

        }
    }
}
