package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ta1neg extends AppCompatActivity {
    private ListView listViewDonors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ta1neg);
        listViewDonors = findViewById(R.id.ta1neg);
        final String[] capos = {
              "  Durairaj		9894091444",
               " Mahentharan		8220334101",
               " UDHAYAKUMAR R		8883456999",
              "  tamil arasan		8807868597",
              "  mahalingam natarajan		9500450357",
             "   shivanandan k k		9944382383",
              "  Ponnar		9003308912",
                "Vinayakamoorthi U		9942774066",
               "L.Ramesh Prabhu		9715778864",
                "Nantha gopal		7373895714",
               " Mohammed Abbas		9865236653",
               " Abinesh.M		9487332396",
                "Venkatesh.S		8870915487",
               " Nisanth		7397005944",
               " shree krishna		9629161677",
               " Balaji G		9942019088",
                "Brindha loganathan		8248014033",
              "  K KARUPPUSAMY		8300189633",
               " karthick prabhu		9486112480",
                "Nisar		9585859895",
               " RAVISHANKAR.A		9894381616",
                "Ramesh		9944244999",
               " ramesh prabhu		9715778864",
                "RAMESH BAGAVATHY		9843315777",
               " Karthi		7904223937",
                "prawin Shanmugam		9787710009",
                "Arun		9092920160",
                "jeyaprakash		9095282900"



        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, capos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(ta1neg.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}