package com.example.androidapps.apps;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.androidapps.R;


public class TemperatureConverter extends AppCompatActivity {

    EditText inputTemperature;
    Spinner conversionTypeSpinner;
    Button convertButton;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_converter);

        inputTemperature = findViewById(R.id.input_temperature);
        conversionTypeSpinner = findViewById(R.id.conversion_type_spinner);
        convertButton = findViewById(R.id.convert_button);
        resultTextView = findViewById(R.id.result_text_view);

        String[] conversionTypes = {"Fahrenheit to Celsius", "Celsius to Fahrenheit"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, conversionTypes);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        conversionTypeSpinner.setAdapter(adapter);

        convertButton.setOnClickListener(v -> {
            String tempInput = inputTemperature.getText().toString();

            if (tempInput.isEmpty()) {
                inputTemperature.setError("Please enter a temperature");
            } else {
                inputTemperature.setError(null);
                double tempValue = Double.parseDouble(tempInput);
                String conversionType = conversionTypeSpinner.getSelectedItem().toString();
                double convertedTemp = 0.0;

                if (conversionType.equals("Fahrenheit to Celsius")) {
                    convertedTemp = (tempValue - 32) * 5 / 9;
                } else if (conversionType.equals("Celsius to Fahrenheit")) {
                    convertedTemp = (tempValue * 9 / 5) + 32;
                }

                resultTextView.setText("Converted Temperature: " + String.format("%.2f", convertedTemp));
            }
        });

    }
}