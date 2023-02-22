package com.example.finalproject.italian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.finalproject.R;
import com.example.finalproject.german.Agerman2;
import com.example.finalproject.german.german1;
import com.example.finalproject.german.german2;
import com.example.finalproject.home;

public class italian1 extends AppCompatActivity {
    LinearLayout l1,l2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian1);
        l1 = findViewById(R.id.la1);
        l2 = findViewById(R.id.la2);
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(italian1.this, italian2.class);
                startActivity(i);
            }
        });
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i = new Intent(italian1.this, Aitalian2.class);
               startActivity(i);
            }
        });
        getSupportActionBar().hide();
        ImageView backbtn = findViewById(R.id.back);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(italian1.this, home.class);
        startActivity(i);
        finish();
    }
}