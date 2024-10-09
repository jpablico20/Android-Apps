package com.example.androidapps.apps;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidapps.R;

public class PasswordStrengthChecker extends AppCompatActivity {

    EditText etPassword;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_strength_checker);

        etPassword = findViewById(R.id.et_pass);
        tvResult = findViewById(R.id.tv_result);

        etPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                tvResult.setText("Strength: " + getPasswordStrength(s.toString()));
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

    public String getPasswordStrength(String password) {
        int strengthPoints = 0;

        if (password.length() < 6) {
            return "Weak";
        }

        if (password.matches(".*[a-z].*")) {
            strengthPoints++;
        }

        if (password.matches(".*[A-Z].*")) {
            strengthPoints++;
        }

        if (password.matches(".*[0-9].*")) {
            strengthPoints++;
        }

        if (password.matches(".*[!@#\\$%^&*()-+=].*")) {
            strengthPoints++;
        }

        if (password.length() > 10) {
            strengthPoints++;
        }

        if (strengthPoints <= 2) {
            return "Weak";
        } else if (strengthPoints == 3) {
            return "Moderate";
        } else {
            return "Strong";
        }
    }


}