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

import java.util.Random;

public class GuessNumber extends AppCompatActivity {

    EditText inputGuess;
    Button btnCheckGuess;
    TextView showGuess;
    int guessNum;
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_number);

        inputGuess = findViewById(R.id.input_guess);
        btnCheckGuess = findViewById(R.id.btn_check_guess);
        showGuess = findViewById(R.id.show_guess);

        random = new Random();

        btnCheckGuess.setOnClickListener(v -> {
            int getNum = Integer.parseInt(inputGuess.getText().toString());

            if (getNum > guessNum) {
                showGuess.setText("Too high! Try again");
            } else if (getNum < guessNum) {
                showGuess.setText("Too low! Try again");
            } else if (getNum == guessNum) {
                showGuess.setText("Congratulations! You guessed the number!");
                generatedNewRandomNumber();
            }
        });

    }

    private void generatedNewRandomNumber(){
        guessNum = random.nextInt(100) + 1;
        inputGuess.setText("");
    }

}