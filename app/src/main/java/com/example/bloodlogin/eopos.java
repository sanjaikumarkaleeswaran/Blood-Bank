package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class eopos extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eopos);
        listViewDonors = findViewById(R.id.ebpos);
        final String[] eopos= {
                "MANIKANDAN		9750991991",
                "Mathan Nivash		9942542115",
                "Deepankumar		9578553699",
                "m.anbarasu		7708706230",
                "Arusullah Ars		9385881224",
                "Ashok Spl		9942162012"




        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, eopos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(eopos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
