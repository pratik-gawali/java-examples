package abstraction.interfaces;

public interface PaymentMethod {

    public String processPayment(double amount);

    default boolean validateAmount(double amount){
        return amount>0;
    }

}
