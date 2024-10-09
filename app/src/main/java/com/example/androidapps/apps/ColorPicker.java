package com.example.androidapps.apps;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidapps.R;

public class ColorPicker extends AppCompatActivity {

    private TextView tvSelectedColor, tvSample;
    Button btnRed, btnGreen, btnBlue, btnYellow, btnOrange,
            btnPurple, btnPink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_picker);

        tvSelectedColor = findViewById(R.id.tv_selected_color);
        tvSample = findViewById(R.id.tv_sample);
        btnRed = findViewById(R.id.btn_red);
        btnGreen = findViewById(R.id.btn_green);
        btnBlue = findViewById(R.id.btn_blue);
        btnYellow = findViewById(R.id.btn_yellow);
        btnOrange = findViewById(R.id.btn_orange);
        btnPurple = findViewById(R.id.btn_purple);
        btnPink = findViewById(R.id.btn_pink);

        btnRed.setOnClickListener(v -> {
            setColor("Red", Color.RED);
        });

        btnGreen.setOnClickListener(v -> {
            setColor("Green", Color.GREEN);
        });

        btnBlue.setOnClickListener(v -> {
            setColor("Blue", Color.BLUE);
        });

        btnYellow.setOnClickListener(v -> {
            setColor("Yellow", Color.YELLOW);
        });

        btnOrange.setOnClickListener(v -> {
            setColor("Orange", Color.parseColor("#FFA500"));
        });

        btnPurple.setOnClickListener(v -> {
            setColor("Purple", Color.parseColor("#800080"));
        });

        btnPink.setOnClickListener(v -> {
            setColor("Pink", Color.parseColor("#FFC0CB"));
        });
    }

    private void setColor(String colorName, int colorCode) {
        tvSelectedColor.setText("Selected Color: " + colorName);
        tvSample.setBackgroundColor(colorCode);
    }

}