package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class tabpos extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabpos);
        listViewDonors = findViewById(R.id.tabpos);
        final String[] capos = {

                "Manikandan		9442571529",
                "Krishnakumar		9790027333",
                "Ramesh Palanisamy		9551416621",
                "A.THIRUMANIKANDAN		7845786030",
                "Mohamed irshat		9500623708",
                "Ragul ram		0720042714",
                "Kumar		8807534551",
                "Sabapathi M		9488346194",
                "Rabin Sekar		8903901925",
                "NK SIVAPRAVIN		9566866239",
                "Barath Sakthi		8778809386",
                "MEIYARASAN		9489184373",
                "Vinothkumar		8015552440",
                "abdul kareem		7871293871",
                "Ragiswar k		9994953136",
                "Vincent		9655639993",
                "ARULMURUGAN		8124495647",
                "SUGIRTHANANTHAN. S		8098989975",
                "rajesh		8098072804",
                "SATHISHKUMAR		9894208429",
                "saravana kumar		9578515738",
                "sathiesh Kumar		9003340504",
                "Ponraj		7639978107",
                "vivek		9688608633",
                "Aravindh		8760039760",
                "Jayaprakash		9597368164",
                "Praveen Kumar		9789467261",
                "G.Pradeep		7358866399",
                "vijayakumar		9788656481",
                "sunilkumar		8883334141"


        };



        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, capos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(tabpos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}