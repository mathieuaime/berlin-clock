package com.excilys.berlinclock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalTime;
import org.junit.jupiter.api.Test;

class SingleMinutesRowTest {
    private final SingleMinutesRow singleMinutesRow = new SingleMinutesRow();

    @Test
    void zeroMinute() {
        LocalTime time = LocalTime.of(0, 0, 0);
        String result = this.singleMinutesRow.convert(time);

        assertEquals(result, "OOOO");
    }

    @Test
    void fiftyNineMinutes() {
        LocalTime time = LocalTime.of(23, 59, 59);
        String result = this.singleMinutesRow.convert(time);

        assertEquals(result, "YYYY");
    }

    @Test
    void thirtyTwoMinutes() {
        LocalTime time = LocalTime.of(12, 32, 0);
        String result = this.singleMinutesRow.convert(time);

        assertEquals(result, "YYOO");
    }

    @Test
    void thirtyFourMinutes() {
        LocalTime time = LocalTime.of(12, 34, 0);
        String result = this.singleMinutesRow.convert(time);

        assertEquals(result, "YYYY");
    }

    @Test
    void thirtyFiveMinutes() {
        LocalTime time = LocalTime.of(12, 35, 0);
        String result = this.singleMinutesRow.convert(time);

        assertEquals(result, "OOOO");
    }
}