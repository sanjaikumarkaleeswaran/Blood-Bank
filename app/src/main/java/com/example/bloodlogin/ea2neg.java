package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ea2neg extends AppCompatActivity {
    private ListView listViewDonors;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ea2neg);
        listViewDonors = findViewById(R.id.ea2neg);
        final String[] ea2pos= {
                "Manikandan		9865109990",
                "P.Dhayanandan		9790474046",
                "Ramesh.N.		9842748484",
                "Sheiknavith		9843551393",
                "Sugesh rasu		9715079488",
                "O.G.PALANISAMY		9942199931",
                "M.Naveen Prasath		9952143698",
                "manikandan.p		9865109990"



        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ea2pos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(ea2neg.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}