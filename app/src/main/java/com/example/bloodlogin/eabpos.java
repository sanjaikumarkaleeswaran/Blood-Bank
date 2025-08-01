package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class eabpos extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eabpos);
        listViewDonors = findViewById(R.id.eabpos);
        final String[] ea2bneg= {
                "S.Srinivasan		7358831015",
                "Satheeshkumar		9916147500",
                "LOGANATHAN.A		9788840471",
                "Sabarish		9025198049",
                "P.siranjeevi		9965164694",
                "Priyashanthi		9943444708",
                "vignesh		9750464872",
                "pradeep kumar		9952433063",
                "Naveenkumar		9095510949",
                "sabari rajan B		9790460717",
                "Shankar		9489671010",
                "MANIKANDAN A		9865512502",
                "Vanitha		9677801218",
                "SEKAR S		9976506210",
                "R Laxman		9787233474",
                "CHANDRAN BOOPATHI		8056812205",
                "venkatraman		9865919242",
                "K.GUNASEKARAN		9894064542",
                "Nishanth		6385201969",
                "lokanathan.c		9500788208",
                "Vishnu.C		9025319167",
                "Bharathi		9600097471",
                "GOKULPRASAN K P		9042448596",
                "G.Santhosh		6379220484",
                "K.GUNASEKARAN		9894064542",
                "sivakumar		9965681799",
                "T.Ravikumar		9944582241",
                "Tamilarasan		9486012354",
                "logesh		9500559467",
                "MURUGESH.P		9944941031"


        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ea2bneg);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(eabpos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}