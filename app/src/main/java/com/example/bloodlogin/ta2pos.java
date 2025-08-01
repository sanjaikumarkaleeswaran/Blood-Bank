package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ta2pos extends AppCompatActivity {
    private ListView listViewDonors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ta2pos);
        listViewDonors = findViewById(R.id.ta2pos);
        final String[] capos = {
                "Kaleesh		9994743471",
                "Karchi Kumar		9698554575",
                "JAYAKUMAR GOPAL		9994905159",
                "SATISH H NAGDA		9486112490",
                "Gowthamkumar		9600569097",
                "Dr. Lathapriya Vellingiri		9750607883",
                "Sivashanmugam		9786272373"





        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, capos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(ta2pos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}