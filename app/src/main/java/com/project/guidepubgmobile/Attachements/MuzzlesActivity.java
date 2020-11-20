package com.project.guidepubgmobile.Attachements;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.project.guidepubgmobile.R;

public class MuzzlesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muzzles);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("Muzzles");
    }
}
