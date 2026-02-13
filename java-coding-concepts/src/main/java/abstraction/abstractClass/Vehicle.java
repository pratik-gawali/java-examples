package abstraction.abstractClass;

public abstract class Vehicle {

    protected String model;

    public Vehicle(String model) {

        if(model == null || model.isBlank()){
            throw new IllegalArgumentException("Model cannot be null or blank");
        }
        this.model=model;
    }

    // Abstract Method
    public abstract String startEngine();


    // Concrete Method
    public String stopEngine(){
        return "Engine stopped for "+model;
    }

}
