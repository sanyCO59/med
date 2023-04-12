package com.example.smartlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    }
    public void support(View view) {
        Intent intent = new Intent(ResultActivity.this, SupportActivity.class);
        startActivity(intent);
    }
    public void analiz(View view) {
        Intent intent = new Intent(ResultActivity.this, AnalizActivity.class);
        startActivity(intent);
    }
    public void profile(View view) {
        Intent intent = new Intent(ResultActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}