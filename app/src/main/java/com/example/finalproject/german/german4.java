package com.example.finalproject.german;

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
import com.example.finalproject.french.french4;
import com.example.finalproject.french.french5;
import com.example.finalproject.home;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class german4 extends AppCompatActivity {
    ImageButton ib;
    LinearLayout l1,l2,l3,l4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_german4);
        ib = findViewById(R.id.ib2);
        l1 = findViewById(R.id.boy);
        l2 = findViewById(R.id.cat);
        l3 = findViewById(R.id.one);
        l4 = findViewById(R.id.man);
        getSupportActionBar().hide();
        ib = findViewById(R.id.ib1);
        getSupportActionBar().hide();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.bread);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(german4.this);
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
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(german4.this);
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
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(german4.this);
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
        ImageView backbtn = findViewById(R.id.close);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(german4.this, home.class);
                startActivity(i);
                finish();
            }
        });
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(german4.this);
                bottomSheetDialog.setContentView(R.layout.correct);
                Button button1 = bottomSheetDialog.findViewById(R.id.con);
                bottomSheetDialog.show();
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(german4.this, german5.class);
                        startActivity(i);
                        bottomSheetDialog.hide();
                    }
                });
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(german4.this, home.class);
        startActivity(i);
        finish();
    }
}