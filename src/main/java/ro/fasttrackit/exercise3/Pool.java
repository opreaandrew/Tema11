package ro.fasttrackit.exercise3;

import java.util.Date;

public class Pool {
    private final Date lastChlorinationDate;
    private final Integer numberOfGuests;
    private final Integer guestCapacity;

    public Pool(Date lastChlorinationDate, Integer numberOfGuests, Integer guestCapacity) {
        this.lastChlorinationDate = lastChlorinationDate;
        this.numberOfGuests = numberOfGuests;
        this.guestCapacity = guestCapacity;
    }

    public Date getLastChlorinationDate() {
        return lastChlorinationDate;
    }

    public Integer getNumberOfGuests() {
        return numberOfGuests;
    }

    public Integer getGuestCapacity() {
        return guestCapacity;
    }
}
