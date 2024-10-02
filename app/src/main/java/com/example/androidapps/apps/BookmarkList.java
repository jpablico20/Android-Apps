package com.example.androidapps.apps;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidapps.R;

public class BookmarkList extends AppCompatActivity {

    EditText inputUrl;
    LinearLayout bookmarkContainer;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookmark_list);

        inputUrl = findViewById(R.id.input_url);
        btnAdd = findViewById(R.id.btn_add_bookmark);
        bookmarkContainer = findViewById(R.id.bookmarkContainer);

        btnAdd.setOnClickListener(v -> {
            String url = inputUrl.getText().toString();
            if (!url.isEmpty()) {
                addBookmark(url);
                inputUrl.setText("");
            }
        });
    }
        private void  addBookmark(String url) {

            TextView bookmarkText = new TextView(this);
            bookmarkText.setText(url);
            bookmarkText.setTextSize(18);
            bookmarkText.setPadding(0, 10, 0, 10);

            bookmarkText.setMovementMethod(LinkMovementMethod.getInstance());
            Linkify.addLinks(bookmarkText, Linkify.WEB_URLS);

            Button btnRemove = new Button(this);
            btnRemove.setText("Remove");

            btnRemove.setOnClickListener(v -> {
                bookmarkContainer.removeView(bookmarkText);
                bookmarkContainer.removeView(btnRemove);
            });

            bookmarkContainer.addView(bookmarkText);
            bookmarkContainer.addView(btnRemove);

        }

    }