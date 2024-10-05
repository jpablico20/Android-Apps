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

public class SimpleInterest extends AppCompatActivity {

    EditText etPrincipal, etRate, etTime;
    Button btnCalculate;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_interest);

        etPrincipal = findViewById(R.id.et_principal);
        etRate = findViewById(R.id.et_rate);
        etTime = findViewById(R.id.et_time);
        btnCalculate = findViewById(R.id.btn_calculate);
        tvResult = findViewById(R.id.tv_result);

        btnCalculate.setOnClickListener(v -> {
            String principalStr = etPrincipal.getText().toString();
            String rateStr = etRate.getText().toString();
            String timeStr = etTime.getText().toString();

            if (!principalStr.isEmpty() && !rateStr.isEmpty() && !timeStr.isEmpty()) {
                double principal = Double.parseDouble(principalStr);
                double rate = Double.parseDouble(rateStr) / 100 ;
                double time = Double.parseDouble(timeStr);

                double simpleInterest = principal * (1 + (rate * time));

                tvResult.setText(String.format("Simple Interest: %.2f", simpleInterest));
            } else {
                tvResult.setText("Please fill in all the fields.");
            }
        });

    }
}