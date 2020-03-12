package com.excilys.berlinclock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalTime;
import org.junit.jupiter.api.Test;

class BerlinClockTest {
    private final BerlinClock berlinClock = new BerlinClock();

    @Test
    void midnight() {
        LocalTime time = LocalTime.of(0, 0, 0);
        String result = this.berlinClock.convert(time);

        assertEquals(result, "YOOOOOOOOOOOOOOOOOOOOOOO");
    }

    @Test
    void twentyThreeHoursFiftyNineMinutesFiftyNineSeconds() {
        LocalTime time = LocalTime.of(23, 59, 59);
        String result = this.berlinClock.convert(time);

        assertEquals(result, "ORRRRRRROYYRYYRYYRYYYYYY");
    }

    @Test
    void sixteenHoursFiftyMinutesSixSeconds() {
        LocalTime time = LocalTime.of(16, 50, 6);
        String result = this.berlinClock.convert(time);

        assertEquals(result, "YRRROROOOYYRYYRYYRYOOOOO");
    }

    @Test
    void elevenHoursThirtySevenMinutesOneSecond() {
        LocalTime time = LocalTime.of(11, 37, 1);
        String result = this.berlinClock.convert(time);

        assertEquals(result, "ORROOROOOYYRYYRYOOOOYYOO");
    }
}