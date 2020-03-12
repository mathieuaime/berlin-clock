package com.excilys.berlinclock.color;

public interface Yellow extends Colorable {
    @Override
    default String color(int i) {
        return "Y";
    }
}
