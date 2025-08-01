package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class cbneg extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbneg);
        listViewDonors = findViewById(R.id.cbneg);
        final String[] capos= {
                "Sangeeth kumar		9952181766",
                "Na. Srividhya		9894635103",
                "Sathish kumar		9677712369",
                "Nadhiya banu		9597685771",
                "siva		9597466207",
                "Sriram		7010539733",
                "Murugan		9442269929",
        "antony matchado		9443041367",
        "Das		8610992709",
        "Narshilal		9791903406",
        "s.kalaivanan		8489159676",
        "Akash A		8973279966",
        "Manikandan. N		9524779218",
        "amanulla		9629024241",
        "duraimurugan		9789501684",
        "vadivel		6383687349",
        "Vijay Prabhakaran		7395829998",
        "Raju		9994976186",
        "Thamil Selvan		9364275151",
        "Azarudeen .a		9940985657",
        "Chithirai selvam .k		8668063322",
        "tamilselvan		7639341246",
        "Nithyanand		9840337468",
        "Sukeertiram G S		6380766275",
        "Kanagaraj		9080657034",
        "shinto yesudas		9566814666",
        "vijay goutham		9788696644",
        "GANESH KUMAR R		9942330128",
        "siva Karthik		9025088849"






        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, capos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(cbneg.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}