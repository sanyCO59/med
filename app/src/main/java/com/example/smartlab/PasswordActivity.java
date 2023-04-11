package com.example.smartlab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class PasswordActivity extends AppCompatActivity {
    AppCompatButton but0, but1, but2, but3, but4, but5, but6, but7, but8, but9, butdel;
    TextView img1, img2, img3, img4;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        Handler handler = new Handler();
        but0 = findViewById(R.id.but0);
        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//обработка нажатия кнопки 11.04.2023 Лазарев А.В.
                but0.setBackgroundResource(R.drawable.ellipse_big_blue);
                but0.setTextColor(Color.parseColor("#FFFFFF"));
                counter(true);
                handler.postDelayed(new Runnable() {// задержка при нажатии кнопки 11.04.2023 Лазарев А.В.
                    @Override
                    public void run() {
                        but0.setBackgroundResource(R.drawable.ellipse_big_grey);
                        but0.setTextColor(Color.parseColor("#000000"));
                    }
                }, 300);
            }
        });
        but1 = findViewById(R.id.but);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                but1.setBackgroundResource(R.drawable.ellipse_big_blue);
                but1.setTextColor(Color.parseColor("#FFFFFF"));
                counter(true);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        but1.setBackgroundResource(R.drawable.ellipse_big_grey);
                        but1.setTextColor(Color.parseColor("#000000"));
                    }
                }, 300);
            }
        });
        but2 = findViewById(R.id.but2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                but2.setBackgroundResource(R.drawable.ellipse_big_blue);
                but2.setTextColor(Color.parseColor("#FFFFFF"));
                counter(true);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        but2.setBackgroundResource(R.drawable.ellipse_big_grey);
                        but2.setTextColor(Color.parseColor("#000000"));
                    }
                }, 300);
            }
        });
        but3 = findViewById(R.id.but3);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                but3.setBackgroundResource(R.drawable.ellipse_big_blue);
                but3.setTextColor(Color.parseColor("#FFFFFF"));
                counter(true);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        but3.setBackgroundResource(R.drawable.ellipse_big_grey);
                        but3.setTextColor(Color.parseColor("#000000"));
                    }
                }, 300);
            }
        });
        but4 = findViewById(R.id.but4);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                but4.setBackgroundResource(R.drawable.ellipse_big_blue);
                but4.setTextColor(Color.parseColor("#FFFFFF"));
                counter(true);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        but4.setBackgroundResource(R.drawable.ellipse_big_grey);
                        but4.setTextColor(Color.parseColor("#000000"));
                    }
                }, 300);
            }
        });
        but5 = findViewById(R.id.but5);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                but5.setBackgroundResource(R.drawable.ellipse_big_blue);
                but5.setTextColor(Color.parseColor("#FFFFFF"));
                counter(true);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        but5.setBackgroundResource(R.drawable.ellipse_big_grey);
                        but5.setTextColor(Color.parseColor("#000000"));
                    }
                }, 300);
            }
        });
        but6 = findViewById(R.id.but6);
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                but6.setBackgroundResource(R.drawable.ellipse_big_blue);
                but6.setTextColor(Color.parseColor("#FFFFFF"));
                counter(true);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        but6.setBackgroundResource(R.drawable.ellipse_big_grey);
                        but6.setTextColor(Color.parseColor("#000000"));
                    }
                }, 300);
            }
        });
        but7 = findViewById(R.id.but7);
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                but7.setBackgroundResource(R.drawable.ellipse_big_blue);
                but7.setTextColor(Color.parseColor("#FFFFFF"));
                counter(true);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        but7.setBackgroundResource(R.drawable.ellipse_big_grey);
                        but7.setTextColor(Color.parseColor("#000000"));
                    }
                }, 300);
            }
        });
        but8 = findViewById(R.id.but8);
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                but8.setBackgroundResource(R.drawable.ellipse_big_blue);
                but8.setTextColor(Color.parseColor("#FFFFFF"));
                counter(true);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        but8.setBackgroundResource(R.drawable.ellipse_big_grey);
                        but8.setTextColor(Color.parseColor("#000000"));
                    }
                }, 300);
            }
        });
        but9 = findViewById(R.id.but9);
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                but9.setBackgroundResource(R.drawable.ellipse_big_blue);
                but9.setTextColor(Color.parseColor("#FFFFFF"));
                counter(true);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        but9.setBackgroundResource(R.drawable.ellipse_big_grey);
                        but9.setTextColor(Color.parseColor("#000000"));
                    }
                }, 300);
            }
        });
        butdel = findViewById(R.id.butdel);
        butdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter(false);
            }
        });


    }

    private void counter(boolean i) {//Работа с сотоянием индикатора заполнения пароля 11.04.2023 Лазарев А.В.
        if (i) {
            if (count != 4) {
                count++;
            }
        } else {
            if (count != 0) {
                count--;
            }

        }
        img1.setBackgroundResource(R.drawable.ellipse_4);
        img2.setBackgroundResource(R.drawable.ellipse_4);
        img3.setBackgroundResource(R.drawable.ellipse_4);
        img4.setBackgroundResource(R.drawable.ellipse_4);

        switch (count) {
            case 0:

                break;
            case 1:
                img1.setBackgroundResource(R.drawable.ellipse_3);
                break;
            case 2:
                img2.setBackgroundResource(R.drawable.ellipse_3);
                img1.setBackgroundResource(R.drawable.ellipse_3);
                break;
            case 3:
                img3.setBackgroundResource(R.drawable.ellipse_3);
                img2.setBackgroundResource(R.drawable.ellipse_3);
                img1.setBackgroundResource(R.drawable.ellipse_3);
                break;
            case 4:
                Intent intent = new Intent(PasswordActivity.this, MakeCardActivity.class);
                startActivity(intent);// переход к классу ссоздания карты 11.04.2023 Лазарев А.В.
                break;
        }
    }

    public void skip(View view) {
        Intent intent = new Intent(PasswordActivity.this, AnalizActivity.class);
        startActivity(intent);// переход к классу главной страницы 11.04.2023 Лазарев А.В.
    }
}