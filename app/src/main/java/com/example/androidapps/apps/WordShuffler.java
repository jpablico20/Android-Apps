package com.example.androidapps.apps;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidapps.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WordShuffler extends AppCompatActivity {

    EditText enterWord;
    Button btnShuffle;
    TextView showShuffle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_shuffler);

        enterWord = findViewById(R.id.input_text);
        btnShuffle = findViewById(R.id.btn_shuffle);
        showShuffle = findViewById(R.id.show_shuffle_word);

        btnShuffle.setOnClickListener(v -> {
            String getText = enterWord.getText().toString();
            String shuffledWord = shuffleString(getText);

            showShuffle.setText(shuffledWord);
        });
    }

    public String shuffleString(String input) {
        List<Character> characters = new ArrayList<>();
        for (char c : input.toCharArray()) {
            characters.add(c);
        }

        Collections.shuffle(characters);

        StringBuilder shuffledString = new StringBuilder();
        for (char c : characters) {
            shuffledString.append(c);
        }

        return shuffledString.toString();
    }
}
