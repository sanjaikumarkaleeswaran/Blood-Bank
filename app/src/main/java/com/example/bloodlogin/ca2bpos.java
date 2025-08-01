package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ca2bpos extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ca2bpos); listViewDonors = findViewById(R.id.ca2bpos);
        final String[] capos= {
                "Mohammed Bilal A		9942842428",
                "Raghuram S		9500913434",
                "VASUDEVAN NARESHKUMAR		9944475959",
                "Rajalakshmi		9080465400",
                "Boopathy M		9940849587",
                "Surendar Shanthi		9790974252",
                "CHERAN MU TAMIZHARASAN		9944212479",
                "Aravinth		9886889079",
                "Magesh Loganathan		9629435614",
                "sree saravanan		9787080950",
                "Sudesh Sivakumar		9361376009",
                "umabharathy		9842894414",
                "Ravi		9092730263",
                "Saravanan		9791593284",
                "ALBIN THOMAS C		8122709036",
                "Sudesh Sivakumar		9361376009",
                "Solomon David		9443095896",
                "Bala Nagesh		9884268933",
                "KANAKARASU P		9894949999",
                "Shyam		8807239942",
                "saravanakumar.r		9942543557",
                "sathishkumaar.m@gmail.com		9994609860",
        "S.RAJ KUMAR		8098470878",
        "Shanmugappriya		9786214300",
        "Kalimuthu s		9597602123",
        "sasidharan		9976254733",
        "Venkatesh.S		9600511879",
        "JEGANATHAN M		9791830945",
        "T.K.ShivaShanmugam,		9841620166",
        "charan		9787243168	"






        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, capos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(ca2bpos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}