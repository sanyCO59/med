package com.example.smartlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SupportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);
    }
    public void analiz(View view) {
        Intent intent = new Intent(SupportActivity.this, AnalizActivity.class);
        startActivity(intent);
    }
    public void result(View view) {
        Intent intent = new Intent(SupportActivity.this, ResultActivity.class);
        startActivity(intent);
    }
    public void profile(View view) {
        Intent intent = new Intent(SupportActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}