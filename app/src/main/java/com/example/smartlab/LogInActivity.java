package com.example.smartlab;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogInActivity extends AppCompatActivity {
    Button button;
    EditText email;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        button = findViewById(R.id.button);
        button.setEnabled(false);
        email = findViewById(R.id.email_input);
        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {//изменение состояния кнопки 11.04.2023 Лазарев А.В.
                if (email.length() == 0) {
                    button.setEnabled(false);
                    button.setBackgroundResource(R.drawable.button2);
                } else {
                    button.setEnabled(true);
                    button.setBackgroundResource(R.drawable.button1);
                }
            }
        });

    }

    public void email(View view) {
        Intent intent = new Intent(LogInActivity.this, EmailActivity.class);
        startActivity(intent);
    }
}