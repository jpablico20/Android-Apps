package com.example.androidapps.apps;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidapps.R;

public class Timer extends AppCompatActivity {

    EditText etTime;
    Button btnStart, btnPause, btnReset;
    TextView tvTimer;

    CountDownTimer countDownTimer;
    boolean isRunning = false;
    long timeLeftInMillis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        etTime = findViewById(R.id.et_time);
        btnStart = findViewById(R.id.btn_start);
        btnPause = findViewById(R.id.btn_pause);
        btnReset = findViewById(R.id.btn_reset);
        tvTimer = findViewById(R.id.tv_timer);

        btnStart.setOnClickListener(v -> {
            String input = etTime.getText().toString();

            if (input.isEmpty()) {
                etTime.setError("Please enter a valid number");
                return;
            }

            int setTime = Integer.parseInt(input);

            if (!isRunning) {
                if (timeLeftInMillis == 0) {
                    timeLeftInMillis = setTime * 1000;
                }
                startTimer(timeLeftInMillis);
                isRunning = true;
            }
        });

        btnPause.setOnClickListener(v -> {
            if (isRunning) {
                countDownTimer.cancel();
                isRunning = false;
            }
        });

        btnReset.setOnClickListener(v -> {
            if (isRunning) {
                countDownTimer.cancel();
                isRunning = false;
            }
            timeLeftInMillis = 0;
            tvTimer.setText("0");
            etTime.setText("");
        });

    }

    private void startTimer(long millisInFuture) {
        countDownTimer = new CountDownTimer(millisInFuture, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis = millisUntilFinished;
                int secondsLeft = (int) (millisUntilFinished / 1000);

                tvTimer.setText(String.format("%02d", secondsLeft));
            }

            @Override
            public void onFinish() {
                tvTimer.setText("0");
                isRunning = false;
                timeLeftInMillis = 0;
            }
        }.start();
    }
}