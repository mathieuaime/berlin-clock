package com.excilys.berlinclock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalTime;
import org.junit.jupiter.api.Test;

class FiveHoursRowTest {
    private final FiveHoursRow fiveHoursRow = new FiveHoursRow();

    @Test
    void zeroHour() {
        LocalTime time = LocalTime.of(0, 0, 0);
        String result = this.fiveHoursRow.convert(time);

        assertEquals(result, "OOOO");
    }

    @Test
    void twentyThreeHours() {
        LocalTime time = LocalTime.of(23, 59, 59);
        String result = this.fiveHoursRow.convert(time);

        assertEquals(result, "RRRR");
    }

    @Test
    void twoHours() {
        LocalTime time = LocalTime.of(2, 4, 0);
        String result = this.fiveHoursRow.convert(time);

        assertEquals(result, "OOOO");
    }

    @Test
    void eighthours() {
        LocalTime time = LocalTime.of(8, 23, 0);
        String result = this.fiveHoursRow.convert(time);

        assertEquals(result, "ROOO");
    }

    @Test
    void fourteenHours() {
        LocalTime time = LocalTime.of(16, 35, 0);
        String result = this.fiveHoursRow.convert(time);

        assertEquals(result, "RRRO");
    }
}