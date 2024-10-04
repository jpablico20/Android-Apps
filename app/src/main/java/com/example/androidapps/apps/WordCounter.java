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

public class WordCounter extends AppCompatActivity {

    EditText inputWords;
    Button btnCountWords;
    TextView wordCount;
    String getString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        inputWords = findViewById(R.id.input_words);
        btnCountWords = findViewById(R.id.btn_count_words);
        wordCount = findViewById(R.id.word_count);

        btnCountWords.setOnClickListener(v -> {
            getString = inputWords.getText().toString().trim();
            int counter = 0;

            if (!getString.isEmpty()) {
                counter = 1;

                for (int i = 0; i < getString.length() - 1; i++) {
                    if (getString.charAt(i) == ' ' && getString.charAt(i + 1) != ' ') {
                        counter++;
                    }
                }
            }

            wordCount.setText("Word count: " + counter);

        });
    }
}