package com.excilys.berlinclock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalTime;
import org.junit.jupiter.api.Test;

class SecondsLampTest {
    private final SecondsLamp secondsLamp = new SecondsLamp();

    @Test
    void zeroSecond() {
        LocalTime time = LocalTime.of(0, 0, 0);
        String result = this.secondsLamp.convert(time);

        assertEquals(result, "Y");
    }

    @Test
    void fiftyNineSeconds() {
        LocalTime time = LocalTime.of(23, 59, 59);
        String result = this.secondsLamp.convert(time);

        assertEquals(result, "O");
    }
}