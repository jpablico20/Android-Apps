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

import java.text.DecimalFormat;

public class FahrenheitToCelsius extends AppCompatActivity {

    EditText enterTemperature;
    Button btnConvertCelsius;
    TextView showCelsius;
    double convertCelsius, getTemperature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fahrenheit_to_celsius);

        enterTemperature = findViewById(R.id.enter_temperature);
        btnConvertCelsius = findViewById(R.id.btn_convert_celsius);
        showCelsius = findViewById(R.id.show_celsius);

        btnConvertCelsius.setOnClickListener(v -> {
            DecimalFormat df = new DecimalFormat("#.00");
            getTemperature = Double.parseDouble(enterTemperature.getText().toString());
            convertCelsius = (getTemperature - 32) * (5.0 / 9.0);

            showCelsius.setText("Temperature in Celsius: " + df.format(convertCelsius) + " °C");
        });

    }
}