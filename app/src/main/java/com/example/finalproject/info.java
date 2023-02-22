package com.example.finalproject;

import static com.example.finalproject.Login1.PREFS_NAME;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class info extends AppCompatActivity {
    LinearLayout l1,l2,l3,l4,l5,l6;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        getSupportActionBar().hide();
        textView=findViewById(R.id.username);
        l1=findViewById(R.id.rateus);
        l2=findViewById(R.id.share);
        l3=findViewById(R.id.about);
        l4=findViewById(R.id.contact);
        l5=findViewById(R.id.privacy);
        l6=findViewById(R.id.out);

        Intent intent = getIntent();
        String str = intent.getStringExtra("uuname");
        textView.setText(str);
        ImageView backbtn = findViewById(R.id.li1);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    l1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(info.this);
            bottomSheetDialog.setContentView(R.layout.rate);
            ImageView imageView = bottomSheetDialog.findViewById(R.id.close);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    bottomSheetDialog.hide();
                }
            });
            RatingBar r1 = bottomSheetDialog.findViewById(R.id.rateBar);
            Button b1 = bottomSheetDialog.findViewById(R.id.submit);
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(r1.getRating()>0){
                        bottomSheetDialog.hide();
                        Toast.makeText(info.this, "Thank You For Rating Us!!", Toast.LENGTH_SHORT).show();

                    }
                    else{
                        bottomSheetDialog.hide();
                        Toast.makeText(info.this, "Please Select Number Of Stars", Toast.LENGTH_SHORT).show();

                    }
                }

            });
bottomSheetDialog.show();
        }
    });
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent si = new Intent(Intent.ACTION_SEND);
              si.setType("text/plain");
              String body = "Like Share this app" + "\n\nhttps://drive.google.com/drive/folders/1S6V69qAT3eWIrKczw7VCbxX76iV1PTRX?usp=sharing";
              String sub = "";
              si.putExtra(Intent.EXTRA_TEXT,body);
              si.putExtra(Intent.EXTRA_SUBJECT,sub);
              startActivity(Intent.createChooser(si,"Share Using"));

            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(info.this,about.class);
                startActivity(intent);
            }
        });
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "lingoassist20@gmail.com", null));
                startActivity(i);
            }
        });
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://pages.flycricket.io/lingoassist/privacy.html");

            }
        });
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(info.this);
                builder.setTitle("Signout!!");
                builder.setMessage("Are you sure want to Signout??").setCancelable(false).
                        setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                info.super.onBackPressed();
                                SharedPreferences sharedPreferences = getSharedPreferences(PREFS_NAME , MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.clear();
                                editor.apply();
                                startActivity(new Intent(info.this , MainActivity.class));
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW , uri));
    }

}