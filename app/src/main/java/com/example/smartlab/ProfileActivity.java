package com.example.smartlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {
    private ImageView imageView16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        imageView16 = findViewById(R.id.imageView16);
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

    public void photo(View view) {
//        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        startActivityForResult(intent, Integer.parseInt(CAMERA_SERVICE));
    }
}