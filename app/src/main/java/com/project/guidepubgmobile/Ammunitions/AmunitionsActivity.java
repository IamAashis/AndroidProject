package com.project.guidepubgmobile.Ammunitions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.project.guidepubgmobile.Ammunitions.Ammo.AcpActivity;
import com.project.guidepubgmobile.Ammunitions.Ammo.FiveammoActivity;
import com.project.guidepubgmobile.Ammunitions.Ammo.GaugeammoActivity;
import com.project.guidepubgmobile.Ammunitions.Ammo.MagnumammoActivity;
import com.project.guidepubgmobile.Ammunitions.Ammo.NineammoActivity;
import com.project.guidepubgmobile.Ammunitions.Ammo.SevenammoActivity;
import com.project.guidepubgmobile.R;

public class AmunitionsActivity extends AppCompatActivity {

    CardView acpammo, sevensixaamo, fiveammo, nineammo, guageaamo, boltammo, flareammo, magnumammo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amunitions);

        acpammo = findViewById(R.id.acpammo);
        sevensixaamo = findViewById(R.id.sevensixammo);
        fiveammo = findViewById(R.id.fiveammo);
        nineammo = findViewById(R.id.nineammo);
        guageaamo = findViewById(R.id.guageaamo);
        boltammo = findViewById(R.id.boltammo);
        flareammo = findViewById(R.id.flareammo);
        magnumammo = findViewById(R.id.magnumammo);

        magnumammo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotomagnumammo = new Intent(AmunitionsActivity.this, MagnumammoActivity.class);
                startActivity(gotomagnumammo);
            }
        });

        guageaamo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoguageammo = new Intent(AmunitionsActivity.this, GaugeammoActivity.class);
                startActivity(gotoguageammo);
            }
        });

        nineammo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotonineammo = new Intent(AmunitionsActivity.this, NineammoActivity.class);
                startActivity(gotonineammo);
            }
        });

        fiveammo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotofiveammo = new Intent(AmunitionsActivity.this, FiveammoActivity.class);
                startActivity(gotofiveammo);
            }
        });

        sevensixaamo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotosevensix = new Intent(AmunitionsActivity.this, SevenammoActivity.class);
                startActivity(gotosevensix);
            }
        });
        acpammo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoacpammo = new Intent(AmunitionsActivity.this, AcpActivity.class);
                startActivity(gotoacpammo);
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("Ammunitions");


    }
}
