package com.example.smartlab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MakeCardActivity extends AppCompatActivity {
    private EditText text1, text2, text3, text4;
    private AppCompatButton but;
    int count = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_card);
        text1 = findViewById(R.id.text_card_1);
        text1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {//проверка поля на пустоту 11.04.2023 Лазарев А.В.
                if (text1.length() > 0) {
                    unlock(true);
                } else {
                    unlock(false);
                }
            }
        });
        text2 = findViewById(R.id.text_card_2);
        text2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (text2.length() > 0) {
                    unlock(true);
                } else {
                    unlock(false);
                }
            }
        });
        text3 = findViewById(R.id.text_card_3);
        text3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (text3.length() > 0) {
                    unlock(true);
                } else {
                    unlock(false);
                }
            }
        });
        text4 = findViewById(R.id.text_card_4);
        text4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (text4.length() > 0) {
                    unlock(true);
                } else {
                    unlock(false);
                }
            }
        });
        but = findViewById(R.id.button4);
    }

    public void skip(View view) {
        Intent intent = new Intent(MakeCardActivity.this, AnalizActivity.class);
        startActivity(intent);// переход к классу главной страницы 11.04.2023 Лазарев А.В.
    }

    public void unlock(boolean counter) {//общая проверка полей на пустоту 11.04.2023 Лазарев А.В.
        if (counter) {
            count++;
            if (count == 4) {
                but.setBackgroundResource(R.drawable.button1);
                but.setEnabled(true);
            }
        } else {
            if (count !=0) {
                count--;
            }
            but.setBackgroundResource(R.drawable.button2);
            but.setEnabled(false);
        }
    }
}