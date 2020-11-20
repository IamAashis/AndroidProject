package com.project.guidepubgmobile.Weapons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.project.guidepubgmobile.R;
import com.project.guidepubgmobile.Weapons.AssaultRifle.AugActivity;
import com.project.guidepubgmobile.Weapons.AssaultRifle.M16A4Activity;
import com.project.guidepubgmobile.Weapons.AssaultRifle.M416Activity;
import com.project.guidepubgmobile.Weapons.AssaultRifle.ScarlActivity;
import com.project.guidepubgmobile.Weapons.AssaultRifle.akmActivity;
import com.project.guidepubgmobile.Weapons.AssaultRifle.g36cActivity;
import com.project.guidepubgmobile.Weapons.AssaultRifle.grozaActivity;
import com.project.guidepubgmobile.Weapons.AssaultRifle.mk47Activity;
import com.project.guidepubgmobile.Weapons.AssaultRifle.qbzActivity;

public class AssaultRifleAR extends AppCompatActivity {

    CardView g363, akm, mk47, qbz, groza, m16a4, scarl, m416, aug;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assault_rifle_a_r);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("AssaultRifles");

        g363 = findViewById(R.id.g36c);
        akm = findViewById(R.id.akm);
        mk47 = findViewById(R.id.mk47);
        qbz = findViewById(R.id.qbz);
        groza = findViewById(R.id.groza);
        m16a4 = findViewById(R.id.m16a4);
        scarl = findViewById(R.id.scarl);
        m416 = findViewById(R.id.m416);
        aug = findViewById(R.id.aug);

        aug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoaug = new Intent(AssaultRifleAR.this, AugActivity.class);
                startActivity(gotoaug);
            }
        });

        m416.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotom416 = new Intent(AssaultRifleAR.this, M416Activity.class);
                startActivity(gotom416);
            }
        });

        scarl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoscarl = new Intent(AssaultRifleAR.this, ScarlActivity.class);
                startActivity(gotoscarl);
            }
        });

        m16a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotom16a4 = new Intent(AssaultRifleAR.this, M16A4Activity.class);
                startActivity(gotom16a4);
            }
        });

        groza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotogroza = new Intent(AssaultRifleAR.this, grozaActivity.class);
                startActivity(gotogroza);
            }
        });

        qbz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoabz = new Intent(AssaultRifleAR.this, qbzActivity.class);
                startActivity(gotoabz);
            }
        });

        mk47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotomk47 = new Intent(AssaultRifleAR.this, mk47Activity.class);
                startActivity(gotomk47);
            }
        });

        g363.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotog363 = new Intent(AssaultRifleAR.this, g36cActivity.class);
                startActivity(gotog363);
            }
        });

        akm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoakm = new Intent(AssaultRifleAR.this, akmActivity.class);
                startActivity(gotoakm);
            }
        });


    }
}
