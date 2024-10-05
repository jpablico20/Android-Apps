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

public class BmiSolver extends AppCompatActivity {

    EditText etHeight, etWeight;
    Button btnCalculate;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_bmi_solver);

        etHeight = findViewById(R.id.et_height);
        etWeight = findViewById(R.id.et_weight);
        btnCalculate = findViewById(R.id.btn_calculate);
        tvResult = findViewById(R.id.tv_result);

        btnCalculate.setOnClickListener(v -> {
            String heightStr = etHeight.getText().toString();
            String weightStr = etWeight.getText().toString();

            if (!heightStr.isEmpty() && !weightStr.isEmpty()) {
                double height = Double.parseDouble(heightStr);
                double weight = Double.parseDouble(weightStr);

                double bmi = weight / (height * height);

                tvResult.setText(String.format("Your BMI is: %.2f", bmi));
            } else {
                tvResult.setText("Please enter valid height and weight.");
            }
        });

    }
}