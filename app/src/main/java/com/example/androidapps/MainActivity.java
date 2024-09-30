package com.example.androidapps;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidapps.apps.Calculator;
import com.example.androidapps.apps.Counter;
import com.example.androidapps.apps.CurrencyConverter;
import com.example.androidapps.apps.DisplayHelloWorld;
import com.example.androidapps.apps.DisplayName;
import com.example.androidapps.apps.ShowHelloButton;
import com.example.androidapps.apps.SimpleForm;
import com.example.androidapps.apps.TextLength;
import com.example.androidapps.apps.UserAge;
import com.example.androidapps.apps.UserGreeting;

public class MainActivity extends AppCompatActivity {

    Button btnDisplayHelloWorld, btnshowHelloButton, btnDisplayname, btnCounter,
    btnSimpleForm, btnUserAge, btnUserGreeting, btnCalculator, btnTextLength, btnCurrencyConverter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDisplayHelloWorld = findViewById(R.id.btn_displayhelloworld);
        btnshowHelloButton = findViewById(R.id.btn_showhellobutton);
        btnDisplayname = findViewById(R.id.btn_displayname);
        btnCounter = findViewById(R.id.btn_counter);
        btnSimpleForm = findViewById(R.id.btn_simpleform);
        btnUserAge = findViewById(R.id.btn_user_age);
        btnUserGreeting = findViewById(R.id.btn_user_greeting);
        btnCalculator = findViewById(R.id.btn_calculator);
        btnTextLength = findViewById(R.id.btn_text_length);
        btnCurrencyConverter = findViewById(R.id.btn_currency_converter);

        btnDisplayHelloWorld.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DisplayHelloWorld.class);
            startActivity(intent);
        });

        btnshowHelloButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ShowHelloButton.class);
            startActivity(intent);
        });

        btnDisplayname.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DisplayName.class);
            startActivity(intent);
        });

        btnCounter.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Counter.class);
            startActivity(intent);
        });

        btnSimpleForm.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SimpleForm.class);
            startActivity(intent);
        });

        btnUserAge.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, UserAge.class);
            startActivity(intent);
        });

        btnUserGreeting.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, UserGreeting.class);
            startActivity(intent);
        });

        btnCalculator.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Calculator.class);
            startActivity(intent);
        });

        btnTextLength.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TextLength.class);
            startActivity(intent);
        });

        btnCurrencyConverter.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CurrencyConverter.class);
            startActivity(intent);
        });
    }
}