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

public class ImageCarousel extends AppCompatActivity {

    TextView tvImage;
    Button btnPrevious, btnNext;
    String[] imageTexts = {"Image 1", "Image 2", "Image 3", "Image 4"};
    int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_carousel);

        tvImage = findViewById(R.id.tv_image);
        btnPrevious = findViewById(R.id.btn_previous);
        btnNext = findViewById(R.id.btn_next);

        tvImage.setText(imageTexts[currentIndex]);

        btnPrevious.setOnClickListener(v -> {
            if (currentIndex > 0) {
                currentIndex--;
                updateImageContent();
            }
        });

        btnNext.setOnClickListener(v -> {
            if (currentIndex < imageTexts.length - 1) {
                currentIndex++;
                updateImageContent();
            }
        });
    }

    private void updateImageContent() {
        tvImage.setText(imageTexts[currentIndex]);
    }
}