package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class topos extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topos);
        listViewDonors = findViewById(R.id.topos);
        final String[] capos = {

                "SHIJU. S		9488812941",
                "P. Sasikumar		9894628723",
                "Jayalakshmi		9750006051",
                "Mohan kumar		9894075091",
                "Senthilkumar SVN		9585087744",
                "sivanesh		9842212839",
                "gobi		9952104511",
                "prakash		7871572323",
                "Karvendhan M		9659533904",
                "Girivasan		8072434500",
                "JEEVANANTHAM		9952309140",
                "Gopalakrishnan m		9047599183",
                "Vijai T		8870203892",
                "Senthil Kumar		9840034035",
                "Shona		9865261618",
                "D.KUMAR		9629988863",
                "Johnson		8072069671",
                "Karthikeyan subramaniam		9842220192",
                "ELAVARASAN M		9360080961",
                "AUGWIN DEEPAK		9865188848",
                "Jeevananda		8122246572",
                "S.ALAUDEEN		9150383039",
                "Shanmuga Prabu R		9600588445",
                "Balakumar		9698484302",
                "D.HARI KRISHNAN		8825968321",
                "Suresh		9944234725",
                "satheshkumar		9965006523",
                "Sahulameed K		9952457072",
                "SELVA KUMAR		7708381444",
                "sakthi vel		7639945381"







        };



        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, capos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(topos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}