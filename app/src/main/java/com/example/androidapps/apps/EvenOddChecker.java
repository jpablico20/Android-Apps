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

public class EvenOddChecker extends AppCompatActivity {

    EditText enterNum;
    Button btnCheckNum;
    TextView resultEvenOdd;
    int getNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_even_odd_checker);

        enterNum = findViewById(R.id.enter_num);
        btnCheckNum = findViewById(R.id.btn_check_num);
        resultEvenOdd = findViewById(R.id.result_even_odd);

        btnCheckNum.setOnClickListener(v -> {

            getNum = Integer.parseInt(enterNum.getText().toString());

            if (getNum % 2 == 0){
                resultEvenOdd.setText("The number is Even");
            } else {
                resultEvenOdd.setText("The number is Odd");
            }

        });


    }
}