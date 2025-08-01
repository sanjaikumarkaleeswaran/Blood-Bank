package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class sbpos extends AppCompatActivity {
    private ListView listViewDonors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbpos);
        listViewDonors = findViewById(R.id.sbpos);
        final String[] SELAM= {
                "Geetha		9786390447",
                "ganesh		9171623388",
                "Rajkumar. R		9865459034",
                "PONKUMARAN M		9361230675",
                "Sangeetha S		9994055554",
                "Pa .Deva		9095936103",
                "Lingeswaran AJ		8122078737",
                "Prakash		9865357106",
                "117b		9659623614",
                "PRAVEEN KUMAR C		9944720052",
                "Mayakkannan		9445818693",
                "Vignesh Saravanan		9965569185",
                "Arulanandhan		9751414905",
                "prabu		7339372175",
                "vijayasuresh		9443290116",
                "Keshore		9790468514",
                "Arshia Jameel		6384778688",
                "S.Sakthi Sathish		8903615771",
                "Dhinesh		8940207386",
                "Asifkhan		9629141991",
                "K.selvam		9677448655",
                "Manikandan A		8056587152",
                "panneer selvam		9842736142",
                "parthasrathy		8870669007",
                "arulraja		8825985046",
                "S.JAVEETH HUSSAIN		9976713770",
                "ShanmugaPriyan.A		9894782212",
                "Mohammed Arief Kannubasha		8344227524",
                "marimuthu krishnan		9629919910",
                "Syed ahamadullah		7397595690"

        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, SELAM);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(sbpos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}