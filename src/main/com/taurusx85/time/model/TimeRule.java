package com.taurusx85.time.model;

import java.time.LocalDateTime;

public abstract class TimeRule {

    private String name;

    public abstract boolean match(LocalDateTime time);
}
