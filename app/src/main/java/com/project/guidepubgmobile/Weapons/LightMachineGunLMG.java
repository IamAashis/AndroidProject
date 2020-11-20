package com.project.guidepubgmobile.Weapons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.project.guidepubgmobile.R;
import com.project.guidepubgmobile.Weapons.LightMachineGun.Dp28Activity;
import com.project.guidepubgmobile.Weapons.LightMachineGun.M249Activity;

public class LightMachineGunLMG extends AppCompatActivity {

    CardView m249, dp28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light_machine_gun_l_m_g);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("LightMachineguns");

        m249 = findViewById(R.id.m249);
        dp28 = findViewById(R.id.dp28);

        dp28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotodp28 = new Intent(LightMachineGunLMG.this, Dp28Activity.class);
                startActivity(gotodp28);
            }
        });

        m249.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotom249 = new Intent(LightMachineGunLMG.this, M249Activity.class);
                startActivity(gotom249);
            }
        });


    }
}
