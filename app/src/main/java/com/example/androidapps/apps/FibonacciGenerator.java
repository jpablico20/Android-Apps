package com.example.androidapps.apps;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidapps.R;

import java.util.ArrayList;

public class FibonacciGenerator extends AppCompatActivity {

    EditText etTerms;
    Button btnGenerate;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci_generator);

        etTerms = findViewById(R.id.et_terms);
        btnGenerate = findViewById(R.id.btn_generate);
        tvResult = findViewById(R.id.tv_result);

        btnGenerate.setOnClickListener(v -> generateFibonacci());
    }

    private void generateFibonacci() {
        String termsStr = etTerms.getText().toString();
        if (!termsStr.isEmpty()) {
            int terms = Integer.parseInt(termsStr);
            ArrayList<Integer> fibonacciSeries = new ArrayList<>();

            for (int i = 0; i < terms; i++) {
                if (i == 0) {
                    fibonacciSeries.add(0);
                } else if (i == 1) {
                    fibonacciSeries.add(1);
                } else {
                    int nextTerm = fibonacciSeries.get(i - 1) + fibonacciSeries.get(i - 2);
                    fibonacciSeries.add(nextTerm);
                }
            }

            tvResult.setText(fibonacciSeries.toString());
        } else {
            tvResult.setText("Please enter a number.");
        }
    }
}