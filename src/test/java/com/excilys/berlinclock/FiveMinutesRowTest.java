package com.excilys.berlinclock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalTime;
import org.junit.jupiter.api.Test;

class FiveMinutesRowTest {
    private final FiveMinutesRow fiveMinutesRow = new FiveMinutesRow();

    @Test
    void zeroMinute() {
        LocalTime time = LocalTime.of(0, 0, 0);
        String result = this.fiveMinutesRow.convert(time);

        assertEquals(result, "OOOOOOOOOOO");
    }

    @Test
    void fiftyNineMinutes() {
        LocalTime time = LocalTime.of(23, 59, 59);
        String result = this.fiveMinutesRow.convert(time);

        assertEquals(result, "YYRYYRYYRYY");
    }

    @Test
    void thirtyTwoMinutes() {
        LocalTime time = LocalTime.of(12, 4, 0);
        String result = this.fiveMinutesRow.convert(time);

        assertEquals(result, "OOOOOOOOOOO");
    }

    @Test
    void thirtyFourMinutes() {
        LocalTime time = LocalTime.of(12, 23, 0);
        String result = this.fiveMinutesRow.convert(time);

        assertEquals(result, "YYRYOOOOOOO");
    }

    @Test
    void thirtyFiveMinutes() {
        LocalTime time = LocalTime.of(12, 35, 0);
        String result = this.fiveMinutesRow.convert(time);

        assertEquals(result, "YYRYYRYOOOO");
    }
}