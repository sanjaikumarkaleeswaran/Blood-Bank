package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class capos extends AppCompatActivity {
    private ListView listViewDonors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capos);
        listViewDonors = findViewById(R.id.capos);
        final String[] capos= {
                "john vincent		8526698123",
                "s.mohamed basheer		9171777865",
                "BOOBALAN.M		6382261589",
                "ManiKandan P		6369337432",
                "GOWTHAM CHAKRAVARTHY .J		8056751314",
                "Sutharsni Karmegam		9940801836",
                "Sivasubramanian		9444174125",
                "Ravin Thangaraj		9965131327",
                "HIRITHIK VAASAN		9585085988",
                "karthikeyani		8883843824",
                "Aravinth Ramkumar		9003700044",
                "JAYAPRAKASH		9500391628",
                "Mk appass		8695279990",
                "Vp sadeesh		9539206280",
                "samkrish		9597762792",
                "selvakumar		9095339372",
                "pavithran		9750151845",
                "Manisunil		8144184848",
                "Rosalin		8220559437",
                "Abdul Hameed		9943453433",
                "Hariprakash.J		9790455042",
                "umar		9087222153",
                "Aravind Balaji		6383244518",
                "Balamurugan		9894665288",
                "Yuvarajan		9092683270",
                "Yogeswari		7373911107",
                "karthikeyan		7904250970",
                "B Tharunika		9791246666",
                "surya		9003703189",
                "sanjay		9677404806"



        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, capos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(capos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}