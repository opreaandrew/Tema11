package ro.fasttrackit.exercise3;

public class Telephone {
    private final String os;
    private final Double version;
    private final Boolean isOn;

    public Telephone(String os, Double version, Boolean isOn) {
        this.os = os;
        this.version = version;
        this.isOn = isOn;
    }

    public String getOs() {
        return os;
    }

    public Double getVersion() {
        return version;
    }

    public Boolean getOn() {
        return isOn;
    }
}
