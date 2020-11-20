package com.project.guidepubgmobile.Melle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.project.guidepubgmobile.R;

public class MelleActivity extends AppCompatActivity {

    int[] Images = {R.mipmap.machete, R.mipmap.crowbar, R.mipmap.sickle, R.mipmap.jumppunch,
            R.mipmap.fist, R.mipmap.melle};

    String[] Names = {"Machete", "Crowbar", "Sickle", "Jump and Punch", "Fist", "Pan"};

    String[] Damage = {"60", "60", "60", "38", "18", "80"};

    String[] Headshot = {"150", "90", "150", "-", "-", "200"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_melle);

        ListView listView = (ListView) findViewById(R.id.ListViewMelle);
        MelleActivity.CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("MELLE");

    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return Images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.customlayoutmelle, null);

            ImageView imageview = convertView.findViewById(R.id.melleimage);
            TextView textView_name = convertView.findViewById(R.id.Mellename);
            TextView textView_ThrowTime = convertView.findViewById(R.id.MelleDamagedetail);
            TextView textView_Weight = convertView.findViewById(R.id.Headshotdetail);

            imageview.setImageResource(Images[position]);
            textView_name.setText(Names[position]);
            textView_ThrowTime.setText(Damage[position]);
            textView_Weight.setText(Headshot[position]);

            return convertView;
        }
    }
}
