package com.excilys.berlinclock;

import java.time.LocalTime;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FiveMinutesRow {
    public String convert(LocalTime time) {
        int column = time.getMinute() / 5;
        return IntStream.range(1, 12).mapToObj(i -> display(i, column)).collect(Collectors.joining());
    }

    private String display(int i, int column) {
        return i <= column ? i % 3 == 0 ? "R" : "Y" : "O";
    }
}
