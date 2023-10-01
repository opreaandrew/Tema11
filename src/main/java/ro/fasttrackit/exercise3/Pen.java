package ro.fasttrackit.exercise3;

public class Pen {
    private final Boolean hasSpring;
    private final Boolean hasInk;

    public Pen(Boolean hasSpring, Boolean hasInk) {
        this.hasSpring = hasSpring;
        this.hasInk = hasInk;
    }

    public Boolean getHasSpring() {
        return hasSpring;
    }

    public Boolean getHasInk() {
        return hasInk;
    }
}
