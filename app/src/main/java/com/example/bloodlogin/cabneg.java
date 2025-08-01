package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class cabneg extends AppCompatActivity {
    private ListView listViewDonors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cabneg);
        listViewDonors = findViewById(R.id.ca2bneg);
        final String[] capos= {
                "NASEEM HUSSAIN		8870574132",
                "Suresh .m		9976015044",
                "Venkatachalapathi		9524956965",
                "rajagopal		9788176117",
                "syedmeera		8870007350",
                "Mohankumar K		8610410243",
                "Hari Prasath		7373261103",
                "Hari Prasath . S		6369699861",
                "M.ponmahesh		9990150801",
                "Mrs JyotiSunder		9994157624",
                "saravanan c		9677352575",
                "M.Abuthahir		9843811885",
                "Jeevanandham Suresh		9629221051",
                "R.Ganesh kumar		9443068782",
                "guru moorthy		7871378024",
                "HAMEED BADURUDEEN. A		7092941932",
                "B CHITRA		9952581084",
                "Sachin Kumar		9566786899",
                "R Vinoth Arumugam		8778435551",
                "Arun Kumar		9047040102",
                "Karthik		8870540401",
                "Nandha Kumar		7448753136",
                "R.SARAVANAN		9498200804",
                "Solomon.J		9443226080",
                "S.MANIKANDAN		9940006410",
                "sb Suriya Prakash		9894994662",
                "sreedharan		9486105078",
                "Kishore.m		9629826284",
                "RUBAN KUMAR P		8754861787",
                "SHARUK		8124632141"





        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, capos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(cabneg.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}