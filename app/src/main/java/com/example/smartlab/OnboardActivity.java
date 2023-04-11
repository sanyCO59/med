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
        scroll = findViewById(R.id.scroll);
        img1=findViewById(R.id.imageView3);
        img2=findViewById(R.id.imageView4);
        img3=findViewById(R.id.imageView5);
        text1 = findViewById(R.id.text_1);
        text2 = findViewById(R.id.text_2);
        text3 = findViewById(R.id.text_3);
        Circles(1);
        scroll.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View view, int i, int i1, int i2, int i3) {
                int position = (int) scroll.getScrollX();
                System.out.println(position);
                if(position <= 0){
                    Circles(1);
                }else if(position >= 2000){
                    Circles(3);
                }else {
                    Circles(2);
                }
            }
        });
    }
    public void Circles(int i){
        img1.setBackgroundResource(R.drawable.ellipse_0);
        img2.setBackgroundResource(R.drawable.ellipse_0);
        img3.setBackgroundResource(R.drawable.ellipse_0);
        switch (i){
            case 1:
                img1.setBackgroundResource(R.drawable.ellipse_1);
                text1.setText("Пропустить");
                text2.setText("Анализы");
                text3.setText("Экспресс сбор и получение проб");
                break;
            case 2:
                img2.setBackgroundResource(R.drawable.ellipse_1);
                text1.setText("Пропустить");
                text2.setText("Уведомления");
                text3.setText("Вы быстро узнаете о результатах");
                break;
            case 3:
                img3.setBackgroundResource(R.drawable.ellipse_1);
                text1.setText("Завершить");
                text2.setText("Мониторинг");
                text3.setText("Наши врачи всегда наблюдают \n" +
                        "за вашими показателями здоровья");
                break;

        }
    }

    public void next(View view) {
        Intent intent = new Intent(OnboardActivity.this, LogInActivity.class);
        startActivity(intent);
    }
}