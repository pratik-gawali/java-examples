package encapsulationTest;

import encapsulation.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    //Testing Constructor
    @Test
    void constructor_shouldCreateAccount_whenInputIsValid(){
        BankAccount acc = new BankAccount("ACC3456","John",100.0);
        assertEquals("ACC3456",acc.getAccountNumber());
        assertEquals("John",acc.getHolderName());
        assertEquals(100.0,acc.getBalance());
    }

    @Test
    void constructor_shouldThrowException_whenAccountNumberBlank(){

        assertThrows(IllegalArgumentException.class,() -> new BankAccount("","John",100.0));

    }

    @Test
    void constructor_shouldThrowException_whenHolderNameBlank(){

        assertThrows(IllegalArgumentException.class,() -> new BankAccount("ACC3456","",100.0));

    }
    @Test
    void constructor_shouldThrowException_whenInitialBalanceNegative(){

        assertThrows(IllegalArgumentException.class,() -> new BankAccount("ACC3456","",-1.0));

    }

    //Testing Deposit Method
    @Test
    void deposit_shouldIncreaseBalance_whenAmountPositive(){

        BankAccount acc = new BankAccount("ACC3456","John",100.0);
        acc.deposit(300);
        assertEquals(400,acc.getBalance(),0.0001); //3rd Argument is for Delta

    }
    @Test
    void deposit_shouldThrowException_whenAmountZeroOrNegative(){

        BankAccount acc = new BankAccount("ACC3456","John",100.0);
        assertThrows(IllegalArgumentException.class,() -> acc.deposit(0));
        assertThrows(IllegalArgumentException.class,() -> acc.deposit(-10.0));

    }

    //Testing Deposit Method
    @Test
    void withdraw_shouldDecreaseBalance_whenAmountValid(){

        BankAccount acc = new BankAccount("ACC3456","John",500.0);
        acc.withdraw(300);
        assertEquals(200,acc.getBalance(),0.0001);

    }

    @Test
    void withdraw_shouldThrowException_whenAmountZeroOrNegative(){

        BankAccount acc = new BankAccount("ACC3456","John",100.0);
        assertThrows(IllegalArgumentException.class,() -> acc.withdraw(0));
        assertThrows(IllegalArgumentException.class,() -> acc.withdraw(-10));

    }

    @Test
    void withdraw_shouldThrowException_whenBalanceInsufficient(){

        BankAccount acc = new BankAccount("ACC3456","John",100.0);
        assertThrows(IllegalStateException.class,() -> acc.withdraw(150));

    }

}
