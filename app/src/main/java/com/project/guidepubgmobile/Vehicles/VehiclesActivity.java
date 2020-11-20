package com.project.guidepubgmobile.Vehicles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.project.guidepubgmobile.R;

public class VehiclesActivity extends AppCompatActivity {

    int[] Images = {R.mipmap.buggy, R.mipmap.motorcycle, R.mipmap.munabhai, R.mipmap.miradoclose, R.mipmap.dacia,
            R.mipmap.uaz, R.mipmap.zima, R.mipmap.minibus, R.mipmap.pickup, R.mipmap.tukshai, R.mipmap.brdm,
            R.mipmap.pg, R.mipmap.aquarail, R.mipmap.rony, R.mipmap.scooter
    };

    String[] Names = {"Buggy", "Motorcycle", "Motorcycle Sidecar", "Mirado", "Dacia", "UAZ", "Zima", "Minibus", "Pickup", "Tukshai",
            "BRDM", "PG-117", "Aquarail", "Rony", "Scooter"};

    String[] Health = {"1540", "1025", "1025", "2000", "1820", "1820", "1820", "1680", "1820", "1000", "2000", "1520", "N/A", "2400",
            "1025"};

    String[] MaximumSpeed = {"112km/h", "152km/h", "148km/h", "152km/h", "110km/h", "130km/h", "130km/h", "103km/h", "111km/h",
            "69km/h", "105km/h", "90km/h", "90km/h", "110km/h", "91km/h"

    };

    String[] TotalSeats = {"2", "2", "3", "4", "4", "4", "4", "4", "4", "3", "4", "4", "4", "4", "2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicles);

        ListView listView = (ListView) findViewById(R.id.ListViewVehicles);
        VehiclesActivity.CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("Vehicles");

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
            convertView = getLayoutInflater().inflate(R.layout.customlayoutvehicles, null);

            ImageView imageview = convertView.findViewById(R.id.Vehicleimage);
            TextView textView_name = convertView.findViewById(R.id.VehicleName);
            TextView textView_Health = convertView.findViewById(R.id.VehicleHealthDetail);
            TextView textView_MaximumSpeed = convertView.findViewById(R.id.VehicleMaximumSpeeddetail);
            TextView textView_TotalSeats = convertView.findViewById(R.id.VehicleTotalSeatsdetail);

            imageview.setImageResource(Images[position]);
            textView_name.setText(Names[position]);
            textView_Health.setText(Health[position]);
            textView_MaximumSpeed.setText(MaximumSpeed[position]);
            textView_TotalSeats.setText(TotalSeats[position]);

            return convertView;
        }
    }


}
