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

public class WordReverser extends AppCompatActivity {

    EditText enterWord;
    Button btnReverse;
    TextView resultReverse;
    String getWord, reverseWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_reverser);

        enterWord = findViewById(R.id.enter_word);
        btnReverse = findViewById(R.id.btn_reverse);
        resultReverse = findViewById(R.id.result_reverse);

        btnReverse.setOnClickListener(v ->{
            getWord = enterWord.getText().toString();
            StringBuilder input = new StringBuilder();

            input.append(getWord);
            reverseWord = input.reverse().toString();

            resultReverse.setText(reverseWord);
        });
    }
}