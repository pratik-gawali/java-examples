package abstraction.interfaces;

public class CreditCard implements PaymentMethod{

    @Override
    public String processPayment(double amount) {

        if(!validateAmount(amount)){
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
        return "Processed Credit Card Payment of $"+amount;
    }
}
