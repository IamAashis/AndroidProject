package com.project.guidepubgmobile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.project.guidepubgmobile.Ammunitions.AmunitionsActivity;
import com.project.guidepubgmobile.Consumables.ConsumbalesActivity;
import com.project.guidepubgmobile.Equipments.EquipmentsActivity;
import com.project.guidepubgmobile.Melle.MelleActivity;
import com.project.guidepubgmobile.Throwables.ThrowablesActivity;
import com.project.guidepubgmobile.Vehicles.VehiclesActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.navigation.NavigationView;

public class HomePage extends AppCompatActivity {

    CardView HomeAttachments, HomeWeapons, Ammunitionspage, throwablepage, MellePage, EquipmentPage, ConsumbalesPages, VehiclesPage;
    private DrawerLayout drawer;
    private NavigationView navigationView;
    private Toolbar toolbar;
    private ActionBarDrawerToggle toggle;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

//
//        MobileAds.initialize(this, new OnInitializationCompleteListener() {
//            @Override
//            public void onInitializationComplete(InitializationStatus initializationStatus) {
//            }
//        });

//        APPID

        MobileAds.initialize(this,"ca-app-pub-1572920524042723~3945345259");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        toolbar = findViewById(R.id.toolbarhomepage);
        navigationView = findViewById(R.id.navigation);
        drawer = findViewById(R.id.drawarelayout);

        setSupportActionBar(toolbar);


        toggle = new ActionBarDrawerToggle(HomePage.this, drawer, toolbar, R.string.open, R.string.close);
        drawer.addDrawerListener(toggle);
        toggle.syncState(); //It visible the menu item in toolbar and automatic use the drawer


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.share:
                        shareus();
                        break;

                    case R.id.rateus:
                        try {
                            startActivity(new Intent(Intent.ACTION_VIEW,
                                    Uri.parse("market://details?id=" + getPackageName())));
                        } catch (ActivityNotFoundException e) {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/appsdetails?id=" +
                                    getPackageName())));
                        }
                        break;

                    case R.id.exit:
                        finish();
                        System.exit(0);
                        break;
                }
                return true;
            }
        });

        HomeAttachments = findViewById(R.id.HomeAttac);
        HomeWeapons = findViewById(R.id.HomeWeapons);
        Ammunitionspage = findViewById(R.id.Ammunitionspage);
        throwablepage = findViewById(R.id.throwablepage);
        MellePage = findViewById(R.id.MellePage);
        EquipmentPage = findViewById(R.id.EquipmentsPage);
        ConsumbalesPages = findViewById(R.id.ConsumbalesPage);
        VehiclesPage = findViewById(R.id.VehiclePage);

        VehiclesPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent VehicPage = new Intent(HomePage.this, VehiclesActivity.class);
                startActivity(VehicPage);
            }
        });
        ConsumbalesPages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ConsuPage = new Intent(HomePage.this, ConsumbalesActivity.class);
                startActivity(ConsuPage);
            }
        });


        EquipmentPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MellePage = new Intent(HomePage.this, EquipmentsActivity.class);
                startActivity(MellePage);
            }
        });

        MellePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MellePage = new Intent(HomePage.this, MelleActivity.class);
                startActivity(MellePage);
            }
        });
        throwablepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent throwablepage = new Intent(HomePage.this, ThrowablesActivity.class);
                startActivity(throwablepage);
            }
        });


        Ammunitionspage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ammunitionspage = new Intent(HomePage.this, AmunitionsActivity.class);
                startActivity(Ammunitionspage);
            }
        });

        HomeAttachments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AttachmentsPage = new Intent(HomePage.this, AttachmentsHomePage.class);
                startActivity(AttachmentsPage);
            }
        });

        HomeWeapons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent WeaponsPage = new Intent(HomePage.this, WeaponsHomePage.class);
                startActivity(WeaponsPage);
            }
        });
    }

    private void shareus() {
        Intent sharingIntent = new Intent(Intent.ACTION_SEND);

        //this is the app link
        final String appPackageName = getApplicationContext().getPackageName();
        String strAppLink = "";

        try {
            strAppLink = "https://play.google.com/store/apps/details?id=" + appPackageName;
        } catch (android.content.ActivityNotFoundException anfe) {
            strAppLink = "https://play.google.com/store/apps/details?id=" + appPackageName;
        }

        sharingIntent.setType("text/plain");
        String shareBody = strAppLink;
        String shareSubject = "Guide For PubgMobile";

        sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
        sharingIntent.putExtra(Intent.EXTRA_SUBJECT, shareSubject);

        startActivity(Intent.createChooser(sharingIntent, "Share Using"));
    }
}
