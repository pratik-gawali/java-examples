package inheritance;

public class BankAccount {
    protected double balance=0.0;
    private final String holderName;
    private final String accountNumber;

    public BankAccount(String accountNumber,String holderName, double initialBalance) {

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
}