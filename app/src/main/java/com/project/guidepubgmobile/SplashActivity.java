package com.project.guidepubgmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 5000;

    //Variable
    Animation topanime, bottomanime;
    ImageView logo;
    TextView futsalname, slogan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        //ANimation
        topanime = AnimationUtils.loadAnimation(this, R.anim.topanimation);
        bottomanime = AnimationUtils.loadAnimation(this, R.anim.bottomanimation);

        logo = (ImageView) findViewById(R.id.logo);
        futsalname = (TextView) findViewById(R.id.futsalname);
//        slogan = (TextView) findViewById(R.id.futsalslogan);


        logo.setAnimation(topanime);
        futsalname.setAnimation(bottomanime);
//        slogan.setAnimation(bottomanime);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, HomePage.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN);

    }
}
