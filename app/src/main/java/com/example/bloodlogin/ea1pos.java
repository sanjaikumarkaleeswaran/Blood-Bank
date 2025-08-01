package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ea1pos extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ea1pos);
        listViewDonors = findViewById(R.id.ea1pos);
        final String[] ea1Pos = {
                "Saravanakumar		9894026670",
                "K.k.b.saravanakumar		8012552101",
                "Dhanasekaran		9994901856",
                "satheeshwaran		7402083345",
                "PRABAKARAN S		7904640937",
                "Vincent		7904740002",
                "Hariprasath		7010997611",
                "sathesh		9965790563",
                "Muqthar		9500977806",
                "Suresh Kumar		9578469874",
                "K.K.Sureshkumar		9842765456",
                "govindaraj		9566785452",
                "ThangaRaj S		9043644036",
                "aravind.v		7639927489",
                "karthik		9524449365",
                "DHAMAYANTHI.K		7639411055",
                "GUNASEELAN.R		9786665100",
                "vgobi nath		7598614320",
                "suresh kumar		9994277548",
                "senthil Kumar D		9095336120",
                "Dinesh P S		9994008080",
                "Gokul		9445980808",
                "Praveenkumar		8680863393",
                "Mayilsamy		9750822808",
                "prakash		9965164940",
                "Jeeva krishnamoorthy		9488245071",
                "Gokulakrishnan.G.A		8870456682",
                "sathish S		9944811227",
                "JAGANATHAN(A1+)		9442955550",
                "Prabhu		9442884414"




        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ea1Pos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(ea1pos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
