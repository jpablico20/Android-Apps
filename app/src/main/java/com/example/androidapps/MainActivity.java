package com.example.androidapps;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidapps.apps.BookmarkList;
import com.example.androidapps.apps.Calculator;
import com.example.androidapps.apps.CharacterCounter;
import com.example.androidapps.apps.Counter;
import com.example.androidapps.apps.CurrencyConverter;
import com.example.androidapps.apps.DisplayHelloWorld;
import com.example.androidapps.apps.DisplayName;
import com.example.androidapps.apps.EvenOddChecker;
import com.example.androidapps.apps.FahrenheitToCelsius;
import com.example.androidapps.apps.MultiplicationTable;
import com.example.androidapps.apps.PalindromeChecker;
import com.example.androidapps.apps.ShowDate;
import com.example.androidapps.apps.ShowHelloButton;
import com.example.androidapps.apps.ShowUserName;
import com.example.androidapps.apps.SimpleForm;
import com.example.androidapps.apps.SimpleLogin;
import com.example.androidapps.apps.TextLength;
import com.example.androidapps.apps.UserAge;
import com.example.androidapps.apps.UserGreeting;
import com.example.androidapps.apps.WordReverser;

public class MainActivity extends AppCompatActivity {

    Button btnDisplayHelloWorld, btnshowHelloButton, btnDisplayname, btnCounter,
    btnSimpleForm, btnUserAge, btnUserGreeting, btnCalculator, btnTextLength, btnCurrencyConverter,
    btnEvenOddChecker, btnWordReverser, btnShowUsername, btnShowDate, btnMultiplicationTable,
    btnSimpleLogin, btnFahrenheitToCelsius, btnBookmark, btnCharacterCounter, btnPalindrome;

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
        btnEvenOddChecker = findViewById(R.id.btn_even_odd);
        btnWordReverser = findViewById(R.id.btn_word_reverser);
        btnShowUsername = findViewById(R.id.btn_username);
        btnShowDate = findViewById(R.id.btn_date);
        btnMultiplicationTable = findViewById(R.id.btn_multiplication_table);
        btnSimpleLogin = findViewById(R.id.btn_simple_login);
        btnFahrenheitToCelsius = findViewById(R.id.btn_fahrenheit_celsius);
        btnBookmark = findViewById(R.id.btn_bookmark);
        btnCharacterCounter = findViewById(R.id.btn_character_count);
        btnPalindrome = findViewById(R.id.btn_palindrome);

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

        btnEvenOddChecker.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, EvenOddChecker.class);
            startActivity(intent);
        });

        btnWordReverser.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, WordReverser.class);
            startActivity(intent);
        });

        btnShowDate.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ShowDate.class);
            startActivity(intent);
        });

        btnShowUsername.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ShowUserName.class);
            startActivity(intent);
        });

        btnMultiplicationTable.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MultiplicationTable.class);
            startActivity(intent);
        });

        btnSimpleForm.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SimpleLogin.class);
            startActivity(intent);
        });

        btnFahrenheitToCelsius.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FahrenheitToCelsius.class);
            startActivity(intent);
        });

        btnBookmark.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, BookmarkList.class);
            startActivity(intent);
        });

        btnCharacterCounter.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CharacterCounter.class);
            startActivity(intent);
        });

        btnPalindrome.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, PalindromeChecker.class);
            startActivity(intent);
        });
    }
}