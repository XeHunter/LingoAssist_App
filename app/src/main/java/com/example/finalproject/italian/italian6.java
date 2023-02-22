package com.example.finalproject.italian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.finalproject.R;
import com.example.finalproject.german.german8;
import com.example.finalproject.german.german9;
import com.example.finalproject.home;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class italian6 extends AppCompatActivity {
    Button l1,l2,l3,l4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian6);
        getSupportActionBar().hide();
        l1 = findViewById(R.id.f1);
        l2 = findViewById(R.id.f2);
        l3 = findViewById(R.id.f3);
        l4 = findViewById(R.id.f4);
        ImageView backbtn = findViewById(R.id.close);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(italian6.this, home.class);
                startActivity(i);
                finish();
            }
        });
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(italian6.this);
                bottomSheetDialog.setContentView(R.layout.incorr);
                Button button1 = bottomSheetDialog.findViewById(R.id.incon);
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
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(italian6.this);
                bottomSheetDialog.setContentView(R.layout.incorr);
                Button button1 = bottomSheetDialog.findViewById(R.id.incon);
                bottomSheetDialog.show();
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bottomSheetDialog.hide();
                    }
                });
            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(italian6.this);
                bottomSheetDialog.setContentView(R.layout.correct);
                Button button1 = bottomSheetDialog.findViewById(R.id.con);
                bottomSheetDialog.show();
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(italian6.this, italian7.class);
                        startActivity(i);
                        bottomSheetDialog.hide();
                    }
                });
            }
        });
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(italian6.this);
                bottomSheetDialog.setContentView(R.layout.incorr);
                Button button1 = bottomSheetDialog.findViewById(R.id.incon);
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
        Intent i = new Intent(italian6.this, home.class);
        startActivity(i);
        finish();
    }
}