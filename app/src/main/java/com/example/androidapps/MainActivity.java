package com.example.androidapps;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;


import com.example.androidapps.apps.BmiSolver;
import com.example.androidapps.apps.BookmarkList;
import com.example.androidapps.apps.Calculator;
import com.example.androidapps.apps.CharacterCounter;
import com.example.androidapps.apps.ColorPicker;
import com.example.androidapps.apps.CompoundInterest;
import com.example.androidapps.apps.Counter;
import com.example.androidapps.apps.CurrencyConverter;
import com.example.androidapps.apps.CurrencyFormatter;
import com.example.androidapps.apps.DisplayHelloWorld;
import com.example.androidapps.apps.DisplayName;
import com.example.androidapps.apps.DivisibleChecker;
import com.example.androidapps.apps.EvenOddChecker;
import com.example.androidapps.apps.FactorialCalculator;
import com.example.androidapps.apps.FahrenheitToCelsius;
import com.example.androidapps.apps.FibonacciGenerator;
import com.example.androidapps.apps.GenerateRandomColor;
import com.example.androidapps.apps.GuessNumber;
import com.example.androidapps.apps.ImageCarousel;
import com.example.androidapps.apps.MoodTracker;
import com.example.androidapps.apps.MultipleChecker;
import com.example.androidapps.apps.MultiplicationTable;
import com.example.androidapps.apps.OddSumCalculator;
import com.example.androidapps.apps.PalindromeChecker;
import com.example.androidapps.apps.PasswordStrengthChecker;
import com.example.androidapps.apps.QouteOfTheDay;
import com.example.androidapps.apps.QuizGame;
import com.example.androidapps.apps.RandomNumberGenerator;
import com.example.androidapps.apps.RandomQouteDisplay;
import com.example.androidapps.apps.ShoppingList;
import com.example.androidapps.apps.ShowDate;
import com.example.androidapps.apps.ShowHelloButton;
import com.example.androidapps.apps.ShowUserName;
import com.example.androidapps.apps.SimpleForm;
import com.example.androidapps.apps.SimpleInterest;
import com.example.androidapps.apps.SimpleLogin;
import com.example.androidapps.apps.Stopwatch;
import com.example.androidapps.apps.TemperatureConverter;
import com.example.androidapps.apps.TextLength;
import com.example.androidapps.apps.Timer;
import com.example.androidapps.apps.TodoManager;
import com.example.androidapps.apps.UppercaseConverter;
import com.example.androidapps.apps.UppercaseGreeting;
import com.example.androidapps.apps.UserAge;
import com.example.androidapps.apps.UserGreeting;
import com.example.androidapps.apps.UsernameValidator;
import com.example.androidapps.apps.WeatherWidget;
import com.example.androidapps.apps.WordCounter;
import com.example.androidapps.apps.WordReverser;
import com.example.androidapps.apps.WordShuffler;

public class MainActivity extends AppCompatActivity {

