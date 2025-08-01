package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ca1pos extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ca1pos);   listViewDonors = findViewById(R.id.ca1pos);
        final String[] capos= {
                "K Rajesh		9994158182",
                "Ajith		8870555886",
                "Jayanthi R		8883159162",
                "Prabhagaran S		9790008443",
                "arunprakash		8489249990",
                "Ashok Kumar		9944446980",
                "A.SARAVANAKUMAR		9976162004",
                "Prasanth kumar R		9344151906",
                "Satheeshkrishnan		9003533546",
                "MARIMUTHU R		9095440031",
                "Velumani Selvam		8072055164",
                "SV. Subramanian		9600301402",
                "Raja Balasubramaniam		9944631163",
                "Arivazhagan		7010795942",
                "Parthiban		9629650076",
                "Gowtham Saminathan		9095759590",
                "VEDHAVIYAS		9698080637",
                "RN Saravanan		9894881363",
                "Chandrasekar		9944589660",
                "VM.Mahendran		9952134500",
                "MAnoranjitham		9751188812",
                "Jagathies D.		9790693173",
                "Sivakumar R		8940561445",
                "sampath		9894056562",
                "vinothkumar		8072939362",
                "Anandaraj		9524237766",
                "R RAGHUPATHY		9445955222",
                "Ramprakash Lakshminathan		6369577796",
                "kathirvel		9842514165",
                "Arul Kumar		9043728582"




        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, capos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(ca1pos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}