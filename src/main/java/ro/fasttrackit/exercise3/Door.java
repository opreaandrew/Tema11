package ro.fasttrackit.exercise3;

public class Door {
    private final Boolean isOpen;
    private final Integer securityRating;

    public Door(Boolean isOpen, Integer securityRating) {
        this.isOpen = isOpen;
        this.securityRating = securityRating;
    }

    public Boolean getOpen() {
        return isOpen;
    }

    public Integer getSecurityRating() {
        return securityRating;
    }
}
