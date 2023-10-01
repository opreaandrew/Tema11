package ro.fasttrackit.exercise3;

public class OperatingSystem {
    private final Boolean isLinux;
    private final Double availableRAM;
    private final Double availableCpuPercentage;

    public OperatingSystem(Boolean isLinux, Double availableRAM, Double availableCpuPercentage) {
        this.isLinux = isLinux;
        this.availableRAM = availableRAM;
        this.availableCpuPercentage = availableCpuPercentage;
    }

    public Boolean getLinux() {
        return isLinux;
    }

    public Double getAvailableRAM() {
        return availableRAM;
    }

    public Double getAvailableCpuPercentage() {
        return availableCpuPercentage;
    }
}
