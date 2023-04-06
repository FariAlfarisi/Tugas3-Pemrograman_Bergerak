package com.pemrogramanbergerak.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AppearanceActivity extends AppCompatActivity {
    TextView BrandName, BrandText;
    ImageView BrandLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appearance);

        BrandName = findViewById(R.id.BrandTitle);
        BrandLogo = findViewById(R.id.BrandImage);
        BrandText = findViewById(R.id.BrandText);

        String name = getIntent().getStringExtra("nama");
        int logo = getIntent().getIntExtra("logo", R.mipmap.ic_launcher);
        String text = getIntent().getStringExtra("text");

        BrandName.setText(name);
        BrandLogo.setImageResource(logo);
        BrandText.setText(text);
    }
}