package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ca1bpos extends AppCompatActivity {
    private ListView listViewDonors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ca1bpos);
        listViewDonors = findViewById(R.id.ca1bpos);
        final String[] capos= {
                "sekar		9994232840",
                "Maria Avinash		9629590602",
                "Praveena		8124493207",
                "BALAKUMAR.K		9894655733",
                "DEV		9894170890",
                "SASI NANDHA GOPAL T		9003631135",
                "Arunachalam y		9585617645",
                "arvind		9943241040",
                "K.Ramesh		9944946680",
                "kumar		9655008638",
                "VINOTHKUMAR		9003443572",
                "R.SHANTHI		8870270644",
                "Sureshkumar s		9443822062",
                "sathish		9750143963",
                "Akash Kumar		9790475137",
                "Saravanan G		9600900352",
                "Rathnavel Ponnuswami		9894090456",
                "A Haripriya		7094806077",
                "Dr.m.Silambarasan		9042903550",
                "Prabhuselvaa.S		9659849745",
                "murali ganesh		9443067568",
                "MURUGAN		9842270870",
                "ashok samtani		7667133330",
                "Deveak MJ		8667492051",
                "R.Ramesh krishnan		9500747511",
                "s.ramesh		9597972995",
                "N.NISHAR KHAN		9042200288",
                "Saravanakumar R		9894009987",
                "balachandran		9790164607",
                "RAJ KAPHUR		9994397854"






        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, capos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(ca1bpos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
