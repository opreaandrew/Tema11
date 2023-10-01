package ro.fasttrackit.exercise3;

public class Person {
    private final String name;
    private final String eyeColor;
    private final Boolean hasAcnee;

    public Person(String name, String eyeColor, Boolean hasAcnee) {
        this.name = name;
        this.eyeColor = eyeColor;
        this.hasAcnee = hasAcnee;
    }

    public String getName() {
        return name;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public Boolean getHasAcnee() {
        return hasAcnee;
    }


}
