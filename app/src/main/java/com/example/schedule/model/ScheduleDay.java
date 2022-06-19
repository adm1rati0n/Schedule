package com.example.schedule.model;

import java.util.ArrayList;
import java.util.List;

public class ScheduleDay {
    public List<ScheduleRow> rows = new ArrayList<>();
    public String day;
    public String building;

    public ScheduleDay(String day, String building) {
        this.day = day;
        this.building = building;
    }

    public void fill(List<ScheduleRow> rows) {
        this.rows = new ArrayList<>(rows);
    }
}
