package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ea2pos extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ea2pos);
        listViewDonors = findViewById(R.id.ea2pos);
        final String[] ea2pos= {
                "Navin kumar		7418478369",
                "Rathna		7708727922",
                "Sathish		7010845051",
                "Santhiya subramaniyam		7010128635",
                "Vijayakumar.M.S		9944040388",
                "radhakrishnan		8344030006",
                "M.Madhushree		8883623757",
                "sivakumar		9944072777",
                "solaigoundan		9524090937",
                "Shakulhameed M		9942751119",
                "c. arunkumar		9940877474"


        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ea2pos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(ea2pos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}