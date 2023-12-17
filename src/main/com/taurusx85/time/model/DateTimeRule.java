package com.taurusx85.time.model;

import java.time.LocalDateTime;

public class DateTimeRule extends TimeRule {

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public DateTimeRule(LocalDateTime startTime, LocalDateTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
