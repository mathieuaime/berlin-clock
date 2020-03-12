package com.excilys.berlinclock.extractor;

import java.time.LocalTime;

public interface Hour extends TimeExtractor {
    @Override
    default int extractTime(LocalTime time) {
        return time.getHour();
    }
}
