package ro.fasttrackit.exercise3;

import java.util.Date;

public class School {
    private final String schoolName;
    private final Integer numberOfStudents;
    private final Date lastSchoolShooting;

    public School(String schoolName, Integer numberOfStudents, Date lastSchoolShooting) {
        this.schoolName = schoolName;
        this.numberOfStudents = numberOfStudents;
        this.lastSchoolShooting = lastSchoolShooting;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public Integer getNumberOfStudents() {
        return numberOfStudents;
    }

    public Date getLastSchoolShooting() {
        return lastSchoolShooting;
    }
}
