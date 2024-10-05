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

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomQouteDisplay extends AppCompatActivity {

    TextView tvResult;
    Button btnRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_qoute_display);

        tvResult = findViewById(R.id.tv_result);
        btnRandom = findViewById(R.id.btn_random);

        List<String> randomStrings = new ArrayList<>();
        randomStrings.add("The only thing we have to fear is fear itself. — Franklin D. Roosevelt");
        randomStrings.add("In the middle of difficulty lies opportunity. — Albert Einstein");
        randomStrings.add("The greatest glory in living lies not in never falling, but in rising every time we fall. — Nelson Mandela");
        randomStrings.add("Be the change that you wish to see in the world. — Mahatma Gandhi");
        randomStrings.add("Success is not final, failure is not fatal: It is the courage to continue that counts. — Winston Churchill");
        randomStrings.add("It always seems impossible until it’s done. — Nelson Mandela");
        randomStrings.add("Life is what happens when you’re busy making other plans. — John Lennon");
        randomStrings.add("Bossing!! Kamusta and buhay-buhay! — Boss");


        btnRandom.setOnClickListener(v -> {
            Random rand = new Random();
            int randomIndex = rand.nextInt(randomStrings.size());

            tvResult.setText(randomStrings.get(randomIndex));
        });

    }
}