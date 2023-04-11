package com.example.smartlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;

public class OnboardActivity extends AppCompatActivity {
    HorizontalScrollView scroll;
    FrameLayout img1, img2, img3;
    TextView text1, text2, text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard);
        scroll = findViewById(R.id.scroll); // обращение к элементам Activity
        img1 = findViewById(R.id.imageView3);
        img2 = findViewById(R.id.imageView4);
        img3 = findViewById(R.id.imageView5);
        text1 = findViewById(R.id.text_1);
        text2 = findViewById(R.id.text_2);
        text3 = findViewById(R.id.text_3);
        Circles(1);
        scroll.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View view, int i, int i1, int i2, int i3) {//проверка положения HorizontalScrollView
                int position = (int) scroll.getScrollX();
                if (position <= 0) {// минимальное значение HorizontalScrollView
                    Circles(1);
                } else if (position >= 2000) {// максимальное значение HorizontalScrollView
                    Circles(3);
                } else {// промежуточное значение HorizontalScrollView
                    Circles(2);
                }
            }
        });
    }

    public void Circles(int i) {//метод замены текста при изменении положения HorizontalScrollView
        img1.setBackgroundResource(R.drawable.ellipse_0);
        img2.setBackgroundResource(R.drawable.ellipse_0);
        img3.setBackgroundResource(R.drawable.ellipse_0);
        switch (i) {
            case 1:// изменение данных при минимальном значении HorizontalScrollView
                img1.setBackgroundResource(R.drawable.ellipse_1);
                text1.setText(R.string.t1);
                text2.setText(R.string.t3);
                text3.setText(R.string.t6);
                break;
            case 2:// изменение данных при промежуточном значении HorizontalScrollView
                img2.setBackgroundResource(R.drawable.ellipse_1);
                text1.setText(R.string.t1);
                text2.setText(R.string.t4);
                text3.setText(R.string.t7);
                break;
            case 3:// изменение данных при максимальном значении HorizontalScrollView
                img3.setBackgroundResource(R.drawable.ellipse_1);
                text1.setText(R.string.t2);
                text2.setText(R.string.t5);
                text3.setText(R.string.t8);
                break;
        }
    }

    public void next(View view) {
        Intent intent = new Intent(OnboardActivity.this, LogInActivity.class);// переход к другому классу
        startActivity(intent);
    }
}