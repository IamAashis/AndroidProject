package com.project.guidepubgmobile.Weapons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

//com.project.guidepubgmobile

import com.project.guidepubgmobile.R;
import com.project.guidepubgmobile.Weapons.SubMachineGun.BizonActivity;
import com.project.guidepubgmobile.Weapons.SubMachineGun.Mp5kActivity;
import com.project.guidepubgmobile.Weapons.SubMachineGun.P90Activity;
import com.project.guidepubgmobile.Weapons.SubMachineGun.ThompsonActivity;
import com.project.guidepubgmobile.Weapons.SubMachineGun.Ump45Activity;
import com.project.guidepubgmobile.Weapons.SubMachineGun.UziActivity;
import com.project.guidepubgmobile.Weapons.SubMachineGun.VectorActivity;

public class SubMachineGunSMG extends AppCompatActivity {

    CardView bizon, thompson, uzi, ump, vector, p90, mp5k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_machine_gun_s_m_g);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("SubMachineguns");

        bizon = findViewById(R.id.bizon);
        thompson = findViewById(R.id.thompson);
        uzi = findViewById(R.id.uzi);
        ump = findViewById(R.id.ump);
        vector = findViewById(R.id.vector);
        p90 = findViewById(R.id.p90);
        mp5k = findViewById(R.id.mp5k);


        mp5k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotopmp5k = new Intent(SubMachineGunSMG.this, Mp5kActivity.class);
                startActivity(gotopmp5k);

            }
        });

        p90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotop90 = new Intent(SubMachineGunSMG.this, P90Activity.class);
                startActivity(gotop90);

            }
        });

        vector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotovector = new Intent(SubMachineGunSMG.this, VectorActivity.class);
                startActivity(gotovector);

            }
        });

        ump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoump = new Intent(SubMachineGunSMG.this, Ump45Activity.class);
                startActivity(gotoump);

            }
        });

        uzi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotouzi = new Intent(SubMachineGunSMG.this, UziActivity.class);
                startActivity(gotouzi);

            }
        });

        thompson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotothompson = new Intent(SubMachineGunSMG.this, ThompsonActivity.class);
                startActivity(gotothompson);

            }
        });

        bizon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotobizon = new Intent(SubMachineGunSMG.this, BizonActivity.class);
                startActivity(gotobizon);

            }
        });

    }
}
