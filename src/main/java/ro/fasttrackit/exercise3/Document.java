package ro.fasttrackit.exercise3;

import java.util.Date;

public record Document(
        String madeBy,
        Integer importanceRating,
        Date saveDate
) {
}
