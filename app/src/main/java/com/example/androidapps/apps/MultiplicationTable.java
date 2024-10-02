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

public class MultiplicationTable extends AppCompatActivity {

    EditText inputNum;
    Button btnGenerate;
    TextView showTable;
    int getNum, getOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication_table);

        inputNum = findViewById(R.id.input_num);
        btnGenerate = findViewById(R.id.btn_generate);
        showTable = findViewById(R.id.show_table);

        btnGenerate.setOnClickListener(v -> {
            getNum = Integer.parseInt(inputNum.getText().toString());

            for (int i = 1; i <= 10; i++){
                getOutput = getNum * i;
                showTable.append(getNum + " x " + i + " = " + getOutput + "\n");
            }
        });

    }
}