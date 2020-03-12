package com.excilys.berlinclock;

import java.time.LocalTime;

public class SecondsLamp {
    public String convert(LocalTime time) {
        return time.getSecond() % 2 == 0 ? "Y" : "O";
    }
}
