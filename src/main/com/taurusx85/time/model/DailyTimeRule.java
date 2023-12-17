package com.taurusx85.time.model;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class DailyTimeRule extends TimeRule {

    private LocalTime startTime;
    private LocalTime endTime;

    public DailyTimeRule(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    @Override
    public boolean match(LocalDateTime dateTime) {
        LocalTime time = dateTime.toLocalTime();
        return !startTime.isAfter(time)  &&  !time.isAfter(endTime);
    }
}
