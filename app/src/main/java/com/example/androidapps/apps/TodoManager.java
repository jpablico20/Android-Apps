package com.example.androidapps.apps;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidapps.R;

public class TodoManager extends AppCompatActivity {

    private EditText todoInput;
    private LinearLayout todoContainer;
    Button btnAddTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo_manager);

        todoInput = findViewById(R.id.todo_input);
        todoContainer = findViewById(R.id.todo_container);
        btnAddTask = findViewById(R.id.btn_add_task);

        btnAddTask.setOnClickListener(v -> {
            String taskName = todoInput.getText().toString();
            if (!taskName.isEmpty()) {
                addTask(taskName);
                todoInput.setText("");
            }
        });
    }

    private void addTask(String itemName) {

        LinearLayout taskLayout = new LinearLayout(this);
        taskLayout.setOrientation(LinearLayout.HORIZONTAL);

        TextView taskText = new TextView(this);
        taskText.setText(itemName);
        taskText.setTextSize(18);

        Button btnRemove = new Button(this);
        btnRemove.setText("Remove");

        btnRemove.setOnClickListener(v -> todoContainer.removeView(taskLayout));

        taskLayout.addView(taskText);
        taskLayout.addView(btnRemove);

        todoContainer.addView(taskLayout);
    }
}