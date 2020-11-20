package com.project.guidepubgmobile.Throwables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.project.guidepubgmobile.R;

public class ThrowablesActivity extends AppCompatActivity {

    int[] Images = {R.mipmap.apple, R.mipmap.grenade, R.mipmap.molotov, R.mipmap.snowball,
            R.mipmap.stun, R.mipmap.smoke};

    String[] Names = {"Apple", "Frag Grenade", "Molotive Cocktail", "Snowball", "Stun Grenade", "Smoke Grenade"};

    String[] ThrowTime = {"1.30s", "1.30s", "0.85s", "1.30s", "1.30s", "1.30s"};

    String[] Weight = {"1", "18", "1", "1", "12", "14"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_throwables);

        ListView listView = (ListView) findViewById(R.id.ListViewthrowables);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("THROWABLES");


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
            convertView = getLayoutInflater().inflate(R.layout.customlayoutthrowable, null);

            ImageView imageview = convertView.findViewById(R.id.moliimage);
            TextView textView_name = convertView.findViewById(R.id.moliname);
            TextView textView_ThrowTime = convertView.findViewById(R.id.throwtimedetail);
            TextView textView_Weight = convertView.findViewById(R.id.weightedetail);

            imageview.setImageResource(Images[position]);
            textView_name.setText(Names[position]);
            textView_ThrowTime.setText(ThrowTime[position]);
            textView_Weight.setText(Weight[position]);

            return convertView;
        }
    }
}
