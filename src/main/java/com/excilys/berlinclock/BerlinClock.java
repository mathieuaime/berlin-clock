package com.excilys.berlinclock;

import com.excilys.berlinclock.row.Row;
import java.time.LocalTime;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BerlinClock {
    private static final Row SECONDS_LAMP = new SecondsLamp();
    private static final Row FIVE_HOURS_ROW = new FiveHoursRow();
    private static final Row SINGLE_HOURS_ROW = new SingleHoursRow();
    private static final Row FIVE_MINUTES_ROW = new FiveMinutesRow();
    private static final Row SINGLE_MINUTES_ROW = new SingleMinutesRow();

    public String convert(LocalTime time) {
        return Stream.of(SECONDS_LAMP, FIVE_HOURS_ROW, SINGLE_HOURS_ROW, FIVE_MINUTES_ROW, SINGLE_MINUTES_ROW)
                     .map(r -> r.convert(time))
                     .collect(Collectors.joining());
    }
}
