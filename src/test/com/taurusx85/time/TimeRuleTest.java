package com.taurusx85.time;

import com.taurusx85.time.model.*;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class TimeRuleTest {

    public static void main(String[] args) {
        TimeRule dateTimeRule = new DateTimeRule(LocalDateTime.parse("2023-12-15T07:00:00"), LocalDateTime.parse("2023-12-17T19:00:00"));
        dateTimeRule.match(LocalDateTime.parse("2023-12-16T09:40:00"));

        Set<MonthDay> days = Set.of(MonthDay.of(Month.MAY, 17), MonthDay.of(Month.MAY, 26));
        TimeRule monthlyTimeRule = new MontlyTimeRule(days, LocalTime.parse("07:00:00"), LocalTime.parse("07:30:00"));
        monthlyTimeRule.match(LocalDateTime.parse("2023-05-17T07:40:00"));

        Set<DayOfWeek> daysOfWeek = Set.of(DayOfWeek.SUNDAY, DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY);
        TimeRule weeklyTimeRule = new WeeklyTimeRule(daysOfWeek, LocalTime.parse("08:00:00"), LocalTime.parse("17:00:00"));
        weeklyTimeRule.match(LocalDateTime.parse("2023-12-17T14:20:00"));

        TimeRule dailyTimeRule = new DailyTimeRule(LocalTime.parse("21:00:00"), LocalTime.parse("22:00:00"));
        dailyTimeRule.match(LocalDateTime.parse("2023-12-17T21:50:00"));

    }

}
