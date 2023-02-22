package com.example.finalproject.bottom;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.finalproject.R;
import com.example.finalproject.home;
import com.example.finalproject.russian.Arussian1;

public class videofrag extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_videofrag, container, false);
        LinearLayout l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
        l1 = view.findViewById(R.id.la1);
        l2 = view.findViewById(R.id.li1);
        l3 = view.findViewById(R.id.la2);
        l4 = view.findViewById(R.id.li2);
        l5 = view.findViewById(R.id.la3);
        l6 = view.findViewById(R.id.li3);
        l7 = view.findViewById(R.id.la4);
        l8 = view.findViewById(R.id.li4);
        l9 = view.findViewById(R.id.la5);
        l10 = view.findViewById(R.id.li5);
        l11 = view.findViewById(R.id.la6);
        l12 = view.findViewById(R.id.li6);
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    gotoUrl("https://youtu.be/fC6nsswjuUk");
                }
            }
        });
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    gotoUrl("https://youtu.be/B1YxhM1W5WQ");
                }
            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    gotoUrl("https://youtu.be/wtiFx1TRCq0");
                }
            }
        });
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    gotoUrl("https://youtu.be/ujDtm0hZyII");
                }
            }
        });
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    gotoUrl("https://youtu.be/psmqsw8n2ck");
                }
            }
        });
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    gotoUrl("https://youtu.be/zMO9Ew8n7MM");
                }
            }
        });
        l7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    gotoUrl("https://youtu.be/c-5JAah_22w");
                }
            }
        });
        l8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    gotoUrl("https://youtu.be/VeH03PzD25E");
                }
            }
        });
        l9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    gotoUrl("https://youtu.be/DAp_v7EH9AA");
                }
            }
        });
        l10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    gotoUrl("https://youtu.be/4ehG-7v21NQ");
                }
            }
        });
        l11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    gotoUrl("https://youtu.be/z3l3Kgiqq_k");
                }
            }
        });
        l12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    gotoUrl("https://youtu.be/clNb2dy1ZEI");
                }
            }
        });
        return view;
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW , uri));
    }
}