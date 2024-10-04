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

public class FactorialCalculator extends AppCompatActivity {

    EditText enterNum;
    Button btnCalculateFactorial;
    TextView showFactorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial_calculator);

        enterNum = findViewById(R.id.enter_num_factorial);
        btnCalculateFactorial = findViewById(R.id.btn_calculator_factorial);
        showFactorial = findViewById(R.id.show_factorial);

        btnCalculateFactorial.setOnClickListener(v -> {
            int getNum = Integer.parseInt(enterNum.getText().toString());
            int result = 1;

            if (getNum == 0 || getNum == 1){
                showFactorial.setText("Factorial: " + result);
            } else {
                for (int i = 2; i <= getNum; i++){
                    result *= i;
                    showFactorial.setText("Factorial: " + result);
                }
            }
        });

    }
}