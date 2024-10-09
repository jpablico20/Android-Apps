package com.example.androidapps.apps;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidapps.R;

public class QuizGame extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton selectedRadioButton;
    Button btnSubmit, btnReset;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_game);

        radioGroup = findViewById(R.id.radio_group);
        btnSubmit = findViewById(R.id.btn_submit);
        btnReset = findViewById(R.id.btn_reset);
        tvResult = findViewById(R.id.tv_result);

        btnSubmit.setOnClickListener(v -> {
            int selectedId = radioGroup.getCheckedRadioButtonId();

            if (selectedId == -1) {
                tvResult.setText("Please choose an answer.");
            } else {
                selectedRadioButton = findViewById(selectedId);
                String getText = selectedRadioButton.getText().toString();

                if (getText.equals("Paris")) {
                    tvResult.setText("Correct!");
                } else {
                    tvResult.setText("Wrong answer. Try again!");
                }
            }

        });

        btnReset.setOnClickListener(v -> {
            radioGroup.clearCheck();
        });

    }
}