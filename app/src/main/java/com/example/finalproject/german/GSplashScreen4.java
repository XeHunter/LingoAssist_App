package com.example.finalproject.german;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.example.finalproject.R;
import com.example.finalproject.french.SplashScreen4;
import com.example.finalproject.french.SplashScreen5;

public class GSplashScreen4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gsplash_screen4);
        getSupportActionBar().hide();
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Thread td = new Thread(){

            @Override
            public void run() {
                try {


                    sleep(5000);

                }catch (Exception exception){

                    exception.printStackTrace();
                }finally {

                    Intent intent = new Intent(GSplashScreen4.this , GSplashScreen5.class);
                    startActivity(intent);
                    finish();

                }
            }
        };td.start();
    }
}