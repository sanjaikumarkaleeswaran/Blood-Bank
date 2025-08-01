package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class sa1bpos extends AppCompatActivity {
    private ListView listViewDonors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sa1bpos);
        listViewDonors = findViewById(R.id.sa1bpos);
        final String[] SELAM= {
                "jitendra kumar		9443388776",
                "Karthick s		9994576924",
                "Gobi N		9790924006",
                "Jagatheesan		8637422194",
                "vengadesan		9500291220",
                "karthick alagu		8056403736",
                "rajkumar s		9976142614"





        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, SELAM);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(sa1bpos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}