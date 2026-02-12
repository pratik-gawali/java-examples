package inheritance;

public class SavingsAccount extends BankAccount{
    private final double interestRate=6.0;

    public SavingsAccount(String accountNumber,String holderName, double initialBalance) {

        super(accountNumber,holderName,initialBalance);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void withdraw(double amount) {

        if(balance<=100){
            throw new IllegalStateException("Balance is 100 or below: Withdrawal is not Possible (Min Balance Rule)");
        }
        balance-=amount;
        System.out.println(amount + " Withdraw Successfully");
        System.out.println("Total Balance: " + balance);
    }
}
