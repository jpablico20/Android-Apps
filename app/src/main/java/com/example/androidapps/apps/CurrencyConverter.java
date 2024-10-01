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

public class CurrencyConverter extends AppCompatActivity {

    EditText inputAmount;
    Button btnConvert;
    TextView showAmount;
    double pesoRate = 56.21, getAmount, phpAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);

        inputAmount =findViewById(R.id.input_amount);
        btnConvert =findViewById(R.id.btn_convert);
        showAmount =findViewById(R.id.show_amount);

        btnConvert.setOnClickListener(v -> {

        getAmount = Double.parseDouble(inputAmount.getText().toString());
        phpAmount = getAmount * pesoRate;

        showAmount.setText("Amount in PHP: " + phpAmount);

        });


    }
}