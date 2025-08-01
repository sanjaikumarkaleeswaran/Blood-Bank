package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class eaneg extends AppCompatActivity {
    private ListView listViewDonors;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eaneg);
        listViewDonors = findViewById(R.id.eaneglist);
        final String[] eaneg = {
                "Nizam deen		9087441234",
                "Harikrishnan		9080174384",
                "Yasin		9443902530",
                "Bharathi raja		8667055633",
                "Yogesh		6383218093",
                "sakthiyakumar		9894449901",
                "suresh		9500921884",
                "Faruk abdulla		9384394340",
                "praveenkumar		7845691662",
                "vignesh		8675387011",
                "Suresh		8883886748",
                "Tamilselvan		7200632024",
                "Prabhu		9150687532",
                "sri Manikandan		8637650085",
                "k Tamil selvan		9080158849",
                "Karthikeyan		9994494257",
                "arthanarieswaran		9688130533",
                "Bharathi raja		8667055633",
                "Nandha Kumar Arumugam		9688336700",
                "vignesh		9566791346",
                "Rahul Singh		6381581668",
                "Mahaboob Subhahani		9443321078",
                "Rahul Singh		7708088604"



        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, eaneg);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(eaneg.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
