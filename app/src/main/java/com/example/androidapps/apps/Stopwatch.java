package com.example.androidapps.apps;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import com.example.androidapps.R;

public class Stopwatch extends AppCompatActivity {

    private TextView tvTimer;
    private Button btnStart, btnStop, btnReset;

    private Handler handler = new Handler();
    private long startTime = 0, elapsedTime = 0;
    private boolean isRunning = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);

        tvTimer = findViewById(R.id.tvTimer);
        btnStart = findViewById(R.id.btnStart);
        btnStop = findViewById(R.id.btnStop);
        btnReset = findViewById(R.id.btnReset);

        btnStart.setOnClickListener(v -> {
            if (!isRunning) {
                startTime = System.currentTimeMillis() - elapsedTime;
                handler.postDelayed(updateTimer, 0);
                isRunning = true;
            }
        });

        btnStop.setOnClickListener(v -> {
            if (isRunning) {
                handler.removeCallbacks(updateTimer);
                elapsedTime = System.currentTimeMillis() - startTime;
                isRunning = false;
            }
        });

        btnReset.setOnClickListener(v -> {
            if (isRunning) {
                handler.removeCallbacks(updateTimer);
                isRunning = false;
            }
            startTime = 0;
            elapsedTime = 0;
            tvTimer.setText("00:00");
        });

    }

    private Runnable updateTimer = new Runnable() {
        @Override
        public void run() {
            long millis = System.currentTimeMillis() - startTime;
            int seconds = (int) (millis / 1000);
            int minutes = seconds / 60;
            seconds = seconds % 60;

            tvTimer.setText(String.format("%02d:%02d", minutes, seconds));

            handler.postDelayed(this, 1000);
        }
    };

}