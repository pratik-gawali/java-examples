package inheritance;

public class CurrentAccount extends BankAccount{
    private String holderName;
    private String accountNumber;
    private double overdraftLimit=500.0;
    private double maxLimit=600.0;


    public CurrentAccount(String accountNumber,String holderName, double initialBalance) {

        super(accountNumber,holderName,initialBalance);
    }
    public void withdraw(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }
        if (balance-amount < -overdraftLimit) {
            throw new IllegalStateException("Overdraft Limit Exceeded");
        }

        balance -= amount;
        System.out.println(amount + " Withdraw Successfully");
        System.out.println("Total Balance: " + balance);

    }

}
