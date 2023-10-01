package ro.fasttrackit.exercise3;

public class Bike {
    private final String fuelType;
    private final String maker;
    private final Integer maxTorque;

    public Bike(String fuelType, String maker, Integer maxTorque) {
        this.fuelType = fuelType;
        this.maker = maker;
        this.maxTorque = maxTorque;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getMaker() {
        return maker;
    }

    public Integer getMaxTorque() {
        return maxTorque;
    }
}
