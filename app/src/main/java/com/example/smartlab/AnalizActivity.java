package com.example.smartlab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;


public class AnalizActivity extends AppCompatActivity {
    private FrameLayout tab2, tab3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analiz);
        EditText search = findViewById(R.id.search);
        tab2 = findViewById(R.id.tab2);
        tab3 = findViewById(R.id.tab3);
        search.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                Intent intent = new Intent(AnalizActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });

    }

    public void support(View view) {
        Intent intent = new Intent(AnalizActivity.this, SupportActivity.class);
        startActivity(intent);//Описание: переход к классу "Поддержка" дата: 12.04.2023, автор: Лазарев А.В.
    }

    public void result(View view) {
        Intent intent = new Intent(AnalizActivity.this, ResultActivity.class);
        startActivity(intent);//Описание: переход к классу "Результаты" дата: 12.04.2023, автор: Лазарев А.В.
    }

    public void profile(View view) {
        Intent intent = new Intent(AnalizActivity.this, ProfileActivity.class);
        startActivity(intent);//Описание: переход к классу "Профиль" дата: 12.04.2023, автор: Лазарев А.В.
    }

    public void open(View view) {
        tab2.setVisibility(View.VISIBLE);
        tab3.setVisibility(View.GONE);
    }

    public void korzina(View view) {
        Intent intent = new Intent(AnalizActivity.this, KorzinaActivity.class);
        startActivity(intent);
    }

    public void add(View view) {
        tab2.setVisibility(View.GONE);
        tab3.setVisibility(View.VISIBLE);
    }


    public void close(View view) {
        tab2.setVisibility(View.GONE);
    }
}