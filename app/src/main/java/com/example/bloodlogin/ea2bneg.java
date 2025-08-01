package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ea2bneg extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ea2bneg);
        listViewDonors = findViewById(R.id.ea2bneg);
        final String[] ea2bneg= {
                "Sowmiya		9843793300",
                "gowtham		8144233533",
                "yokesh		8608778391",
                "shanmugapriyan		7639770266",
                "sathish selvaraj		9942079489",
                "T. PremKumar		9944320633"

        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ea2bneg);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(ea2bneg.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}