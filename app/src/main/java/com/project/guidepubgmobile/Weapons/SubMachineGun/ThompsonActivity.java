package com.project.guidepubgmobile.Weapons.SubMachineGun;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Build;
import android.os.Bundle;

import com.project.guidepubgmobile.R;

import java.util.Objects;

public class ThompsonActivity extends AppCompatActivity {

    Toolbar toollbar;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thompson);


        toollbar = findViewById(R.id.toolbar);

        setSupportActionBar(toollbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }
}
