package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class eabneg extends AppCompatActivity {
    private ListView listViewDonors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eabneg);
        listViewDonors = findViewById(R.id.eabneg);
        final String[] ea2bneg= {
                "suriya kanth		9965531591",
                "A.DAVID		9443071700",
                "SHANMUGHARAJ NARAYANAN		9894449896",
                "Kannan		8072102977",
                "manikandan		9750468621",
                "Raja		9750548205",
                "Suraj		9972524802",
                "Ragupathi C		9659526591",
                "Kalaiselvi		9442754179",
                "T.silambarasan		8807783294",
                "Yesudas		9384588128"



        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ea2bneg);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(eabneg.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}