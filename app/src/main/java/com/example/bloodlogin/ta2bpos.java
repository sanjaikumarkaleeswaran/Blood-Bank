package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ta2bpos extends AppCompatActivity {
    private ListView listViewDonors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ta2bpos);
        listViewDonors = findViewById(R.id.ta2bpos);
        final String[] capos = {
                "p.senthilkumar		9865941562",
                "Bharath		9095465621",
                "Sathishkumar S		7708990096",
                "ajwin		6384188607",
                "SAKTHI		6379979676",
                "Chitra		9043125273",
                "Santhana Krishnan		9578681609",
                "anand		9842822409",
                "Govindarajulu		9976014455",
                "SATHIS KUMAR		9787742348",
                "PAVITHRAN		9514459148",
                "Vignesh Waran		6374515937",
                "shanavas		9150198485",
                "Bharath kumar		9095489321"
        };



        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, capos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(ta2bpos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}