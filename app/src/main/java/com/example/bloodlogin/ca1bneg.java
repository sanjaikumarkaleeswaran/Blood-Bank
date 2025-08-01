package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ca1bneg extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ca1bneg);
        listViewDonors = findViewById(R.id.ca1bneg);
        final String[] capos= {
               "Hari Prasath		9994882748",
                "soundrapadiyan		8754976091",
                "Monica.R		9944269931",
                "Tharangini		8825996419",
                "Radhakrishnan S		9894340943",
                "RAJA		9842410995",
                "Ariff Ahamed		9080191525",
                "Saranraj		9092235545",
                "Prabhu kumar		962951123",
                "guru		9944078716",
                "Arnalt stalin		9994161256",
                "Arunkumar thangavel		8778400252",
                "Kumar .P		9894170097",
                "Krishnamoorthy		9790011618",
                "Sivakumar		9655057264",
                "HEMANTH		7708316146",
                "Rajaraman B		9790011468",
                "BABU SARAVANAN PRAKASH SJ		9894880700",
                "Ragavan sundaramurthi		9894702224",
                "Yuvaraj M		9962007997",
                "Ramesh krishnan		8754211852",
                "M.Shaik Abdul Kader		9965976088",
                "v.rajasekaran		9994055738"





        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, capos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(ca1bneg.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}