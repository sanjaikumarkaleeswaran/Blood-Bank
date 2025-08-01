package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ebpos extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebpos);
        listViewDonors = findViewById(R.id.ebpos);
        final String[] ea2bneg= {
                "Pranish S		9080475071",
                "Narendran		9789503638",
                "ABBAS		6374875046",
                "KARTHISHWARAN		8778648081",
                "Mohamed Farooq		9443521642",
                "Viswanath V		9791301812",
                "ARUTSELVAM P		6380981600",
                "Vikas Kothari		8754213579",
                "Beermohaideen Rabick		9486949696",
                "Saravana Parthiban		8940138758",
                "Manickasundaram		9842751919",
                "R.ELAVARASAN		9842559259",
                "THAMARAIKANNAN		9842122056",
                "Maheshkumar.N		9965581888",
                "Prakasu		9976266583",
                "JEEVA		7200100888",
                "prem		9994577885",
                "SanthosH		9003340803",
                "sathya nishanth		9626576838",
                "Varatharaj		8675303526",
                "Arun.Y		9865903682",
                "Dhandabani.K		9600969449",
                "SUDHAKAR. S		8122534664",
                "Safiq		9994325784",
                "Arumugam		9095805591",
                "Nataraj		8760075101",
                "ranjith kumar .p		9750558885",
                "P shanmuga sindaram		9894425448",
                "Manojkumar		9894598448",
                "Siddharth Karthik		9632044011"



        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ea2bneg);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(ebpos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}