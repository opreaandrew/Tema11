package ro.fasttrackit.exercise3;

import java.util.Date;

public class Milk {
    private final Date expirationDate;
    private final Double quantity;

    public Milk(Date expirationDate, Double quantity) {
        this.expirationDate = expirationDate;
        this.quantity = quantity;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public Double getQuantity() {
        return quantity;
    }
}
