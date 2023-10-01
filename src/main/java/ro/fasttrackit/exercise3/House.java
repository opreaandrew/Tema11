package ro.fasttrackit.exercise3;

public class House {
    private final Boolean isLocked;
    private final Boolean stoveTurnedOn;
    private final String ownerName;

    public House(Boolean isLocked, Boolean stoveTurnedOn, String ownerName) {
        this.isLocked = isLocked;
        this.stoveTurnedOn = stoveTurnedOn;
        this.ownerName = ownerName;
    }

    public Boolean getLocked() {
        return isLocked;
    }

    public Boolean getStoveTurnedOn() {
        return stoveTurnedOn;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
