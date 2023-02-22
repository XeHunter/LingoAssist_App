package com.example.finalproject.spanish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.finalproject.R;
import com.example.finalproject.home;
import com.example.finalproject.italian.italian10;
import com.example.finalproject.italian.italian11;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class spanish10 extends AppCompatActivity {
    ImageButton ib;
    LinearLayout l1,l2,l3,l4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spanish10);
        l1 = findViewById(R.id.b1);
        l2 = findViewById(R.id.b2);
        l3 = findViewById(R.id.b3);
        l4 = findViewById(R.id.b4);
        ib = findViewById(R.id.ib1);
        getSupportActionBar().hide();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.girl2);
        mediaPlayer.start();
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(spanish10.this);
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
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(spanish10.this);
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
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(spanish10.this);
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
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(spanish10.this);
                bottomSheetDialog.setContentView(R.layout.correct);
                Button button1 = bottomSheetDialog.findViewById(R.id.con);
                bottomSheetDialog.show();
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(spanish10.this, spanish11.class);
                        startActivity(i);
                        bottomSheetDialog.hide();
                    }
                });
            }
        });
        ImageView backbtn = findViewById(R.id.close);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(spanish10.this, home.class);
                startActivity(i);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(spanish10.this, home.class);
        startActivity(i);
        finish();
    }
}