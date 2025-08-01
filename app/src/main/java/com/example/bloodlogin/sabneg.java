package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class sabneg extends AppCompatActivity {
    private ListView listViewDonors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabneg);
        listViewDonors = findViewById(R.id.sabneg);
        final String[] SELAM= {
                "SAINUL ABID		9047577527",
                "Divakar		8489559771",
                "bharathiraja		8056748759",
                "MOHAN RAJ		9025530937",
                "Arun Kishore		8748002108",
                "V.Manikandan		9944855729",
                "Rajkumar		9323164103",
                "Divya		9789314370",
                "Mirithula		9600193545",
                "A.RAJA		9380880084",
                "nagendranmohanraj		9543999359",
                "Saleem		9655525153",
                "R Ramesh		8300051602",
                "Afrith		9994580313",
                "Ramkumar		9894525926",
                "Manikandan Balu		8438581387",
                "R. Jayaprakash		9629273698",
                "divya		7736759767",
                "kathirvel.m		8012804808",
                "sabarinathan		6381578215",
                "A.G.GNANAPRAKASH		9842732067",
                "prasanna		8925216461",
                "Nandhakumar N		7667167172",
                "Riyaz A		9585761794",
                "sadishkumar		9597952669",
                "Suriyan		8754174111",
                "Aadharshini A		8825595107",
                "ravikumar		9677735189",
                "Murugesan		9962574446",
                "A. Sakthivel		6379525850"



        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, SELAM);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(sabneg.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}