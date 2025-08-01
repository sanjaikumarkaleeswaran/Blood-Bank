package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class sapos extends AppCompatActivity {
    private ListView listViewDonors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sapos);
        listViewDonors = findViewById(R.id.sapos);
        final String[] SELAM= {
                "Babu		8903665796",
                "prabakaran		8148075982",
                "ARUNMOZHIVARNAN		7358683839",
                "vignesh		7695882110",
                "Selvaraj		9894647502",
                "S.KANNAN		9942715232",
                "P.K.Gowrisankar		9360165231",
                "Sithesh Govindhan		9345974437",
                "Rajenthiran		9629141697",
                "Ashok		8682848916",
                "sivakumar		9659435671",
                "SAKTHIVEL R		9080976434",
                "Kalaiarasan G		9787379262",
                "VINOTH KUMAR		9994266709",
                "Balaji		9442282183",
                "Manikandan		9994719222",
                "James Henry		6379816973",
                "S. T. Prince Kumar		9942504112",
                "Nagaraj K		9442859919",
                "Anandhan M		7373337738",
                "SURESH		9043534457",
                "sureshkumar		9597767708",
                "KAMALAKANNAN S		9842737817",
                "prasanth		9688506002",
                "saravanan		9994450518",
                "praveen		8248486912",
                "Manikandan		9629465029",
                "charles		9840961896",
                "Jaga theesan R		8220056096",
                "sakthivel		9698607086"





        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, SELAM);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(sapos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}