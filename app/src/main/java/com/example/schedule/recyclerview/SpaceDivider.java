package com.example.schedule.recyclerview;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SpaceDivider extends RecyclerView.ItemDecoration{
    private final int height;

    public SpaceDivider(int height) {
        this.height = height;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        outRect.bottom = height;
    }
}
