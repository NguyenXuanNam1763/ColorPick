package com.example.materialdesignexp.arclayout;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.materialdesignexp.databinding.ActivityArcLayoutBinding;

public class ArcActivity extends AppCompatActivity {

    private ActivityArcLayoutBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.binding = ActivityArcLayoutBinding.inflate(getLayoutInflater());
        setContentView(this.binding.getRoot());
    }
}
