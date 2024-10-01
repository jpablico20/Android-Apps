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

public class SimpleForm extends AppCompatActivity {

    EditText enterName, enterEmail;
    Button btnSubmit;
    TextView showData;
    String getName, getEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_form);

        enterName = findViewById(R.id.enter_name);
        enterEmail = findViewById(R.id.enter_email);
        btnSubmit = findViewById(R.id.btn_submit);
        showData = findViewById(R.id.show_data);

        btnSubmit.setOnClickListener(v -> {
            getName = enterName.getText().toString();
            getEmail = enterEmail.getText().toString();

            showData.setText("Submitted Data: \n" + "Name: " + getName + "\nEmail: " + getEmail);

        });
    }
}