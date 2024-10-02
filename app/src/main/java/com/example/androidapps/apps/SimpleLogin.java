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

public class SimpleLogin extends AppCompatActivity {

    EditText enterEmail, enterPassword;
    Button btnLogin;
    TextView loginConfirmation;
    String getEmail, getPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_login);

        enterEmail = findViewById(R.id.enter_email_login);
        enterPassword = findViewById(R.id.enter_password);
        btnLogin = findViewById(R.id.btn_login);
        loginConfirmation = findViewById(R.id.login_confirmation);

        btnLogin.setOnClickListener(v -> {
            getEmail = enterEmail.getText().toString();
            getPassword = enterPassword.getText().toString();

            if (getEmail.isEmpty() || getPassword.isEmpty()) {
                loginConfirmation.setText("Please enter both email and password");
            } else {
                loginConfirmation.setText("Login successful for email: \n" + getEmail);
            }
        });

    }
}