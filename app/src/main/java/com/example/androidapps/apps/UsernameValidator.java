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

public class UsernameValidator extends AppCompatActivity {

    EditText etUsername;
    Button btnValidate;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_username_validator);

        etUsername = findViewById(R.id.et_username);
        btnValidate = findViewById(R.id.btn_validate);
        tvResult = findViewById(R.id.tv_result);

        btnValidate.setOnClickListener(v -> {
            String username = etUsername.getText().toString();

            if (isValidUsername(username)) {
                tvResult.setText("Valid Username");
            } else {
                tvResult.setText("Invalid Username: Only letters, numbers, '_', '@' are allowed. No special characters like %, (), {}, *, !");
            }
        });
    }

    private boolean isValidUsername(String username) {
        String regex = "^[a-zA-Z0-9_@]+$";
        return username.matches(regex);
    }
}