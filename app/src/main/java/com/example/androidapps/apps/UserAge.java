package com.example.androidapps.apps;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import com.example.androidapps.R;

import java.time.LocalDate;

public class UserAge extends AppCompatActivity {

    EditText enterBirthYear;
    Button btnSubmitBirthYear;
    TextView showAge;
    int getBirthYear, currentYear, totalAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_age);

        enterBirthYear = findViewById(R.id.enter_birth_year);
        btnSubmitBirthYear = findViewById(R.id.btn_submit_birth_year);
        showAge = findViewById(R.id.show_age);

        btnSubmitBirthYear.setOnClickListener(v -> {
            getBirthYear = Integer.parseInt(enterBirthYear.getText().toString());
            currentYear = LocalDate.now().getYear();

            totalAge = currentYear - getBirthYear;

            showAge.setText("Your age is: " + totalAge);
        });
    }
}