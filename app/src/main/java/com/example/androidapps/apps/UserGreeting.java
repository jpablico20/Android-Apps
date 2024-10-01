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

public class UserGreeting extends AppCompatActivity {

    EditText enterUserName;
    Button btnSubmitGreeting;
    TextView showGreet;
    String getName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_greeting);

        enterUserName = findViewById(R.id.enter_username);
        btnSubmitGreeting = findViewById(R.id.btn_submit_greeting);
        showGreet = findViewById(R.id.show_greet);

        btnSubmitGreeting.setOnClickListener(v -> {
            getName = enterUserName.getText().toString();

            showGreet.setText("Hello, " + getName +"!");
        });

    }
}