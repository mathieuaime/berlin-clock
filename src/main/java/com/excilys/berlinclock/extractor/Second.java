package com.excilys.berlinclock.extractor;

import java.time.LocalTime;

public interface Second extends TimeExtractor {
    @Override
    default int extractTime(LocalTime time) {
        return time.getSecond();
    }
}
