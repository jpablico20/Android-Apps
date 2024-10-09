package com.example.androidapps.apps;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidapps.R;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class MoodTracker extends AppCompatActivity {

    Spinner spinnerMood;
    Button btnSubmit;
    LinearLayout moodContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_tracker);

        spinnerMood = findViewById(R.id.spinner_mood);
        btnSubmit = findViewById(R.id.btn_submit);
        moodContainer = findViewById(R.id.mood_container);


        List<String> mood = new ArrayList<>();
        mood.add("Select your mood");
        mood.add("Happy");
        mood.add("Sad");
        mood.add("Neutral");
        mood.add("Excited");
        mood.add("Angry");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, mood) {
            @Override
            public boolean isEnabled(int position) {

                return position != 0;
            }

            @Override
            public View getDropDownView(int position, View convertView, android.view.ViewGroup parent) {
                View view = super.getDropDownView(position, convertView, parent);
                if (position == 0) {
                    view.setEnabled(false);
                    view.setAlpha(0.5f);
                }
                return view;
            }
        };

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMood.setAdapter(adapter);

        btnSubmit.setOnClickListener(v -> {
            String getMood = spinnerMood.getSelectedItem().toString();

            if (getMood.equals("Select your mood")) {
                Toast.makeText(MoodTracker.this, "Please select a valid mood", Toast.LENGTH_SHORT).show();
                return;
            }

            LocalDate localDate = LocalDate.now();
            LocalTime localTime = LocalTime.now();
            addMood(getMood);
        });
    }

    private void addMood(String moodName) {
        LinearLayout moodLayout = new LinearLayout(this);
        moodLayout.setOrientation(LinearLayout.HORIZONTAL);

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        TextView taskText = new TextView(this);
        taskText.setText(moodName + " - " + localDate + ", " + localTime);
        taskText.setTextSize(18);

        moodLayout.addView(taskText);
        moodContainer.addView(moodLayout);
    }
}
