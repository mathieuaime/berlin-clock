package com.excilys.berlinclock;

import java.time.LocalTime;

public class BerlinClock {
    private static final SecondsLamp SECONDS_LAMP = new SecondsLamp();
    private static final FiveHoursRow FIVE_HOURS_ROW = new FiveHoursRow();
    private static final SingleHoursRow SINGLE_HOURS_ROW = new SingleHoursRow();
    private static final FiveMinutesRow FIVE_MINUTES_ROW = new FiveMinutesRow();
    private static final SingleMinutesRow SINGLE_MINUTES_ROW = new SingleMinutesRow();

    public String convert(LocalTime time) {
        return SECONDS_LAMP.convert(time) + FIVE_HOURS_ROW.convert(time) + SINGLE_HOURS_ROW.convert(time)
                + FIVE_MINUTES_ROW.convert(time) + SINGLE_MINUTES_ROW.convert(time);
    }
}
