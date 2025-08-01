package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class saneg extends AppCompatActivity {
    private ListView listViewDonors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saneg);
        listViewDonors = findViewById(R.id.saneg);
        final String[] SELAM= {
                "TKS RAVI		9443280095",
                "Murugesan N		9245134300",
                "BHARATHI MUTHU		8220383435",
                "Lokesh. B		9791590903",
                "p.Thiyagarathinam		9843445525",
                "Manikandan N		8122112002",
                "Karthik		8220088943",
                "Meivel G		9629388336",
                "P.SAMPATH KUMAR		9994968989",
                "LOGU		7339669459",
                "Jaya seetharaman		7708884543",
                "Set G		8678980990",
                "Sathyadevi		6381355914",
                "Emran Ahmed		9566532112",
                "ajay Elavarasan		7339402048",
                "karthi		9894984899",
                "KS THIRUPATHI		9445558987",
                "issacdev		9442094328",
                "Tamilselvan		7667804299",
                "SABARI HARIHAREN G		8608252802",
                "karthick v		9884727803",
                "B.Soundappan		9486587972",
                "Dineshkumar		9443743806",
                "K. Sendrayan		7708815669",
                "GNANA AROCKIA DOMINIC		9442131944",
                "Sakthi		9994090340",
                "sabeen		8248895730",
                "A. Prasath		9597296331",
                "Dharshini		8190940200"






        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, SELAM);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(saneg.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}