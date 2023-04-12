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

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analiz);

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

    }
}