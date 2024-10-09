package com.example.androidapps.apps;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.androidapps.R;

import java.util.Random;

public class GenerateRandomColor extends AppCompatActivity {

    Button btnRandomColor;
    TextView tvColorDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_random_color);

        btnRandomColor = findViewById(R.id.btn_random_color);
        tvColorDisplay = findViewById(R.id.tv_color_display);

        btnRandomColor.setOnClickListener(v -> {
            int color = generateRandomColor();

            tvColorDisplay.setBackgroundColor(color);

            String hexColor = String.format("#%06X", (0xFFFFFF & color));
            tvColorDisplay.setText(hexColor);

        });

    }

    private int generateRandomColor() {
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);

        return Color.rgb(red, green, blue);
    }
}

