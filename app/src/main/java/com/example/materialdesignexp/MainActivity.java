package com.example.materialdesignexp;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.materialdesignexp.databinding.ActivityMainBinding;
import com.example.materialdesignexp.madrapps.pikolo.components.listeners.OnColorSelectionListener;


public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(this.binding.getRoot());

        Utils.log("namnam");

        int color = Color.parseColor("#2f80ec");
        binding.ivColor.setBackgroundColor(color);
        this.binding.rgbPicker.setColor(color);
        binding.rgbPicker.setColorBorder(color);

        this.binding.rgbPicker.setColorSelectionListener(new OnColorSelectionListener() {
            @Override
            public void onColorSelected(int i) {
                binding.ivColor.setBackgroundColor(i);
                binding.rgbPicker.setColorBorder(i);

            }

            @Override
            public void onColorSelectionStart(int i) {

            }

            @Override
            public void onColorSelectionEnd(int i) {

            }
        });
    }
}