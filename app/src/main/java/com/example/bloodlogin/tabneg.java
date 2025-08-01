package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class tabneg extends AppCompatActivity {
    private ListView listViewDonors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabneg);
        listViewDonors = findViewById(R.id.tabneg);
        final String[] capos = {

                "Prem Kumar		9940942821",
                "Manikandan Nagaraj		9500365026",
                "gunaseakaranv		9597938349",
                "Karthi kn		9043200697",
                "Chitra.N		9442373650",
                "sankar		9786101687",
                "Natesan		6380615171",
                "Nagaraj.. M.		7708999888",
         "CHARLETTE		9442342929",
        "Jose		9843732382",
        "Sivaneshwaran		6380728237",
        "Gokul		9677721057",
        "RAGHURAMAN		9865122357",
        "KUMARAN		7667567820",
        "Sasi kumar		9698144753",
        "chandramohan		9944440494",
        "Mkarthii		8328539495"



        };



        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, capos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(tabneg.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}