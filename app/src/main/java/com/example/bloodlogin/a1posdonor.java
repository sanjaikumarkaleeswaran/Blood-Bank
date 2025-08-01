package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class a1posdonor extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1posdonor);
        listViewDonors = findViewById(R.id.a1plist);

        // Array of donors for A+ blood type
        final String[] aPositiveDonors = {
                "Raja - 9789865312",
                "Manikandan - 9566420317",
                "V.Karthick - 9578828854",
                "Narendran - 9500148984",
                "Mohamed Halidh - 8807980583",
                "Ishu - 9962852021",
                "E. Arun Kumar - 9843259966"
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
                Toast.makeText(a1posdonor.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

