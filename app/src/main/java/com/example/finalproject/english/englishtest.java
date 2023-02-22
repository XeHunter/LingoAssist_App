package com.example.finalproject.english;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.finalproject.R;
import com.example.finalproject.home;
import com.example.finalproject.spanish.spanish7;
import com.example.finalproject.spanish.spanish8;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class englishtest extends AppCompatActivity {
    Button l1,l2,l3,l4,l5,l6,l7,l8;
    ImageView ib,ib1;
    RelativeLayout r1,r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_englishtest);
        getSupportActionBar().hide();
        l1 = findViewById(R.id.f1);
        l2 = findViewById(R.id.f2);
        l3 = findViewById(R.id.f3);
        l4 = findViewById(R.id.f4);
        l5 = findViewById(R.id.f11);
        l6 = findViewById(R.id.f12);
        l7 = findViewById(R.id.f13);
        l8 = findViewById(R.id.f14);
        ib = findViewById(R.id.ib2);
        ib1 = findViewById(R.id.iib2);
        r1 = findViewById(R.id.test1);
        r2 = findViewById(R.id.test2);
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.eta1);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        ImageView backbtn = findViewById(R.id.close);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(englishtest.this, home.class);
                startActivity(i);
                finish();
            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(englishtest.this);
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
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(englishtest.this);
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
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(englishtest.this);
                bottomSheetDialog.setContentView(R.layout.hcorrect);
                Button button1 = bottomSheetDialog.findViewById(R.id.hcon);
                bottomSheetDialog.show();
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        r1.setVisibility(View.INVISIBLE);
                        r2.setVisibility(View.VISIBLE);
                        bottomSheetDialog.hide();
                    }
                });
            }
        });
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(englishtest.this);
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
        //        Test 2
        MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.eta2);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(englishtest.this);
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
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(englishtest.this);
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
        l7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(englishtest.this);
                bottomSheetDialog.setContentView(R.layout.hcorrect);
                Button button1 = bottomSheetDialog.findViewById(R.id.hcon);
                bottomSheetDialog.show();
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(englishtest.this, Aenglish1.class);
                        startActivity(i);
                        bottomSheetDialog.hide();
                    }
                });
            }
        });
        l8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(englishtest.this);
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
        Intent i = new Intent(englishtest.this, home.class);
        startActivity(i);
        finish();
    }
}