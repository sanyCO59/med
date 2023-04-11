package com.example.smartlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EmailActivity extends AppCompatActivity {
    TextView timetext;
    EditText inp0, inp1, inp2, inp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        inp0 = findViewById(R.id.input0);
        inp1 = findViewById(R.id.input1);
        inp2 = findViewById(R.id.input2);
        inp3 = findViewById(R.id.input3);
        timetext= findViewById(R.id.timetext);
        inp3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {//проверка полей на пустоту 11.04.2023 Лазарев А.В.
                if (inp0.length() != 0 & inp1.length() != 0 & inp2.length() != 0 & inp3.length() != 0) {
                    Intent intent = new Intent(EmailActivity.this, PasswordActivity.class);
                    startActivity(intent);//переход к классу создания пароля 11.04.2023 Лазарев А.В.
                }

            }
        });

           new CountDownTimer(60000, 1000) {//таймер на 60 секунд с шагом в 1 секунду 11.04.2023 Лазарев А.В.
               @Override
               public void onTick(long l) {
                   String text = "Отправить код повторно можно будет через " + l/1000 + " секунд";
                   timetext.setText(text);
               }

               @Override
               public void onFinish() {
                   onRestart();
               }
           }.start();
    }

    public void back(View view) {
        Intent intent = new Intent(EmailActivity.this, LogInActivity.class);
        startActivity(intent);// переход к классу проверки почты 11.04.2023 Лазарев А.В.
    }
}