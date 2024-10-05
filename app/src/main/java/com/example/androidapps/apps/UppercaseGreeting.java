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

public class UppercaseGreeting extends AppCompatActivity {

    EditText inputText;
    Button btnUppercase;
    TextView convertUppercase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uppercase_greeting);

        inputText = findViewById(R.id.input_text);
        btnUppercase = findViewById(R.id.btn_uppercase);
        convertUppercase = findViewById(R.id.show_uppercase);

        btnUppercase.setOnClickListener(v -> {
            String getText = inputText.getText().toString();
            String textUppercase =  getText.toUpperCase();

            convertUppercase.setText("Your name in uppercase: " + textUppercase);
        });

    }
}