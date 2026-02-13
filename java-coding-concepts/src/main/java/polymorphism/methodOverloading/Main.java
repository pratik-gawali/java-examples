package polymorphism.methodOverloading;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SalaryCalculator salaryCalculator = new SalaryCalculator();
        Scanner sc = new Scanner(System.in);
        double amt, bonus, taxPercentage;

        System.out.println("Enter the Base Annual Salary: ");
        amt = sc.nextDouble();
        System.out.println("Enter the Annual Bonus: ");
        bonus = sc.nextDouble();
        System.out.println("Enter the Tax%: ");
        taxPercentage = sc.nextDouble();

        int ch;

        do {
            System.out.println("\n----Salary Slip----");
            System.out.println("1. Base Salary (Annual)");
            System.out.println("2. Gross Salary (Annual)");
            System.out.println("3. Salary After Tax Cutting (Annual)");
            System.out.print("\nEnter the Preference: ");
            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.println("\nBase Annual Salary: " + salaryCalculator.calculateSalary(amt));
                    break;

                case 2:
                    System.out.println("\nGross Annual Salary: " + salaryCalculator.calculateSalary(amt, bonus));
                    break;

                case 3:
                    System.out.println("\nIn-Hand Annual Salary: " + salaryCalculator.calculateSalary(amt, bonus, taxPercentage));
                    break;

                default:
                    System.out.println("Thank you!!!");
            }

        } while (ch != 4);

    }
}
