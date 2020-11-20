package com.project.guidepubgmobile.Consumables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;



import com.project.guidepubgmobile.Melle.MelleActivity;
import com.project.guidepubgmobile.R;

public class ConsumbalesActivity extends AppCompatActivity {

    int[] Images = {R.mipmap.adrenalinesyringes, R.mipmap.bandages, R.mipmap.energydrinks, R.mipmap.firstaidkits,
            R.mipmap.painkillers, R.mipmap.consumbales};
    String[] Names = {"Adrenaline Syringes", "Bandages", "Energy Drinks", "First Aid Kits", "Painkillers",
            "Medical Kits or Med Kits"};
    String[] Capacity = {"20", "2", "4", "10", "10", "20"};
    String[] Healpoints = {"86 Health Points", "10 Health Points", "40 Health Points", "75 Health Points",
            "60 Health Points", "100 Health Points"};
    String[] casttime = {"6 seconds", "4 seconds", "4 seconds", "6 seconds", "6 seconds", "8 seconds"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumbales);


        ListView listView = (ListView) findViewById(R.id.ListViewConsumbales);
        ConsumbalesActivity.CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("Consumables");

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
            convertView = getLayoutInflater().inflate(R.layout.customlayoutconsumbales, null);

            ImageView imageview = convertView.findViewById(R.id.Consumbalesimage);
            TextView textView_name = convertView.findViewById(R.id.ConsumablesName);
            TextView textView_Capacity = convertView.findViewById(R.id.ConsumbalesCapacityDetail);
            TextView textView_Healpoints = convertView.findViewById(R.id.ConsumbalesHealPointsdetail);
            TextView textView_casttime = convertView.findViewById(R.id.consumbalecasttimedetail);

            imageview.setImageResource(Images[position]);
            textView_name.setText(Names[position]);
            textView_Capacity.setText(Capacity[position]);
            textView_Healpoints.setText(Healpoints[position]);
            textView_casttime.setText(casttime[position]);

            return convertView;
        }
    }

}
