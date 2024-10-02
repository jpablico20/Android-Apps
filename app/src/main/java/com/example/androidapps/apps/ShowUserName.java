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

public class ShowUserName extends AppCompatActivity {

    EditText inputUsername;
    Button btnShowUsername;
    TextView showUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_user_name);

        inputUsername = findViewById(R.id.input_username);
        btnShowUsername = findViewById(R.id.btn_show_username);
        showUsername = findViewById(R.id.show_username);

        btnShowUsername.setOnClickListener(v -> {
            String getUsername = inputUsername.getText().toString();

            showUsername.setText("Your username is: " + getUsername);
        });
    }
}