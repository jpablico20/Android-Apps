package com.example.androidapps.apps;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidapps.R;

import java.time.LocalDate;
import java.time.LocalTime;

public class ShowDate extends AppCompatActivity {

    Button btnShowDate;
    TextView showDate;
    String currentDate, currentTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_date);

        btnShowDate = findViewById(R.id.btn_show_date);
        showDate = findViewById(R.id.show_date);

        btnShowDate.setOnClickListener(v -> {
            currentDate = LocalDate.now().toString();
            currentTime = LocalTime.now().toString();

            showDate.setText(currentDate + " " + currentTime);
        });

    }
}