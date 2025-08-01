package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class oposdonor extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oposdonor);
        listViewDonors = findViewById(R.id.oposlist);
        final String[] oposDonors = {
                "Anbu - 8124499401",
                "Saffi - 9176418321",
                "Mani - 7401535415",
                "PRABHU - 9884641396",
                "Sundar - 9941418736",
                "Aravind - 9176980878",
                "Manikandan - 9791097653",
                "C. Prathap - 9940521093",
                "Isaianand - 7845548466",
                "S. Thilak - 861810723",
                "Anbumani - 9566001676",
                "Mohan - 9940639557",
                "A. Inba Kumar - 9840301747",
                "Vazir - 8754034986",
                "Balakrish - 9047904837",
                "Abrar - 9043651613",
                "Keerthana - 9962915416",
                "Ramkumar - 8148886069",
                "Rohan - 9578894337",
                "Mohamed Sameer - 8754875703",
                "Siva - 8667413984"

        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, oposDonors);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(oposdonor.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

