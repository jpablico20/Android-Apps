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

public class Counter extends AppCompatActivity {

    Button btnAddCount;
    TextView showCounter;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        btnAddCount = findViewById(R.id.btn_add_count);
        showCounter = findViewById(R.id.show_counter);

        btnAddCount.setOnClickListener(v -> {
            counter++;

            showCounter.setText("Counter: " + counter);
        });

    }
}