package com.excilys.berlinclock;

import java.time.LocalTime;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SingleHoursRow {
    public String convert(LocalTime time) {
        int column = time.getHour() % 5;
        return IntStream.range(1, 5).mapToObj(i -> display(i, column)).collect(Collectors.joining());
    }

    private String display(int i, int column) {
        return i <= column ? "R" : "O";
    }
}
