package com.taurusx85.time.model;

import java.time.LocalTime;
import java.time.MonthDay;
import java.util.Set;

public class MontlyTimeRule extends TimeRule {

    private Set<MonthDay> days;
    private LocalTime startTime;
    private LocalTime endTime;

    public MontlyTimeRule(Set<MonthDay> days, LocalTime startTime, LocalTime endTime) {
        this.days = Set.copyOf(days);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Set<MonthDay> getDays() {
        return days;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
}
