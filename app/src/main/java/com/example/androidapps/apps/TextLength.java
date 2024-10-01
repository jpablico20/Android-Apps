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

public class TextLength extends AppCompatActivity {

    EditText enterString;
    Button btnCalculateLength;
    TextView showLength;
    String getString;
    int getLength;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_length);

        enterString = findViewById(R.id.enter_string);
        btnCalculateLength = findViewById(R.id.btn_calculator_length);
        showLength = findViewById(R.id.show_length);

        btnCalculateLength.setOnClickListener(v -> {
            getString = enterString.getText().toString();

            getLength = getString.length();

            showLength.setText("Length of the String: " + getLength);
        });

    }
}