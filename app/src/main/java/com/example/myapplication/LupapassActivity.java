package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class LupapassActivity extends AppCompatActivity {
    ImageView v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupapass);

        ImageView v = (ImageView) findViewById(R.id.imageView);
        v.setImageResource(R.drawable.gundam_projek_andro_logo);
    }
}
