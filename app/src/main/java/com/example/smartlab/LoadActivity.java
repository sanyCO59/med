package com.example.smartlab;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class LoadActivity extends AppCompatActivity {
    private TextView textView;
    int count = 0;
    String text = "";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);
        textView = findViewById(R.id.textLoad);

        ImageView circle = findViewById(R.id.Circle);

        new CountDownTimer(4000, 100) {
            @Override
            public void onTick(long l) {
                circle.setRotation(circle.getRotation() + 15);
            }

            @Override
            public void onFinish() {
            }
        }.start();
        new CountDownTimer(4000, 2000) {//таймер на 4 секунды с шагом в 2 секунды 13.04.2023 Лазарев А.В.
            @Override
            public void onTick(long l) {
                if (count == 1) {
                    text = "Производим оплату...";
                } else {
                    text = "Связываемся с банком...";
                    count++;
                }
                textView.setText(text);
            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(LoadActivity.this, FinalActivity.class);
                startActivity(intent);
            }
        }.start();
    }
}