package com.example.bloodlogin;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class aPosdonor extends AppCompatActivity {

    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aposdonor);

        listViewDonors = findViewById(R.id.list);

        // Array of donors for A+ blood type
        final String[] aPositiveDonors = {
                "Murali - 7299399392",
                "Perumal Kalidass - 9943948951",
                "Yuvaraj - 8124291412",
                "Manikandan - 9566420317",
                "Senthilkumar - 9962688252",
                "Praveen Kumar - 9094314313",
                "Mohanraj - 9444464789",
                "Syed - 9551457239",
                "M. Jagadeesanvb - 7845662500",
                "C. Rajkumar - 9790844373",
                "Sarath - 9551113240",
                "Dinesh - 8122288878",
                "Irfan - 9940980181",
                "Arunkumar - 9787736678",
                "N.R. Pravin Raja - 8015601612",
                "Rohan - 9578894337"
        };

        // Create an ArrayAdapter for the donors
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, aPositiveDonors);

        // Apply the adapter to the ListView
        listViewDonors.setAdapter(adapter);

        // Set item click listener for the ListView
        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Show the donor's details in a toast message
                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(aPosdonor.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
