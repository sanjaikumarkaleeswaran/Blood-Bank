package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class caneg extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caneg);


        listViewDonors = findViewById(R.id.caneg);
        final String[] capos= {
                "Gowtham.A.R		7868908745",
                "K.Lakshmanasamy		9486851855",
                "Antony		9600548384",
                "b.rafiq		9843666473",
                "Dhana Balan@Vinoth		8610913456",
        "NAGARAJ DHANDAPANI		9843099314",
        "Anna kodi		8526607717",
        "karthikeyan		8012882254",
        "Karthikeyan		9865911315",
        "Ramanathan		9790246727",
        "Nandhakumar N		8680879545",
        "Aravindhan K		9894381977",
        "gobinath		9486129159",
        "Rajasekaran		8124268189",
        "shake mytheen		9629540535",
        "Jacinth arun		9994673327",
        "nandhakumar.p		9600403577",
        "Rasoolahmed		7812098802",
        "Tamilarasan		9500605143",
        "sathysh		8807569324",
        "Nithya		8639616926",
        "Sathish		9080479732",
        "Nanthababu S		9600274401",
        "vaitheeswaran		6383958144",
        "PUGAZHENDHI		9360116556",
        "tamilmani. d		8072970740",
        "Rajkumar		9994204834",
        "stella mary		9047371525",
        "BALASUBRAMANIAM SARAVANAN		6369174564",
        "Sulaiman		6381655131"




        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, capos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(caneg.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}