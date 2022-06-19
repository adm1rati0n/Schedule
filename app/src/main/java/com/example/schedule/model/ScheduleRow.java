package com.example.schedule.model;

public class ScheduleRow {
    public int rowNumber;
    public boolean isSeparated;
    public Lesson numerator;
    public Lesson denominator;

    public ScheduleRow(int rowNumber, boolean separated, Lesson numerator, Lesson denominator) {
        this.rowNumber = rowNumber;
        this.isSeparated = separated;
        this.numerator = numerator;
        this.denominator = denominator;
    }
}
