package com.example.finalproject.russian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.finalproject.R;
import com.example.finalproject.home;
import com.example.finalproject.spanish.Aspanish1;
import com.example.finalproject.spanish.SSplashScreen1;

public class Arussian1 extends AppCompatActivity {
    LottieAnimationView l1;
    Button f1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arussian1);
        getSupportActionBar().hide();
        l1=findViewById(R.id.animation_view1);
        f1=findViewById(R.id.f2);
        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Arussian1.this, RSplashScreen1.class);
                startActivity(i);
            }
        });
        ImageView backbtn = findViewById(R.id.close);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Arussian1.this, home.class);
                startActivity(i);
                finish();
            }
        });
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/z3l3Kgiqq_k");
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW , uri));
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(Arussian1.this, home.class);
        startActivity(i);
        finish();
    }
}