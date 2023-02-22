package com.example.finalproject.german;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.finalproject.R;
import com.example.finalproject.french.Afrench1;
import com.example.finalproject.french.frenchtest;
import com.example.finalproject.home;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class germantest extends AppCompatActivity {
    ImageView ib,ib1;
    EditText e1,e2;
    Button b,b1;
    RelativeLayout r1,r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_germantest);
        ib = findViewById(R.id.ib2);
        ib1 = findViewById(R.id.iib2);
        e1 = findViewById(R.id.ts1);
        e2 = findViewById(R.id.tss1);
        b = findViewById(R.id.b1);
        b1 = findViewById(R.id.bb1);
        r1 = findViewById(R.id.test1);
        r2 = findViewById(R.id.test2);
        getSupportActionBar().hide();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.gta1);
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
                Intent i = new Intent(germantest.this, home.class);
                startActivity(i);
                finish();
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((e1.getText().toString().trim().equals("a bread and a tea"))||(e1.getText().toString().trim().equals("A bread and a tea")))
                {
                    BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(germantest.this);
                    bottomSheetDialog.setContentView(R.layout.correct);
                    Button button1 = bottomSheetDialog.findViewById(R.id.con);
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
                else
                {
                    BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(germantest.this);
                    bottomSheetDialog.setContentView(R.layout.incorr);
                    Button button1 = bottomSheetDialog.findViewById(R.id.incon);
                    bottomSheetDialog.show();
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            e1.setText("");
                            bottomSheetDialog.hide();
                        }
                    });
                }
            }
        });
//        Test 2
        MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.gta2);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((e2.getText().toString().trim().equals("a coffee please"))||(e2.getText().toString().trim().equals("A coffee please")))
                {
                    BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(germantest.this);
                    bottomSheetDialog.setContentView(R.layout.correct);
                    Button button1 = bottomSheetDialog.findViewById(R.id.con);
                    bottomSheetDialog.show();
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i = new Intent(germantest.this, Agerman1.class);
                            startActivity(i);
                            bottomSheetDialog.hide();
                        }
                    });
                }
                else
                {
                    BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(germantest.this);
                    bottomSheetDialog.setContentView(R.layout.incorr);
                    Button button1 = bottomSheetDialog.findViewById(R.id.incon);
                    bottomSheetDialog.show();
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            e2.setText("");
                            bottomSheetDialog.hide();
                        }
                    });
                }
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(germantest.this, home.class);
        startActivity(i);
        finish();
    }
}