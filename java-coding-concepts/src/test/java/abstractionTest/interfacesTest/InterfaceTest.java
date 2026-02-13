package abstractionTest.interfacesTest;

import abstraction.interfaces.ApplePay;
import abstraction.interfaces.CreditCard;
import abstraction.interfaces.PayPal;
import abstraction.interfaces.PaymentMethod;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InterfaceTest {


    // Credit Card Test
    @Test
    public void credit_shouldProcessPayment(){
        PaymentMethod p = new CreditCard();
        assertEquals("Processed Credit Card Payment of $"+25000.0,p.processPayment(25000.0));
    }

    @Test
    public void credit_shouldThrowWhenAmountNegativeOrZero(){
        PaymentMethod p = new CreditCard();
        assertThrows(IllegalArgumentException.class, ()-> p.processPayment(-100));
        assertThrows(IllegalArgumentException.class, ()-> p.processPayment(0));
    }

    // PayPal Test
    @Test
    public void payPal_shouldProcessPayment(){
        PaymentMethod p = new PayPal();
        assertEquals("Processed PayPal Payment of $"+25000.0,p.processPayment(25000.0));
    }

    @Test
    public void payPal_shouldThrowWhenAmountNegativeOrZero(){
        PaymentMethod p = new PayPal();
        assertThrows(IllegalArgumentException.class, ()-> p.processPayment(-100));
        assertThrows(IllegalArgumentException.class, ()-> p.processPayment(0));
    }

    // Apple Pay Test
    @Test
    public void applePay_shouldProcessPayment(){
        PaymentMethod p = new ApplePay();
        assertEquals("Processed Apple Pay Payment of $"+25000.0,p.processPayment(25000.0));
    }

    @Test
    public void applePay_shouldThrowWhenAmountNegativeOrZero(){
        PaymentMethod p = new ApplePay();
        assertThrows(IllegalArgumentException.class, ()-> p.processPayment(-100));
        assertThrows(IllegalArgumentException.class, ()-> p.processPayment(0));
    }

}
