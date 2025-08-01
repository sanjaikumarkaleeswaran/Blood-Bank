package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class tbneg extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tbneg);
        listViewDonors = findViewById(R.id.tbneg);
        final String[] capos = {

                "SARAVANA PRAKASH.T		7418813134",
                "Shanmugavel		9750004331",
                "CSubramanian		9944662616",
                "m.BALAKUMAR		7502263322",
                "Varatharaj		9942626461",
                "RATHINA PRAKASH		9842465612",
                "kannannatarajan		9952188475",
                "prasanth		9994070783",
                "J.Ramkumar		9865554510",
                "kumaresh		9659299972",
                "S.Manikandan		9788933664",
                "Syed Shakir Ansari		9367788166",
                "sathya		9944903752",
                "Ashok kumar		9788855143",
                "Gopal Siva		9894228625",
                "karthikmohanraj		9677228957",
                "Nivetha.S		9443481009",
                "senthil nathan		9976239999",
                "KIRAN SAKTHI		6382124923",
                "S.S.Raja		9092166788",
                "Kruthika M		0904308040",
                "Venkatachalapathi K		9489481877",
                "ASHOKKUMAR		9994686119",
                "Vasanth SD		7598220948",
                "Karthik velu		9842921347",
                "S.kondappan		9790236025",
                "Santhosh SP		8098463009",
                "G MANIKANDAN		8870234407",
                "dinesh		9566924907",
                "senthilkumar		9750270815"





        };



        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, capos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(tbneg.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}