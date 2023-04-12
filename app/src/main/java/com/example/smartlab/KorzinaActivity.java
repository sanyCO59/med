package com.example.smartlab;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class KorzinaActivity extends AppCompatActivity {
    LinearLayout tab;
    int count = 1;
TextView person, counterText, counterText2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korzina);
        tab = findViewById(R.id.tab);
        person = findViewById(R.id.pers);
        counterText = findViewById(R.id.count);
        counterText2 = findViewById(R.id.count2);
    }

    public void back(View view) {
        Intent intent = new Intent(KorzinaActivity.this, AnalizActivity.class);
        startActivity(intent);
    }

    public void del(View view) {
        tab.setVisibility(View.GONE);
    }

    public void plus(View view) {
        counter(true);
    }

    public void minus(View view) {
        counter(false);
    }

    public void counter(boolean i) {
        if(i){
            count++;

        }else{
            if(count !=1){
                count--;
            }

        }
        person.setText(count+" пациент");
        counterText.setText(count*690+" ₽");
        counterText2.setText(counterText.getText());
    }
}