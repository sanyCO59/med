package com.example.smartlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    public void analiz(View view) {
        Intent intent = new Intent(ProfileActivity.this, AnalizActivity.class);
        startActivity(intent);
    }
    public void result(View view) {
        Intent intent = new Intent(ProfileActivity.this, ResultActivity.class);
        startActivity(intent);
    }
    public void support(View view) {
        Intent intent = new Intent(ProfileActivity.this, SupportActivity.class);
        startActivity(intent);
    }
}