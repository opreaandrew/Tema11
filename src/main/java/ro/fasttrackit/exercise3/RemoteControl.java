package ro.fasttrackit.exercise3;

public class RemoteControl {
    private final Boolean hasBatteryCharge;
    private final Double operatingFrequency;

    public RemoteControl(Boolean hasBatteryCharge, Double operatingFrequency) {
        this.hasBatteryCharge = hasBatteryCharge;
        this.operatingFrequency = operatingFrequency;
    }

    public Boolean getHasBatteryCharge() {
        return hasBatteryCharge;
    }

    public Double getOperatingFrequency() {
        return operatingFrequency;
    }
}
