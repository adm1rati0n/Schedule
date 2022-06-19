package com.example.schedule.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.schedule.R;
import com.example.schedule.model.ScheduleDay;
import com.example.schedule.model.ScheduleRow;

public class DayViewHolder extends RecyclerView.ViewHolder{
    private final LinearLayout rowsContainer;
    private final TextView dayView, buildingView;

    public DayViewHolder(@NonNull View itemView) {
        super(itemView);

        rowsContainer = itemView.findViewById(R.id.rows_container);
        dayView = itemView.findViewById(R.id.txt_day);
        buildingView = itemView.findViewById(R.id.txt_building);
    }

    public void setData(ScheduleDay day) {
        dayView.setText(day.day);
        buildingView.setText(day.building);
        LayoutInflater inflater = LayoutInflater.from(itemView.getContext());

        for (ScheduleRow row : day.rows) {
            View rowView = getRowView(inflater, row);
            rowsContainer.addView(rowView);
        }
    }

    // генерация вьюхи
    private View getRowView(LayoutInflater inflater, ScheduleRow row) {
        View rowView;

        if (row.isSeparated) {
            rowView = inflater.inflate(R.layout.item_separated_schedule_row, rowsContainer, false);

            TextView numberView = rowView.findViewById(R.id.txt_number);
            numberView.setText(Integer.toString(row.rowNumber));

            TextView numLessonView = rowView.findViewById(R.id.txt_num_lesson);
            numLessonView.setText(row.numerator.name);

            TextView numTeacherView = rowView.findViewById(R.id.txt_num_teacher);
            numTeacherView.setText(row.numerator.teacher);

            TextView denLessonView = rowView.findViewById(R.id.txt_den_lesson);
            denLessonView.setText(row.denominator.name);

            TextView denTeacherView = rowView.findViewById(R.id.txt_den_teacher);
            denTeacherView.setText(row.denominator.teacher);
        }
        else {
            rowView = inflater.inflate(R.layout.item_schedule_row, rowsContainer, false);

            TextView numberView = rowView.findViewById(R.id.txt_number);
            numberView.setText(Integer.toString(row.rowNumber));

            TextView lessonView = rowView.findViewById(R.id.txt_lesson);
            lessonView.setText(row.numerator.name);

            TextView teacherView = rowView.findViewById(R.id.txt_teacher);
            teacherView.setText(row.numerator.teacher);
        }
        return rowView;
    }
}
