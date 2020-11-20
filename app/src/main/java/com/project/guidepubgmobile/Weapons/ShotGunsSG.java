package com.project.guidepubgmobile.Weapons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.project.guidepubgmobile.R;
import com.project.guidepubgmobile.Weapons.shotguns.DbsActivity;
import com.project.guidepubgmobile.Weapons.shotguns.S12kActivity;
import com.project.guidepubgmobile.Weapons.shotguns.S1897Activity;
import com.project.guidepubgmobile.Weapons.shotguns.S686Activity;

public class ShotGunsSG extends AppCompatActivity {

    CardView s12k, s1897, s686, dbs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shot_guns_s_g);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("Shotguns");

        s12k = findViewById(R.id.s12k);
        s1897 = findViewById(R.id.s1897);
        s686 = findViewById(R.id.s686);
        dbs = findViewById(R.id.dbs);


        dbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotodbs = new Intent(ShotGunsSG.this, DbsActivity.class);
                startActivity(gotodbs);
            }
        });

        s686.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotos686 = new Intent(ShotGunsSG.this, S686Activity.class);
                startActivity(gotos686);
            }
        });
        s1897.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotos1897 = new Intent(ShotGunsSG.this, S1897Activity.class);
                startActivity(gotos1897);
            }
        });

        s12k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotos12k = new Intent(ShotGunsSG.this, S12kActivity.class);
                startActivity(gotos12k);
            }
        });

    }
}
