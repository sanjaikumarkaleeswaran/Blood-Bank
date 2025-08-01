package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ea1bpos extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ea1bpos);
        listViewDonors = findViewById(R.id.ea1bpos);
        final String[] a1bPositiveDonors = {
               "Ramesh Arichandran		9698097015",
                "NATRAYAN.G		9842095240",
                "Vijayakumar		7305256282",
                "mohanbabu		6380358604",
                "kumar mech		7010554166",
                "Mohandas		8610332067",
                "S. Vivek		9944043022",
                "V GANESHKUMAR		9443333899",
                "arvindkannan		8012192954",
                "Karthick Devaraj		9952864955",
                "suseelaRamaswamy		9952311131",
                "Sivanesan		9842323896",
                "Durai murugan		9363045086",
                "S.KUMARESAN		9965557799",
                "Shanmugasubramaniam KS		6383185885",
                "VINOTHKUMAR		9597558099",
                "Madhan Kumar S S		9524154490",
                "Dhamuprakash M		9942078195",
                "Syed jfa		6380301419",
                "v.t.gokkul		9843832208",
                "Dinesh prabu		7373183940",
                "GNANA SEKARAN A		9047024930",
                "Ln.M.P.SIVARAJ		9942007000",
                "Dharaneesh		9865051718",
                "Lokesh. S. K.		8681901644",
                "Gobinath.A		9791991898",
                "SriramSridhar		9751594902",
                "Harish		9566032312",
                "K.poornachandrika		8807320889",
                "ASHOKKUMAR		9791352143"

        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, a1bPositiveDonors);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(ea1bpos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}