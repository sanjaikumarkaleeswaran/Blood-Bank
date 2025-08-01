package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class copos extends AppCompatActivity {
    private ListView listViewDonors;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_copos);
        listViewDonors = findViewById(R.id.copos);
        final String[] capos= {
                "suryakala		9443341538",
                "Raja.A		9655239233",
                "Rupasri K P		6381375574",
                "Venkatesh		9952401184",
                "K.Yuvaraj		7904206056",
                "Abdul jaleel		9123505135",
                "Kanish		6383796096",
                "arun kumar		9952253393",
                "Gowri shankar S		9677639930",
                "Srivishhnu		9597111105",
                "KARTHICK ESWARAN		9865599099",
                "kamalakannan KK		9842528107",
                "naren		9994254166",
                "dhanasekar		9092081826",
                "Vikram krishna		9600270251",
                "Ragupathi		8778040400",
                "sudhakar		8883359104",
                "m mohamed yaseen		9943344558",
                "premaramesh		9842269888",
                "Elango Selvaraj		8754122346",
                "SARAVANAKUMAR		9944152443",
                "sam		9894303903",
                "Jayakumar		7402880088",
                "Bharani Raj Selvaraju		9894996338",
                "VIGNESH ELANGO		8760063227",
                "Karthik Lakshman		6369951155",
                "mohan ramasamy		9952340683",
                "Sureshbabu		9442483398",
                "Karthikeyan		8884572154",
                "suriyakumar		9500908090"







        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, capos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(copos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}