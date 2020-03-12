package com.excilys.berlinclock.color;

public interface YellowAndRed extends Colorable {
    @Override
    default String color(int i) {
        return i % 3 == 0
               ? "R"
               : "Y";
    }
}
