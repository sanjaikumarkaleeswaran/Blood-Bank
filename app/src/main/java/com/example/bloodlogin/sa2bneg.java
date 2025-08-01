package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class sa2bneg extends AppCompatActivity {
    private ListView listViewDonors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sa2bneg);
        listViewDonors = findViewById(R.id.sa2pos);
        final String[] SELAM= {
                "Rosalin		8220559437",
                "Abdul Hameed		9943453433",
                "Hariprakash.J		9790455042",
                "umar		9087222153",
                "Aravind Balaji		6383244518",
                "Balamurugan		9894665288",
                "Yuvarajan		9092683270",
                "Yogeswari		7373911107"








        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, SELAM);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(sa2bneg.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}