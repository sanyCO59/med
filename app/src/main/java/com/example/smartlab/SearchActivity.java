package com.example.smartlab;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class SearchActivity extends AppCompatActivity {
    private ImageView img;
    private EditText search;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        img = findViewById(R.id.img);
        search = findViewById(R.id.search);
        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                img.setVisibility(View.VISIBLE);
                if (search.getText().length()==0){
                    img.setVisibility(View.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (search.getText().length()==0){
                    img.setVisibility(View.GONE);
                }
            }
        });
    }

    public void back(View view) {
        Intent intent = new Intent(SearchActivity.this, AnalizActivity.class);
        startActivity(intent);
    }
}