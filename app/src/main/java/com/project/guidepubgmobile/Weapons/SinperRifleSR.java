package com.project.guidepubgmobile.Weapons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.project.guidepubgmobile.R;
import com.project.guidepubgmobile.Weapons.SniperRifle.AwmActivity;
import com.project.guidepubgmobile.Weapons.SniperRifle.Kar98Activity;
import com.project.guidepubgmobile.Weapons.SniperRifle.M24Activity;
import com.project.guidepubgmobile.Weapons.SniperRifle.Mk12Activity;
import com.project.guidepubgmobile.Weapons.SniperRifle.Win94Activity;

public class SinperRifleSR extends AppCompatActivity {
    CardView win94, awm, m24, kar98, mk12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinper_rifle_s_r);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("SniperRifles");

        win94 = findViewById(R.id.win94);
        awm = findViewById(R.id.awm);
        m24 = findViewById(R.id.m24);
        kar98 = findViewById(R.id.kar98);
        mk12 = findViewById(R.id.mk12);


        mk12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotomk12 = new Intent(SinperRifleSR.this, Mk12Activity.class);
                startActivity(gotomk12);
            }
        });

        kar98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotokar98 = new Intent(SinperRifleSR.this, Kar98Activity.class);
                startActivity(gotokar98);
            }
        });

        m24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotom24 = new Intent(SinperRifleSR.this, M24Activity.class);
                startActivity(gotom24);
            }
        });

        awm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoawp = new Intent(SinperRifleSR.this, AwmActivity.class);
                startActivity(gotoawp);
            }
        });

        win94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotowin94 = new Intent(SinperRifleSR.this, Win94Activity.class);
                startActivity(gotowin94);
            }
        });

    }
}
