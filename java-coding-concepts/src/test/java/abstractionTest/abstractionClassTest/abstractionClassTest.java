package abstractionTest.abstractionClassTest;
import abstraction.abstractClass.Car;
import abstraction.abstractClass.Motorcycle;
import abstraction.abstractClass.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class abstractionClassTest {


    //Constructor testing
    @Test
    public void car_constructorShouldThrowExceptionWhenNullOrBlank(){

        assertThrows(IllegalArgumentException.class,()->new Car(""));
    }

    @Test
    public void motorcycle_constructorShouldThrowExceptionWhenNullOrBlank(){

        assertThrows(IllegalArgumentException.class,()->new Motorcycle(""));
    }

    // Start Engine testing
    @Test
    public void car_startEngineShouldReturnModel(){

        Vehicle v = new Car("BMW");
        assertEquals("\nCar Engine started for BMW",v.startEngine());
    }

    @Test
    public void motorcycle_startEngineShouldReturnModel(){

        Vehicle v = new Motorcycle("R15");
        assertEquals("\nMotorcycle Engine started for R15",v.startEngine());
    }

    // Stop Engine testing
    @Test
    public void car_stopEngineShouldShutDownForModel(){

        Vehicle v = new Car("BMW");
        assertEquals("Engine stopped for BMW",v.stopEngine());
    }

    @Test
    public void motorcycle_stopEngineShouldShutDownForModel(){

        Vehicle v = new Motorcycle("R15");
        assertEquals("Engine stopped for R15",v.stopEngine());
    }

}
