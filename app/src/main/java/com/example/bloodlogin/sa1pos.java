package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class sa1pos extends AppCompatActivity {
    private ListView listViewDonors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sa1po);
        listViewDonors = findViewById(R.id.sa1pos);
        final String[] SELAM= {
                "ARUNACHALAM		8778463617",
                "Umanesan.R		9865833783",
                "BASHA		8940912108",
                "Ashok Kumar		9952556745",
                "Sakthivel		9597438936",
                "ramya s		7373186386",
                "vijayakumar		9944445578",
                "ANEESH		9597343111",
                "Raghavan		7871066942",
                "G.Karthikeyan		9791575005",
                "Chandrasekar		9944006612",
                "Gugan.j		8148072499",
                "BHUVANESWARI B		9994529444",
                "Rajaram N R		9965454547",
                "RAMACHANDRAN J		9003882747",
                "Prasath D		9994708875",
                "Nirmalkumar		9003712552",
                "Sangeethakumar		7339121414",
                "SANDEEP SURESH		7708355551",
                "R.subramani		9677902575",
                "prakash		9894539941",
                "Balamurugan K		9976634334",
                "Shriabhinidhs		9443101635",
                "GOPALAKRISHNAN SURESH		9894030083",
                "PONNAIYAN.K		9025747736",
                "saravana kumar D		6369016994",
                "Nivasan		9344028654",
                "Kuppusamy Siddhan		8883113275",
                "sathishkumar		9791540407",
                "Santhosh.k		9629662930"






        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, SELAM);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(sa1pos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}