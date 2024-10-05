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

public class OddSumCalculator extends AppCompatActivity {

    EditText etNumber;
    Button btnCalculate;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odd_sum_calculator);

        etNumber = findViewById(R.id.et_number);
        btnCalculate = findViewById(R.id.btn_calculate);
        tvResult = findViewById(R.id.tv_result);

        btnCalculate.setOnClickListener(v -> {
            int getNum = Integer.parseInt(etNumber.getText().toString());
            int getSum = 0;

            for (int i = 1; i <= getNum; i++){
                if (i % 2 == 1) {
                    getSum += i;
                }
            }

            tvResult.setText(String.format("Sum of odd numbers up to %d is: %d", getNum, getSum));
        });

    }
}
