package com.example.finalproject.italian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.finalproject.R;
import com.example.finalproject.german.Agerman2;
import com.example.finalproject.german.Agerman3;
import com.example.finalproject.german.german1;

public class Aitalian2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aitalian2);
        getSupportActionBar().hide();
        Button f2 = findViewById(R.id.f2);
        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Aitalian2.this, Aitalian3.class);
                startActivity(i);
            }
        });
        Button backbtn = findViewById(R.id.close);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aitalian2.this, italian1.class);
                startActivity(i);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(Aitalian2.this, italian1.class);
        startActivity(i);
        finish();
    }
}