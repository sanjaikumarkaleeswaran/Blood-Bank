package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class abposdonor extends AppCompatActivity {
    private ListView listViewDonors;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abposdonor);
        listViewDonors = findViewById(R.id.abposlist);


        final String[] a1bPositiveDonors = {
                "Vijay - 9790954376",
                "Yuvaraj - 8124291412",
                "Jeeva - 8056292339"

        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, a1bPositiveDonors);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(abposdonor.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}


