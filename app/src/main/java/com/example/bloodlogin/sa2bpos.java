package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class sa2bpos extends AppCompatActivity {
    private ListView listViewDonors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sa2bpos);
        listViewDonors = findViewById(R.id.sa2bpos);
        final String[] SELAM= {
                "M.Ramkumar		9944826944",
                "Prabu M		9003942673",
                "anpuselvan		+191761952",
                "Praveenraj S		9789615514",
                "Yasmin		6379478260",
                "Shanmugam.Mohan		9994757074",
                "arivalagan		7373471533"







        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, SELAM);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(sa2bpos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}