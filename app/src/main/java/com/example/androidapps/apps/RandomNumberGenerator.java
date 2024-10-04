package com.example.androidapps.apps;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidapps.R;

import java.util.Random;

public class RandomNumberGenerator extends AppCompatActivity {

    EditText minimumValue, maximumValue;
    Button btnGenerateRandomNumber;
    TextView randomNumber;
    int getMaxValue, getMinValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_number_generator);

        minimumValue = findViewById(R.id.input_minimum_value);
        maximumValue = findViewById(R.id.input_maximum_value);
        btnGenerateRandomNumber = findViewById(R.id.btn_generate_number);
        randomNumber = findViewById(R.id.random_number);

        Random random = new Random();

        btnGenerateRandomNumber.setOnClickListener(v -> {
            getMaxValue = Integer.parseInt(maximumValue.getText().toString());
            getMinValue = Integer.parseInt(minimumValue.getText().toString());
            int generateRandomNumber = random.nextInt((getMaxValue - getMinValue) + 1) + getMinValue;

            randomNumber.setText("Random Number: " + generateRandomNumber);

        });

    }
}