package com.example.androidapps.apps;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.androidapps.R.id;
import com.example.androidapps.R.layout;

public class Calculator extends AppCompatActivity {
    EditText enterFirstNum, enterSecondNum;
    Button btnAdd, btnSubtract, btnMultiply, btnDivide;
    TextView showResult;
    int getFirstNum, getSecondNum, result;
    double num1, num2, result1;


    public Calculator() {
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_calculator);

        enterFirstNum = findViewById(id.input_first_number);
        enterSecondNum = findViewById(id.input_second_number);
        btnAdd = findViewById(id.btn_add);
        btnSubtract = findViewById(id.btn_subtract);
        btnMultiply = findViewById(id.btn_multiply);
        btnDivide = findViewById(id.btn_divide);
        showResult = findViewById(id.show_result);

        btnAdd.setOnClickListener((view) -> {
            getFirstNum = Integer.parseInt(enterFirstNum.getText().toString());
            getSecondNum = Integer.parseInt(enterSecondNum.getText().toString());
            result = getFirstNum + getSecondNum;
            showResult.setText("Result: " + result);
        });

        btnSubtract.setOnClickListener((view) -> {
            getFirstNum = Integer.parseInt(enterFirstNum.getText().toString());
            getSecondNum = Integer.parseInt(enterSecondNum.getText().toString());
            result = getFirstNum - getSecondNum;
            showResult.setText("Result: " + result);
        });
        btnMultiply.setOnClickListener((view) -> {
            getFirstNum = Integer.parseInt(enterFirstNum.getText().toString());
            getSecondNum = Integer.parseInt(enterSecondNum.getText().toString());
            result = getFirstNum * getSecondNum;
            showResult.setText("Result: " + result);
        });
        btnDivide.setOnClickListener((view) -> {
            num1 = Double.parseDouble(enterFirstNum.getText().toString());
            num2 = Integer.parseInt(enterSecondNum.getText().toString());
            result1 = num1 / num2;
            String formattedNumber = String.format("%.2f", result1);
            showResult.setText("Result: " + formattedNumber);
        });
    }
}
