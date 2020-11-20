package com.project.guidepubgmobile.Attachements.Magazines.ExtendeMagSRDMR;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Build;
import android.os.Bundle;

import com.project.guidepubgmobile.R;

import java.util.Objects;

public class oneQuickdrawExtendedActivity extends AppCompatActivity {

    Toolbar toollbar;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_quickdraw_extended);

        toollbar = findViewById(R.id.toolbar);

        setSupportActionBar(toollbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

//        toollbar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent gotohomepage = new Intent(oneQuickdrawExtendedActivity.this, MagazinesAttachmentsActivity.class);
//                startActivity(gotohomepage);
//                System.out.println("Button is preesed");
//            }
//        });

    }
}
