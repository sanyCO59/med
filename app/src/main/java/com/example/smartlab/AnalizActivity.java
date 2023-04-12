package com.example.smartlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AnalizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analiz);
    }

    public void support(View view) {
        Intent intent = new Intent(AnalizActivity.this, SupportActivity.class);
        startActivity(intent);
    }
    public void result(View view) {
        Intent intent = new Intent(AnalizActivity.this, ResultActivity.class);
        startActivity(intent);
    }
    public void profile(View view) {
        Intent intent = new Intent(AnalizActivity.this, ProfileActivity.class);
        startActivity(intent);
    }

}