package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class taneg extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taneg);
        listViewDonors = findViewById(R.id.taneg);
        final String[] capos= {
                "k.selvaraj		9842345410",
                "Karthikeyan		9384581278",
                "Muthukumar		9788827744",
                "S.Nagaraj		9944505901",
                "elango poovaragan		9171884688",
                "Karthickraja		9677641813",
                "Muthukrishnan		8489372471",
                "Manikandan		9788933664",
                "anbudeepam		8695485950",
                "SIVAKUMARAN		7871051337",
                "Subin		8190031845",
                "Arulmurugan		8870533666",
                "P KANDASAMY		9486968647",
                "N.Nethaji		9524693926",
                "Pradeep Gowri		8883037004",
                "PRAKASH.N		9942071818",
                "arifullakhan		9042971009",
                "Senthilnathan		9894303533",
                "Manivannan		9788341770",
                "maheswaran		8610948848",
                "sabareesh		9942795488",
                "Ranjith Kumar		9159885570",
                "Anitha		9943335610"




        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, capos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(taneg.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}