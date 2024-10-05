package com.example.androidapps.apps;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidapps.R;

import java.util.ArrayList;
import java.util.List;

public class CurrencyFormatter extends AppCompatActivity {

    EditText etAmount;
    Button btnFormat;
    Spinner spinnerCurrencies;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_formatter);

        etAmount = findViewById(R.id.et_amount);
        btnFormat = findViewById(R.id.btn_format);
        spinnerCurrencies = findViewById(R.id.spinner_currency);
        tvResult = findViewById(R.id.tv_result);

        List<String> currencies = new ArrayList<>();
        currencies.add("Dollar (USD)");
        currencies.add("Philippine peso (PHP)");
        currencies.add("Euro (EUR)");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, currencies);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCurrencies.setAdapter(adapter);

        btnFormat.setOnClickListener(v -> {
            double getAmount = Double.parseDouble(etAmount.getText().toString());
            String currencyStr = spinnerCurrencies.getSelectedItem().toString();

            String currency =  getCurrency(currencyStr);

            tvResult.setText(String.format("Formatted Amount: %s%.2f", currency, getAmount));

        });

    }

    private String getCurrency (String currencyStr) {
        switch (currencyStr) {
            case "Dollar (USD)":
                return "$";
            case "Philippine peso (PHP)":
                return "₱";
            case "Euro (EUR)":
                return "€";
            default:
                return "Unknown currency";
        }
    }
}