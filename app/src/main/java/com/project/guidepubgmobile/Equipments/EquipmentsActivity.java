package com.project.guidepubgmobile.Equipments;

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

public class EquipmentsActivity extends AppCompatActivity {

    int[] Images = {R.mipmap.backone, R.mipmap.backtwo, R.mipmap.backthree, R.mipmap.helmone,
            R.mipmap.helmtwo, R.mipmap.helmthree, R.mipmap.levelonevest,
            R.mipmap.leveltwovest, R.mipmap.levelthreevest};

    String[] EquipmentNames = {"BackPack (Level 1)", "BackPack (Level 2)", "BackPack (Level 3)", "Motorcycle Helmet (Level 1)",
            "Military Helmet (Level 2)", "Spetsnaz Helmet (Level 3)", "Police Vest (Level 1)", "Police Vest (Level 2)",
            "Military Vest (Level 3)"};

    String[] CapacityExtension = {"+170", "+220", "+270", "--", "--", "--", "+50", "+50", "+50"};

    String[] DamageReduction = {"--", "--", "--", "30%", "40%", "55%", "30%", "40%", "55%"};

    String[] Durability = {"--", "--", "--", "80", "150", "230", "200", "220", "250"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipments);


        ListView listView = (ListView) findViewById(R.id.ListViewEquipment);
        EquipmentsActivity.CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("Equipments");

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
            convertView = getLayoutInflater().inflate(R.layout.customlayoutequipments, null);

            ImageView imageview = convertView.findViewById(R.id.Equipmentimage);
            TextView textView_EqupimentName = convertView.findViewById(R.id.EquipmentName);
            TextView textView_CapacityExtension = convertView.findViewById(R.id.EquipmenCapacityDetail);
            TextView textView_DamageReduction = convertView.findViewById(R.id.EquipmenDamgeReductiondetail);
            TextView textView_Durability = convertView.findViewById(R.id.EquipmenDurabilitydetail);


            imageview.setImageResource(Images[position]);
            textView_EqupimentName.setText(EquipmentNames[position]);
            textView_CapacityExtension.setText(CapacityExtension[position]);
            textView_DamageReduction.setText(DamageReduction[position]);
            textView_Durability.setText(Durability[position]);

            return convertView;
        }
    }
}
