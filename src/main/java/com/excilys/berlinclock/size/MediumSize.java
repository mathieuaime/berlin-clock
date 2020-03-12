package com.excilys.berlinclock.size;

public interface MediumSize extends Sizeable {
    @Override
    default int rows() {
        return 5;
    }
}
