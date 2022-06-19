package com.example.schedule.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.schedule.R;
import com.example.schedule.model.ScheduleDay;

import java.util.List;

public class DaysAdapter extends RecyclerView.Adapter<DayViewHolder> {
    private final Context mContext;
    private final List<ScheduleDay> mDays;

    public DaysAdapter(Context mContext, List<ScheduleDay> mDays) {
        this.mContext = mContext;
        this.mDays = mDays;
    }

    @NonNull
    @Override
    public DayViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext)
                .inflate(R.layout.item_schedule_day, parent, false);
        return new DayViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull DayViewHolder holder, int position) {
        ScheduleDay item = mDays.get(position);
        holder.setData(item);
    }

    @Override
    public int getItemCount() {
        return mDays.size();
    }
}
