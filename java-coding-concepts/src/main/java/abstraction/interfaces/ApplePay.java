package abstraction.interfaces;

public class ApplePay implements PaymentMethod{

    @Override
    public String processPayment(double amount) {

        if(!validateAmount(amount)){
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
        return "Processed Apple Pay Payment of $"+amount;
    }

}
