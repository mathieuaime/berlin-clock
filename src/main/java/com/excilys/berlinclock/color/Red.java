package com.excilys.berlinclock.color;

public interface Red extends Colorable {
    @Override
    default String color(int i) {
        return "R";
    }
}
