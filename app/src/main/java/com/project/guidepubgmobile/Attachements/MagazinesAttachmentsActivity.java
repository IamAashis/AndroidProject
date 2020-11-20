package com.project.guidepubgmobile.Attachements;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.project.guidepubgmobile.Attachements.Magazines.ExtendeMagSRDMR.oneQuickdrawExtendedActivity;
import com.project.guidepubgmobile.R;

public class MagazinesAttachmentsActivity extends AppCompatActivity {

    CardView ARRifleQuickDraw, Quickdrawextendedmagsrdmr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magazines_attachments);

//        ARRifleQuickDraw = findViewById(R.id.ARRifleQuickDraw);
        Quickdrawextendedmagsrdmr = findViewById(R.id.Quickdrawextendedmagsrdmr);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("Magazines");


        Quickdrawextendedmagsrdmr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gotoquickdrawextended = new Intent(MagazinesAttachmentsActivity.this, oneQuickdrawExtendedActivity.class);
                startActivity(Gotoquickdrawextended);
            }
        });


//
//        ARRifleQuickDraw.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent GotoARQuickDraw = new Intent(MagazinesAttachmentsActivity.this, ARQuickDraw.class);
//                startActivity(GotoARQuickDraw);
//            }
//        });

    }
}
