package com.example.finalproject.italian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.example.finalproject.R;
import com.example.finalproject.german.Agerman6;
import com.example.finalproject.german.GSplashScreen3;

public class ISplashScreen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isplash_screen3);
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

                    Intent intent = new Intent(ISplashScreen3.this , Aitalian6.class);
                    startActivity(intent);
                    finish();

                }
            }
        };td.start();
    }
}