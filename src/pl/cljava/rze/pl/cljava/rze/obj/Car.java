package pl.cljava.rze.pl.cljava.rze.obj;

/**
 * Created by pakz on 2017-01-17.
 */
public class Car extends Vehicle {

    private String brand;
    private String model;

    @Override
    public String getEngine() {
        return String.format("This car has {0} engine and is {1} wide", this.getEngineName(), this.getEngineCM());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
