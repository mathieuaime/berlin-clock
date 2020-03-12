package com.excilys.berlinclock.size;

public interface LittleSize extends Sizeable {
    @Override
    default int rows() {
        return 2;
    }
}
