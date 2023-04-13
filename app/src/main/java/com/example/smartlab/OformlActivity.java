package com.example.smartlab;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;

public class OformlActivity extends AppCompatActivity {
    private TextView pers1, pers2, ed1, ed2, button;
    private FrameLayout tab;
    boolean isPersB1, isPersB2, in1, in2, in3;
    private EditText input1, input2, input3;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oforml);
        button.setEnabled(false);
        in1 = false;
        in2 = false;
        in3 = false;
        button = findViewById(R.id.textView51);
        pers1 = findViewById(R.id.person1);
        pers2 = findViewById(R.id.person2);
        ed1 = findViewById(R.id.edit_1);
        ed2 = findViewById(R.id.edit_2);
        tab = findViewById(R.id.tab);
        input1 = findViewById(R.id.edit1);
        input1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (input1.getText().length() != 0) {
                    in1 = true;
                } else {
                    in2 = false;
                }
                checkInput();
            }
        });
        input2 = findViewById(R.id.edit2);
        input2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (input2.getText().length() != 0) {
                    in2 = true;
                } else {
                    in2 = false;
                }
                checkInput();
            }
        });
        input3 = findViewById(R.id.edit4);
        input3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (input3.getText().length() != 0) {
                    in3 = true;
                } else {
                    in3 = false;
                }
                checkInput();
            }
        });
        isPersB1 = false;
        isPersB2 = false;
    }

    public void res1(View view) {
        pers1.setBackgroundResource(R.drawable.bg1);
        pers1.setTextColor(Color.parseColor("#FFFFFF"));
        isPersB1 = true;
    }

    public void res2(View view) {
        pers2.setBackgroundResource(R.drawable.bg1);
        pers2.setTextColor(Color.parseColor("#FFFFFF"));
        isPersB2 = true;
    }

    public void addPerson(View view) {
        if (isPersB1) {
            ed2.setVisibility(View.VISIBLE);
        }
        if (isPersB2) {
            ed1.setVisibility(View.VISIBLE);
        }
        tab.setVisibility(View.GONE);
    }

    public void add(View view) {
        tab.setVisibility(View.VISIBLE);
    }

    public void checkInput() {
        if (in1 & in2 & in3) {
            button.setEnabled(true);
            button.setBackgroundResource(R.drawable.button1);
        }
    }

    public void close(View view) {
        tab.setVisibility(View.GONE);
    }
}

