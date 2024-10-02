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

public class PalindromeChecker extends AppCompatActivity {

    EditText inputWord;
    Button palindromeBtn;
    TextView resultPalindrome;
    String getInput, getReverse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome_checker);

        inputWord = findViewById(R.id.editTextWord);
        palindromeBtn = findViewById(R.id.buttonCheckPalindrome);
        resultPalindrome = findViewById(R.id.checkPalindrome);

        palindromeBtn.setOnClickListener(v -> {

            getInput = inputWord.getText().toString();

            StringBuilder input = new StringBuilder();

            input.append(inputWord.getText().toString());
            getReverse = input.reverse().toString();

            if (getInput.equals(getReverse)){
                resultPalindrome.setText(getInput + " is a palindrome");
            } else {
                resultPalindrome.setText(getInput + " is NOT a palindrome");
            }

        });

    }
}