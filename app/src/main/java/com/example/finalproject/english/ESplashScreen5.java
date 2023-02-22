package com.example.finalproject.english;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.example.finalproject.R;
import com.example.finalproject.home;
import com.example.finalproject.spanish.SSplashScreen5;

public class ESplashScreen5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esplash_screen5);
        getSupportActionBar().hide();
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Thread td = new Thread(){

            @Override
            public void run() {
                try {


                    sleep(4000);

                }catch (Exception exception){

                    exception.printStackTrace();
                }finally {

                    Intent intent = new Intent(ESplashScreen5.this , home.class);
                    startActivity(intent);
                    finish();

                }
            }
        };td.start();
    }
}