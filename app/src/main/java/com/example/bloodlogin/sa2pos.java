package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class sa2pos extends AppCompatActivity {

    private ListView listViewDonors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sa2pos);  listViewDonors = findViewById(R.id.sa2pos);
        final String[] SELAM= {
                "Palanisamy.T		9994436386",
                "Padmavathi Devarajan		9786318312",
                "Arun		8760652003",
                "udayanan.s		9952514881",
                "Thamarai Selvan		8675527209",
                "V. Balusamy		9092021944"






        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, SELAM);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(sa2pos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}