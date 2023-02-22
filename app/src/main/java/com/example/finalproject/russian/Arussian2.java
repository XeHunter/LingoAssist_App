package com.example.finalproject.russian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.finalproject.R;
import com.example.finalproject.italian.italian1;
import com.example.finalproject.spanish.Aspanish2;
import com.example.finalproject.spanish.Aspanish3;
import com.example.finalproject.spanish.spanish1;

public class Arussian2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arussian2);
        getSupportActionBar().hide();
        Button f2 = findViewById(R.id.f2);
        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Arussian2.this, Arussian3.class);
                startActivity(i);
            }
        });
        Button backbtn = findViewById(R.id.close);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Arussian2.this, russian1.class);
                startActivity(i);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(Arussian2.this, russian1.class);
        startActivity(i);
        finish();
    }
}