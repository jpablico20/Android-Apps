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

public class DivisibleChecker extends AppCompatActivity {

    EditText etFirstNumber, etSecondNumber;
    Button btnDivisibility;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisible_checker);

        etFirstNumber = findViewById(R.id.et_first_num);
        etSecondNumber = findViewById(R.id.et_second_num);
        btnDivisibility = findViewById(R.id.btn_divisibility);
        tvResult = findViewById(R.id.tv_result);

        btnDivisibility.setOnClickListener(v -> {
            int getNum1 = Integer.parseInt(etFirstNumber.getText().toString());
            int getNum2 = Integer.parseInt(etSecondNumber.getText().toString());

            if (getNum1 % getNum2 == 0){
                tvResult.setText(getNum1 + " is divisible by " + getNum2);
            } else {
                tvResult.setText(getNum1 + " is not divisible by " + getNum2);
            }

        });

    }
}