package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ca2bneg extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ca2bneg); listViewDonors = findViewById(R.id.ca2bneg);
        final String[] capos= {
                "Balaji		6384153522",
                "rangaraj		9942361610",
                "K STALIN EDWARD		9994253830",
                "Subbalakshmi		9629624513",
                "Benny		9945113353",
                "Parthiban		9894884484",
                "Subbalakshmi		9944478938",
                "Navaneetha Krishnan		9843670096",
                "s.saravana sundaram		9894756463",
                "Senthil kumar		9965553205",
                "Mohan		7904484441",
                "M.S.Karthikeyan		9842424747",
                "Prabhakaran Balamani		8870167136",
                "Balaji Ramachandran		9500057249",
                "Nilas Alexander		9688343582"







        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, capos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(ca2bneg.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}