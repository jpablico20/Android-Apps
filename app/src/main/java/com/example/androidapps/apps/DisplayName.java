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

public class DisplayName extends AppCompatActivity {

    EditText inputName;
    Button btnShowName;
    TextView showName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_name);

        inputName = findViewById(R.id.input_name);
        btnShowName = findViewById(R.id.btn_show_name);
        showName = findViewById(R.id.show_name);

        btnShowName.setOnClickListener(v -> {
            String getName = inputName.getText().toString();

            showName.setText(getName);
        });
    }
}