package com.example.androidapps.apps;

import android.os.Bundle;
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

public class ShoppingList extends AppCompatActivity {

    private EditText itemInput;
    private LinearLayout itemContainer;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_list);

        itemInput = findViewById(R.id.item_input);
        btnAdd = findViewById(R.id.btn_add);
        itemContainer = findViewById(R.id.item_container);

        btnAdd.setOnClickListener(v -> {
            String itemName = itemInput.getText().toString();
            if (!itemName.isEmpty()) {
                addItem(itemName);
                itemInput.setText("");
            }
        });
    }

    private void addItem(String itemName) {

        LinearLayout itemLayout = new LinearLayout(this);
        itemLayout.setOrientation(LinearLayout.HORIZONTAL);

        TextView itemText = new TextView(this);
        itemText.setText(itemName);
        itemText.setTextSize(18);

        Button btnRemove = new Button(this);
        btnRemove.setText("Remove");

        btnRemove.setOnClickListener(v -> itemContainer.removeView(itemLayout));

        itemLayout.addView(itemText);
        itemLayout.addView(btnRemove);

        itemContainer.addView(itemLayout);
    }
}