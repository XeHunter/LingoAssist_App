package com.example.finalproject.bottom;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.finalproject.MainActivity;
import com.example.finalproject.R;
import com.example.finalproject.english.english1;
import com.example.finalproject.french.french1;
import com.example.finalproject.german.german1;
import com.example.finalproject.home;
import com.example.finalproject.info;
import com.example.finalproject.italian.italian1;
import com.example.finalproject.russian.russian1;
import com.example.finalproject.spanish.spanish1;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class coursesfrag extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_coursesfrag, container, false);
        LinearLayout l1,l2,l3,l4,l5,l6;
        TextView textView;
        textView=view.findViewById(R.id.username);
        l1 = view.findViewById(R.id.ll0);
        l2 = view.findViewById(R.id.ll1);
        l3 = view.findViewById(R.id.ll2);
        l4 = view.findViewById(R.id.ll3);
        l5 = view.findViewById(R.id.ll4);
        l6 = view.findViewById(R.id.ll5);
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext() );
                builder.setTitle("Interface Change !!");
                builder.setMessage("For learning English the interface would be changed in Hindi ??").setCancelable(false).
                        setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Intent intent1 = new Intent(Intent.ACTION_MAIN);
                                intent1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                intent1.addCategory(Intent.CATEGORY_HOME);
                                startActivity(new Intent(getContext(), english1.class));
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });

        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), french1.class);
                startActivity(intent);
            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), german1.class);
                startActivity(intent);
            }
        });
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), italian1.class);
                startActivity(intent);
            }
        });
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), spanish1.class);
                startActivity(intent);
            }
        });
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), russian1.class);
                startActivity(intent);
            }
        });
        return view;
    }
}