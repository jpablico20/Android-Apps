package com.example.androidapps.apps;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidapps.R;

public class ShowHelloButton extends AppCompatActivity {

    Button btn_showHello;
    TextView showHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_hello_button);

        btn_showHello = findViewById(R.id.btn_show_hello);
        showHello = findViewById(R.id.show_hello);

        btn_showHello.setOnClickListener(v -> {
            showHello.setText("Hello World");
        });


    }
}