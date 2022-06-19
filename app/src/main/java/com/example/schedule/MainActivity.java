package com.example.schedule;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.schedule.model.Schedule;
import com.example.schedule.model.ScheduleDay;
import com.example.schedule.recyclerview.DaysAdapter;
import com.example.schedule.recyclerview.SpaceDivider;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Schedule schedule = new Schedule();
        List<ScheduleDay> days = new LinkedList<>(Arrays.asList(
                schedule.MONDAY,
                schedule.TUESDAY,
                schedule.WEDNESDAY,
                schedule.THURSDAY,
                schedule.FRIDAY
        ));

        RecyclerView daysView = findViewById(R.id.rv_days);
        daysView.setAdapter(new DaysAdapter(this, days));
        daysView.addItemDecoration(new SpaceDivider(20));
    }
}