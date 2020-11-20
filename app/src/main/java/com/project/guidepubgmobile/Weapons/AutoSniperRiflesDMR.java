package com.project.guidepubgmobile.Weapons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.project.guidepubgmobile.R;
import com.project.guidepubgmobile.Weapons.AutoSniperRifle.Mini14Activity;
import com.project.guidepubgmobile.Weapons.AutoSniperRifle.Mk14Activity;
import com.project.guidepubgmobile.Weapons.AutoSniperRifle.QbuActivity;
import com.project.guidepubgmobile.Weapons.AutoSniperRifle.SksActivity;
import com.project.guidepubgmobile.Weapons.AutoSniperRifle.SlrActivity;
import com.project.guidepubgmobile.Weapons.AutoSniperRifle.VssActivity;

public class AutoSniperRiflesDMR extends AppCompatActivity {
    CardView qbu, mini14, mk14, slr, vss, sks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_sniper_rifles_d_m_r);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("AutoSniperRifles");

        qbu = findViewById(R.id.qbu);
        mini14 = findViewById(R.id.mini14);
        mk14 = findViewById(R.id.mk14);
        slr = findViewById(R.id.slr);
        vss = findViewById(R.id.vss);
        sks = findViewById(R.id.sks);


        sks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotosks = new Intent(AutoSniperRiflesDMR.this, SksActivity.class);
                startActivity(gotosks);
            }
        });

        vss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotovss = new Intent(AutoSniperRiflesDMR.this, VssActivity.class);
                startActivity(gotovss);
            }
        });

        slr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoslr = new Intent(AutoSniperRiflesDMR.this, SlrActivity.class);
                startActivity(gotoslr);
            }
        });

        mk14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotomk14 = new Intent(AutoSniperRiflesDMR.this, Mk14Activity.class);
                startActivity(gotomk14);
            }
        });

        mini14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotomini14 = new Intent(AutoSniperRiflesDMR.this, Mini14Activity.class);
                startActivity(gotomini14);
            }
        });

        qbu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoqbu = new Intent(AutoSniperRiflesDMR.this, QbuActivity.class);
                startActivity(gotoqbu);
            }
        });

    }
}
