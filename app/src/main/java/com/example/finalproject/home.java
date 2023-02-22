package com.example.finalproject;

import static com.example.finalproject.Login1.PREFS_NAME;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.finalproject.spanish.spanish6;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;

import java.util.Objects;

public class home extends AppCompatActivity {
    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView ;
    NavController navcontroller;
    BottomNavigationView btn;
    static String USER_NAME = "file";
    static String KEY_NAME = "name";
    SharedPreferences sd ;
    ActionBar actionBar;
    TextView textView;
    ImageView i1,i2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        drawerLayout = findViewById(R.id.d1);
        btn = findViewById(R.id.btmnavi);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        DrawerArrowDrawable arrowDrawable = actionBarDrawerToggle.getDrawerArrowDrawable();
        arrowDrawable.setColor(getResources().getColor(R.color.black));
        actionBarDrawerToggle.setDrawerArrowDrawable(arrowDrawable);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        navcontroller = Navigation.findNavController(home.this,R.id.fragment);
        NavigationUI.setupWithNavController(btn,navcontroller);
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#FBC7C7"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(Html.fromHtml("<font color=\"black\">" + "LingoAssist" + "</font>"));
        navigationView = findViewById(R.id.n1);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId())
                {
                    case R.id.rateus:

                        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(home.this);
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
                                    Toast.makeText(home.this, "Thank You For Rating Us!!", Toast.LENGTH_SHORT).show();

                                }
                                else{
                                    bottomSheetDialog.hide();
                                    Toast.makeText(home.this, "Please Select Number Of Stars", Toast.LENGTH_SHORT).show();

                                }
                            }

                        });
                        bottomSheetDialog.show();


                        break;
                    case R.id.share:
                        Intent si = new Intent(Intent.ACTION_SEND);
                        si.setType("text/plain");
                        String body = "Like Share this app" + "\n\nhttps://drive.google.com/drive/folders/1S6V69qAT3eWIrKczw7VCbxX76iV1PTRX?usp=sharing";
                        String sub = "";
                        si.putExtra(Intent.EXTRA_TEXT,body);
                        si.putExtra(Intent.EXTRA_SUBJECT,sub);
                        startActivity(Intent.createChooser(si,"Share Using"));
                        break;
                    case R.id.contact:
                        Intent i = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                                "mailto", "lingoassist20@gmail.com", null));
                        startActivity(i);
                        break;
                    case R.id.remainder:
                        Intent intent = new Intent(home.this,notify.class);
                        startActivity(intent);
                        break;
                    case R.id.about:
                        Intent intent1 = new Intent(home.this,about.class);
                        startActivity(intent1);
                        break;
                    case R.id.privacy:
                        gotoUrl("https://pages.flycricket.io/lingoassist/privacy.html");
                        break;
                    case R.id.out:
                        AlertDialog.Builder builder = new AlertDialog.Builder(home.this);
                        builder.setTitle("Logout!!");
                        builder.setMessage("Are you sure want to Logout??").setCancelable(false).
                                setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        home.super.onBackPressed();
                                        SharedPreferences sharedPreferences = getSharedPreferences(PREFS_NAME , MODE_PRIVATE);
                                        SharedPreferences.Editor editor = sharedPreferences.edit();
                                        editor.clear();
                                        editor.apply();
                                        startActivity(new Intent(home.this , MainActivity.class));
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
                        break;
                }
                drawerLayout.closeDrawer(GravityCompat.START);

                return true;
            }
        });
        View header  = navigationView.getHeaderView(0);
        textView =  header.findViewById(R.id.drawname);
        i1 =  header.findViewById(R.id.u1);
        i2 =  header.findViewById(R.id.u2);
        sd = getSharedPreferences(USER_NAME , MODE_PRIVATE);
        String name = sd.getString(KEY_NAME , null);
        if(name != null)
        {
            textView.setText("Hello \n"+name+"!");
        }
        else{
            textView.setText("Hello Learner!");
        }
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i1.setVisibility(View.INVISIBLE);
                i2.setVisibility(View.VISIBLE);
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.INVISIBLE);
            }
        });
    }




    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {

            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW , uri));
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(home.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
