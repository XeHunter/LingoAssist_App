package com.example.finalproject.english;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.finalproject.R;
import com.example.finalproject.home;
import com.example.finalproject.spanish.spanish7;
import com.example.finalproject.spanish.spanish8;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class english7 extends AppCompatActivity {
    Button l1,l2,l3,l4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english7);
        getSupportActionBar().hide();
        l1 = findViewById(R.id.f1);
        l2 = findViewById(R.id.f2);
        l3 = findViewById(R.id.f3);
        l4 = findViewById(R.id.f4);
        ImageView backbtn = findViewById(R.id.close);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(english7.this, home.class);
                startActivity(i);
                finish();
            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(english7.this);
                bottomSheetDialog.setContentView(R.layout.hincorr);
                Button button1 = bottomSheetDialog.findViewById(R.id.hincon);
                bottomSheetDialog.show();
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bottomSheetDialog.hide();
                    }
                });
            }
        });
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(english7.this);
                bottomSheetDialog.setContentView(R.layout.hincorr);
                Button button1 = bottomSheetDialog.findViewById(R.id.hincon);
                bottomSheetDialog.show();
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bottomSheetDialog.hide();
                    }
                });
            }
        });
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(english7.this);
                bottomSheetDialog.setContentView(R.layout.hcorrect);
                Button button1 = bottomSheetDialog.findViewById(R.id.hcon);
                bottomSheetDialog.show();
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(english7.this, english8.class);
                        startActivity(i);
                        bottomSheetDialog.hide();
                    }
                });
            }
        });
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(english7.this);
                bottomSheetDialog.setContentView(R.layout.hincorr);
                Button button1 = bottomSheetDialog.findViewById(R.id.hincon);
                bottomSheetDialog.show();
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bottomSheetDialog.hide();
                    }
                });
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(english7.this, home.class);
        startActivity(i);
        finish();
    }
}