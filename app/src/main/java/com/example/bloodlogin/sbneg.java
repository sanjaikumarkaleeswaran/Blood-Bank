package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class sbneg extends AppCompatActivity {
    private ListView listViewDonors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbneg);
        listViewDonors = findViewById(R.id.sbneg);
        final String[] SELAM= {
                "Divya		9789314370",
                "Mirithula		9600193545",
                "A.RAJA		9380880084",
                "nagendranmohanraj		9543999359",
                "Saleem		9655525153",
                "R Ramesh		8300051602",
                "Afrith		9994580313",
                "Ramkumar		9894525926",
                "Manikandan Balu		8438581387"



        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, SELAM);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(sbneg.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}