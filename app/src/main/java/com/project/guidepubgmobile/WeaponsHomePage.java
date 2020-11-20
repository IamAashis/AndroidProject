package com.project.guidepubgmobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.project.guidepubgmobile.Weapons.AssaultRifleAR;
import com.project.guidepubgmobile.Weapons.AutoSniperRiflesDMR;
import com.project.guidepubgmobile.Weapons.LightMachineGunLMG;
import com.project.guidepubgmobile.Weapons.Pistol;
import com.project.guidepubgmobile.Weapons.ShotGunsSG;
import com.project.guidepubgmobile.Weapons.SinperRifleSR;
import com.project.guidepubgmobile.Weapons.SubMachineGunSMG;

public class WeaponsHomePage extends AppCompatActivity {

    CardView assaultrifles, sniperrifles, autosniper, smg, machinegun, shortgun, pistol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapons_home_page);

        assaultrifles = findViewById(R.id.assaultrifles);
        sniperrifles = findViewById(R.id.sniperrifles);
        autosniper = findViewById(R.id.autosniperrifles);
        smg = findViewById(R.id.smg);
        machinegun = findViewById(R.id.machinegun);
        shortgun = findViewById(R.id.shortgun);
        pistol = findViewById(R.id.pistol);

        assaultrifles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Assaultrilfepage = new Intent(WeaponsHomePage.this, AssaultRifleAR.class);
                startActivity(Assaultrilfepage);
            }
        });

        sniperrifles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sniperriflespage = new Intent(WeaponsHomePage.this, SinperRifleSR.class);
                startActivity(sniperriflespage);
            }
        });

        autosniper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent autosnniperpage = new Intent(WeaponsHomePage.this, AutoSniperRiflesDMR.class);
                startActivity(autosnniperpage);
            }
        });
        smg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent smgpage = new Intent(WeaponsHomePage.this, SubMachineGunSMG.class);
                startActivity(smgpage);
            }
        });
        machinegun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Machinegunpage = new Intent(WeaponsHomePage.this, LightMachineGunLMG.class);
                startActivity(Machinegunpage);
            }
        });
        shortgun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shortgunpage = new Intent(WeaponsHomePage.this, ShotGunsSG.class);
                startActivity(shortgunpage);
            }
        });
        pistol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pistolgunpage = new Intent(WeaponsHomePage.this, Pistol.class);
                startActivity(pistolgunpage);
            }
        });


    }
}
