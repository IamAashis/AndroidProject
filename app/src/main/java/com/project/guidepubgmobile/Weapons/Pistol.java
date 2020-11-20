package com.project.guidepubgmobile.Weapons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.project.guidepubgmobile.R;
import com.project.guidepubgmobile.Weapons.pistol.DesertEagleActivity;
import com.project.guidepubgmobile.Weapons.pistol.FlaregunActivity;
import com.project.guidepubgmobile.Weapons.pistol.P18cActivity;
import com.project.guidepubgmobile.Weapons.pistol.P1991Activity;
import com.project.guidepubgmobile.Weapons.pistol.R1895Activity;
import com.project.guidepubgmobile.Weapons.pistol.R45Activity;
import com.project.guidepubgmobile.Weapons.pistol.SawedoffActivity;
import com.project.guidepubgmobile.Weapons.pistol.SkorpionActivity;
import com.project.guidepubgmobile.Weapons.pistol.p92Activity;

public class Pistol extends AppCompatActivity {
    CardView skorpion, flaregun, sawedoff, p18c, r45, p92, p1911, deserteagle, r1895;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pistol);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("Pistols");

        skorpion = findViewById(R.id.skorpion);
        flaregun = findViewById(R.id.flaregun);
        sawedoff = findViewById(R.id.sawedoff);
        p18c = findViewById(R.id.p18c);
        r45 = findViewById(R.id.r45);
        p92 = findViewById(R.id.p92);
        p1911 = findViewById(R.id.p1991);
        deserteagle = findViewById(R.id.deserteagle);
        r1895 = findViewById(R.id.r1895);


        r1895.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotor1895 = new Intent(Pistol.this, R1895Activity.class);
                startActivity(gotor1895);
            }
        });

        deserteagle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotodeserteagle = new Intent(Pistol.this, DesertEagleActivity.class);
                startActivity(gotodeserteagle);
            }
        });

        p1911.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotop1911 = new Intent(Pistol.this, P1991Activity.class);
                startActivity(gotop1911);
            }
        });

        p92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotop92 = new Intent(Pistol.this, p92Activity.class);
                startActivity(gotop92);
            }
        });

        r45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotor45 = new Intent(Pistol.this, R45Activity.class);
                startActivity(gotor45);
            }
        });

        p18c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotop18c = new Intent(Pistol.this, P18cActivity.class);
                startActivity(gotop18c);
            }
        });

        sawedoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotosawedoff = new Intent(Pistol.this, SawedoffActivity.class);
                startActivity(gotosawedoff);
            }
        });

        flaregun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoflaregun = new Intent(Pistol.this, FlaregunActivity.class);
                startActivity(gotoflaregun);
            }
        });

        skorpion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoskoprion = new Intent(Pistol.this, SkorpionActivity.class);
                startActivity(gotoskoprion);
            }
        });

    }
}
