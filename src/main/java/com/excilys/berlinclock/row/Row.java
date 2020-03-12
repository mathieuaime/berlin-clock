package com.excilys.berlinclock.row;

import com.excilys.berlinclock.color.Colorable;
import com.excilys.berlinclock.extractor.TimeExtractor;
import com.excilys.berlinclock.size.Sizeable;
import java.time.LocalTime;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface Row extends Colorable, Sizeable, TimeExtractor {
    default String convert(LocalTime time) {
        int column = extract().apply(time);
        return IntStream.range(1, rows()).mapToObj(i -> display(column, i)).collect(Collectors.joining());
    }

    default String display(int rows, int i) {
        return (i <= rows)
               ? color(i)
               : "O";
    }

    Function<LocalTime, Integer> extract();
}
