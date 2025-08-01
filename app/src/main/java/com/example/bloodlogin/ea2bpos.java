package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ea2bpos extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ea2bpos);
        listViewDonors = findViewById(R.id.ea2bpos);
        final String[] ea2pos= {
                "Dharanidharan		9025197001",
                "Shanmugam mohan		9994757074",
                "arul		8610343509",
                "MANIKANDAN.E		9150662005",
                "Jahan		8526576211",
                "Vetrivel Chinnasamy		9591477565",
                "Karthikeyan		8870189878",
                "Karuppasamy		9445984030",
                "K.Sathish Kumar		8012148007",
                "Sakthi		7904928112",
                "Vijay Kumar		9688188838",
                "Arun		8344733787",
                "JAGADEESAN.S		9944994403",
                "Arvind adhithya		9698695797",
                "Mohan Chinnusamy		9976695286",
                "GIRIDHARAN R		9894190269",
                "Ajithkumar G K		8903890699",
                "Tamilarasan		8015018881",
                "Gnanasundari		6382744686",
                "Karthikeyan.S		9842598765",
                "Praveen A S		8344331553",
                "K.Tamilselvan		9843834483",
                "GOPALAKRISHNAN		9443846121",
                "arunvijayakumar	9994129222",
                "JAWAHARBABU R		7092093398",
                "Prasanth		9677910269",
                "selva		8870709986",
                "NISHANTH VP		9789779677",
                "Gnanasundari		8610747751",
                "S A Balamuruga		9965663888"
        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ea2pos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(ea2bpos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
