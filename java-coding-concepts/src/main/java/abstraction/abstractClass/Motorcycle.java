package abstraction.abstractClass;

public class Motorcycle extends Vehicle{

    public Motorcycle(String model){

        super(model);
    }

    public String startEngine(){
        return "\nMotorcycle Engine started for "+model;
    }
}
