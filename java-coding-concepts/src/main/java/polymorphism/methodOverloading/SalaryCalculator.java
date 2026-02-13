package polymorphism.methodOverloading;

public class SalaryCalculator {

    public double calculateSalary(double baseSalary){

        if(baseSalary<=0){
            throw new IllegalArgumentException("Base Salary cannot be Zero or Negative");
        }
        return baseSalary;
    }

    public double calculateSalary(double baseSalary, double bonus){

        if(bonus<0 || baseSalary<=0){
            throw new IllegalArgumentException("Cannot be Zero or Negative");
        }
        return baseSalary+bonus;
    }

    public double calculateSalary(double baseSalary, double bonus,double taxPercentage){

        if(bonus<0 || baseSalary<=0){
            throw new IllegalArgumentException("Cannot be Zero or Negative");
        }
        if(taxPercentage<0 || taxPercentage>100){
            throw new IllegalArgumentException("Tax Percentage must be between Zero and 100");
        }
        double gross = baseSalary+bonus;
        double taxAmount=gross*(taxPercentage/100);
        return gross-taxAmount;

    }

}
