package com.excilys.berlinclock.extractor;

import java.time.LocalTime;

public interface Minute extends TimeExtractor {
    @Override
    default int extractTime(LocalTime time) {
        return time.getMinute();
    }
}
