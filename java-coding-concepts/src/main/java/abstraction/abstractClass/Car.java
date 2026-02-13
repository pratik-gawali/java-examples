package abstraction.abstractClass;

public class Car extends Vehicle{

    public Car(String model){
        super(model);
    }

    public String startEngine(){
        return "\nCar Engine started for "+model;
    }
}
