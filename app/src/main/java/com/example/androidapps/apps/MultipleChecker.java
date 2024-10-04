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

public class MultipleChecker extends AppCompatActivity {

    EditText firstNum, secondNum;
    Button btnCheck;
    TextView showResult;
    int getNum1, getNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_checker);

        firstNum = findViewById(R.id.input_num1);
        secondNum = findViewById(R.id.input_num2);
        btnCheck = findViewById(R.id.btn_check_multiple);
        showResult = findViewById(R.id.result_multiple);

        btnCheck.setOnClickListener(v -> {
            getNum1 = Integer.parseInt(firstNum.getText().toString());
            getNum2 = Integer.parseInt(secondNum.getText().toString());

            if (getNum1 % getNum2 == 0 ){
                showResult.setText(getNum1 + " is a multiple of " + getNum2);
            } else {
                showResult.setText(getNum1 + " is not a multiple of " + getNum2);
            }
        });

    }
}