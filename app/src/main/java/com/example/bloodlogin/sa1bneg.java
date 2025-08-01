package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class sa1bneg extends AppCompatActivity {
    private ListView listViewDonors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sa1bneg);        listViewDonors = findViewById(R.id.sa1bneg);
        final String[] SELAM= {

                "Sivabupathy		8870635623",
                "Obulisivananthan		8903746195",
                "balaji		9965822092",
                "logumuniraj.R		9080612828",
                "prasanna		9894084531",
                "Thirupathi G		9791211478",
                "Jayavadivel B		7708086358"






        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, SELAM);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(sa1bneg.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}