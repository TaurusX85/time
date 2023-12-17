package com.taurusx85.time.model;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Set;

public class WeeklyTimeRule extends TimeRule {

    private Set<DayOfWeek> daysOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

//        Monday 	0	 - 1439
//        Tuesday 	1440 - 2879
//        Wednesday	2880 - 4319
//        Thursday	4320 - 5759
//        Friday	5760 - 7199
//        Saturday	7200 - 8639
//        Sunday	8640 - 10079


    public WeeklyTimeRule(Set<DayOfWeek> daysOfWeek, LocalTime startTime, LocalTime endTime) {
        this.daysOfWeek = Set.copyOf(daysOfWeek);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Set<DayOfWeek> getDaysOfWeek() {
        return daysOfWeek;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
}