    Button btnDisplayHelloWorld, btnshowHelloButton, btnDisplayname, btnCounter,
    btnSimpleForm, btnUserAge, btnUserGreeting, btnCalculator, btnTextLength, btnCurrencyConverter,
    btnEvenOddChecker, btnWordReverser, btnShowUsername, btnShowDate, btnMultiplicationTable,
    btnSimpleLogin, btnFahrenheitToCelsius, btnBookmark, btnCharacterCounter, btnPalindrome,
    btnTemperature, btnShoppingList, btnFactorial, btnTodoManager, btnGuessNumber, btnWordCounter,
    btnRandomNum, btnMultipleChecker, btnUppercase, btnWordShuffler, btnBmiSolver, btnUsernameValidator,
    btnSimpleInterest, btnCompoundInterest, btnFibonacciGenerator, btnOddSum, btnCurrencyFormatter,
    btnRandomQouteDisplay, btnUppercaseGreeting, btnDivisible, btnRandomColor, btnNewQoute, btnImageCarousel,
    btnStopwatch, btnPasswordChecker, btnQuizGame, btnTimer, btnColorPicker, btnWeatherWidget, btnMoodTracker;

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
        btnTemperature = findViewById(R.id.btn_temperature);
        btnShoppingList = findViewById(R.id.btn_shopping_list);
        btnFactorial = findViewById(R.id.btn_factorial);
        btnTodoManager = findViewById(R.id.btn_todo_manager);
        btnGuessNumber = findViewById(R.id.btn_guess_number);
        btnWordCounter = findViewById(R.id.btn_word_counter);
        btnRandomNum = findViewById(R.id.btn_random_number);
        btnMultipleChecker = findViewById(R.id.btn_multiple_checker);
        btnUppercase = findViewById(R.id.btn_uppercase_converter);
        btnWordShuffler = findViewById(R.id.btn_shuffle_word);
        btnBmiSolver = findViewById(R.id.btn_bmi_solver);
        btnUsernameValidator = findViewById(R.id.btn_username_valid);
        btnSimpleInterest = findViewById(R.id.btn_simple_interest);
        btnCompoundInterest = findViewById(R.id.btn_compound_interest);
        btnFibonacciGenerator = findViewById(R.id.btn_fibo_generator);
        btnOddSum = findViewById(R.id.btn_odd_sum);
        btnCurrencyFormatter = findViewById(R.id.btn_currency_formatter);
        btnRandomQouteDisplay = findViewById(R.id.btn_random_qoute);
        btnUppercaseGreeting = findViewById(R.id.btn_upper_greeting);
        btnDivisible = findViewById(R.id.btn_check_divisible);
        btnRandomColor = findViewById(R.id.btn_generate_color);
        btnNewQoute = findViewById(R.id.btn_new_qoute);
        btnImageCarousel = findViewById(R.id.btn_image_carousel);
        btnStopwatch = findViewById(R.id.btn_stopwatch);
        btnPasswordChecker = findViewById(R.id.btn_password_checker);
        btnQuizGame = findViewById(R.id.btn_quiz_game);
        btnTimer = findViewById(R.id.btn_timer);
        btnColorPicker =  findViewById(R.id.btn_color_picker);
        btnWeatherWidget =  findViewById(R.id.btn_weather_widget);
        btnMoodTracker = findViewById(R.id.btn_mood_tracker);

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

        btnTemperature.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TemperatureConverter.class);
            startActivity(intent);
        });

        btnShoppingList.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ShoppingList.class);
            startActivity(intent);
        });

        btnFactorial.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FactorialCalculator.class);
            startActivity(intent);
        });

        btnTodoManager.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TodoManager.class);
            startActivity(intent);
        });

        btnGuessNumber.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, GuessNumber.class);
            startActivity(intent);
        });

        btnWordCounter.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, WordCounter.class);
            startActivity(intent);
        });

        btnRandomNum.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RandomNumberGenerator.class);
            startActivity(intent);
        });

        btnMultipleChecker.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MultipleChecker.class);
            startActivity(intent);
        });

        btnUppercase.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, UppercaseConverter.class);
            startActivity(intent);
        });

        btnWordShuffler.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, WordShuffler.class);
            startActivity(intent);
        });

        btnBmiSolver.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, BmiSolver.class);
            startActivity(intent);
        });

        btnUsernameValidator.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, UsernameValidator.class);
            startActivity(intent);
        });

        btnSimpleInterest.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SimpleInterest.class);
            startActivity(intent);
        });

        btnCompoundInterest.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CompoundInterest.class);
            startActivity(intent);
        });

        btnFibonacciGenerator.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FibonacciGenerator.class);
            startActivity(intent);
        });

        btnOddSum.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, OddSumCalculator.class);
            startActivity(intent);
        });

        btnCurrencyFormatter.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CurrencyFormatter.class);
            startActivity(intent);
        });

        btnRandomQouteDisplay.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RandomQouteDisplay.class);
            startActivity(intent);
        });

        btnUppercaseGreeting.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, UppercaseGreeting.class);
            startActivity(intent);
        });

        btnDivisible.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DivisibleChecker.class);
            startActivity(intent);
        });

        btnRandomColor.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, GenerateRandomColor.class);
            startActivity(intent);
        });

        btnNewQoute.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, QouteOfTheDay.class);
            startActivity(intent);
        });

        btnImageCarousel.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ImageCarousel.class);
            startActivity(intent);
        });

        btnStopwatch.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Stopwatch.class);
            startActivity(intent);
        });

        btnPasswordChecker.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, PasswordStrengthChecker.class);
            startActivity(intent);
        });

        btnQuizGame.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, QuizGame.class);
            startActivity(intent);
        });

        btnTimer.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Timer.class);
            startActivity(intent);
        });

        btnColorPicker.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ColorPicker.class);
            startActivity(intent);
        });

        btnWeatherWidget.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, WeatherWidget.class);
            startActivity(intent);
        });

        btnMoodTracker.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MoodTracker.class);
            startActivity(intent);
        });
    }
}