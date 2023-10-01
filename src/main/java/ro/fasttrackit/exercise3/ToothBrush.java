package ro.fasttrackit.exercise3;

import java.util.Date;

public record ToothBrush(
        Boolean isElectric,
        Date changedOn,
        Boolean isSoft
) {
}
