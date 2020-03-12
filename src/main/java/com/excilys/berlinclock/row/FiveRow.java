package com.excilys.berlinclock.row;

import java.time.LocalTime;
import java.util.function.Function;

public interface FiveRow extends Row {
    @Override
    default Function<LocalTime, Integer> extract() {
        return i -> extractTime(i) / 5;
    }
}
