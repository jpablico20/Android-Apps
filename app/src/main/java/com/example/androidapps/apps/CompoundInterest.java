package com.example.androidapps.apps;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidapps.R;

import java.util.ArrayList;
import java.util.List;

public class CompoundInterest extends AppCompatActivity {

    EditText etPrincipal, etRate, etTime;
    Spinner spinnerFrequency;
    Button btnCalculate;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compound_interest);

        etPrincipal = findViewById(R.id.et_principal);
        etRate = findViewById(R.id.et_rate);
        etTime = findViewById(R.id.et_time);
        spinnerFrequency = findViewById(R.id.spinner_frequency);
        btnCalculate = findViewById(R.id.btn_calculate);
        tvResult = findViewById(R.id.tv_result);

        List<String> frequencies = new ArrayList<>();
        frequencies.add("Annually");
        frequencies.add("Quarterly");
        frequencies.add("Monthly");
        frequencies.add("Daily");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, frequencies);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFrequency.setAdapter(adapter);

        btnCalculate.setOnClickListener(v -> {
            String principalStr = etPrincipal.getText().toString();
            String rateStr = etRate.getText().toString();
            String timeStr = etTime.getText().toString();
            String frequencyStr = spinnerFrequency.getSelectedItem().toString();

            if (!principalStr.isEmpty() && !rateStr.isEmpty() && !timeStr.isEmpty()) {
                double principal = Double.parseDouble(principalStr);
                double rate = Double.parseDouble(rateStr) / 100;
                double time = Double.parseDouble(timeStr);

                int frequency = getCompoundingFrequency(frequencyStr);

                double compoundInterest = principal * Math.pow((1 + (rate / frequency)), (frequency * time));
                double totalAmount = principal + compoundInterest;

                tvResult.setText(String.format("Total Amount: %.2f\nCompound Interest: %.2f", totalAmount, compoundInterest));
            } else {
                tvResult.setText("Please fill in all the fields.");
            }
        });
    }

    private int getCompoundingFrequency(String frequencyStr) {
        switch (frequencyStr) {
            case "Annually":
                return 1;
            case "Quarterly":
                return 4;
            case "Monthly":
                return 12;
            case "Daily":
                return 365;
            default:
                return 1;
        }
    }
}