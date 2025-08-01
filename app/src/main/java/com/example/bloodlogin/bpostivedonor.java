package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class bpostivedonor extends AppCompatActivity {
    private ListView listViewDonors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bpostivedonor);
        listViewDonors = findViewById(R.id.bposlist);
        final String[] a1bPositiveDonors = {
                "Sriram - 8056051072",
                "Ramesh - 9884727286",
                "Suresh - 8148916988",
                "Rajalingam - 9626696882",
                "Jagir - 9042670928",
                "Jawahar - 9600162581",
                "Siddiq - 9094666918",
                "Vignesh - 9884556995",
                "Vogneshgiri - 9043677660",
                "Prashanth - 9790755700",
               " Stalin -8124076813"

        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, a1bPositiveDonors);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(bpostivedonor.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
