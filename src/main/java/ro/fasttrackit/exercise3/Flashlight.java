package ro.fasttrackit.exercise3;

public class Flashlight {
    private final Boolean hasCharge;
    private final Integer lumenCount;
    private final Boolean canBeUsedAsWeapon;

    public Flashlight(Boolean hasCharge, Integer lumenCount, Boolean canBeUsedAsWeapon) {
        this.hasCharge = hasCharge;
        this.lumenCount = lumenCount;
        this.canBeUsedAsWeapon = canBeUsedAsWeapon;
    }

    public Boolean getHasCharge() {
        return hasCharge;
    }

    public Integer getLumenCount() {
        return lumenCount;
    }

    public Boolean getCanBeUsedAsWeapon() {
        return canBeUsedAsWeapon;
    }
}
