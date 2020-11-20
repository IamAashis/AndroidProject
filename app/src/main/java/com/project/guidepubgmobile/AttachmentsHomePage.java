package com.project.guidepubgmobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.project.guidepubgmobile.Attachements.GripsActivity;
import com.project.guidepubgmobile.Attachements.MagazinesAttachmentsActivity;
import com.project.guidepubgmobile.Attachements.MuzzlesActivity;
import com.project.guidepubgmobile.Attachements.ScopesActivity;
import com.project.guidepubgmobile.Attachements.StocksActivity;

public class AttachmentsHomePage extends AppCompatActivity {


    CardView Magazines, grips, mscopes, mmuzzles, mstocks;

    ImageView Backbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attachments_home_page);

        Magazines = findViewById(R.id.Magazines);
        grips = findViewById(R.id.grips);
        mscopes = findViewById(R.id.gotoscope);
        mmuzzles = findViewById(R.id.gotomuzzles);
        mstocks = findViewById(R.id.gotostocks);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("ATTACHMENTS");
//
//        Backbutton = findViewById(R.id.AttacBackButton);
//
//
//        Backbutton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent backbutton = new Intent(AttachmentsHomePage.this, HomePage.class);
//                startActivity(backbutton);
//            }
//        });

        Magazines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GotoAttachemntList = new Intent(AttachmentsHomePage.this, MagazinesAttachmentsActivity.class);
                startActivity(GotoAttachemntList);
            }
        });
        grips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotogrips = new Intent(AttachmentsHomePage.this, GripsActivity.class);
                startActivity(gotogrips);
            }
        });
        mscopes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoscops = new Intent(AttachmentsHomePage.this, ScopesActivity.class);
                startActivity(gotoscops);
            }
        });
        mmuzzles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotomuzzles = new Intent(AttachmentsHomePage.this, MuzzlesActivity.class);
                startActivity(gotomuzzles);
            }
        });
        mstocks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotostocks = new Intent(AttachmentsHomePage.this, StocksActivity.class);
                startActivity(gotostocks);
            }
        });

    }
}
