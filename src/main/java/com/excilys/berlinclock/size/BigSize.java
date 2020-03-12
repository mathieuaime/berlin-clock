package com.excilys.berlinclock.size;

public interface BigSize extends Sizeable {
    @Override
    default int rows() {
        return 12;
    }
}
