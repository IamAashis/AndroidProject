package com.project.guidepubgmobile.Weapons.pistol;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Build;
import android.os.Bundle;

import com.project.guidepubgmobile.R;

import java.util.Objects;

public class R1895Activity extends AppCompatActivity {

    Toolbar toollbar;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r1895);

        toollbar = findViewById(R.id.toolbar);

        setSupportActionBar(toollbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

    }
}
