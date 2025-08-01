package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class sa1neg extends AppCompatActivity {
    private ListView listViewDonors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sa1neg);
        listViewDonors = findViewById(R.id.sa1neg);
        final String[] SELAM= {
                "soundappan		9042396770",
                "ram		9715935996",
                "sudhan		7373143177",
                "nandakumar		9003557900",
                "Murugan		8248236284",
                "Shankar		9443673180",
                "Selladurai		9791477544",
                "Harinarayana M S		9677496887",
                "prabu		9994616293",
                "k.soundappan		6380379632",
                "sasikumar		6379592818",
                "satheesh kumar.s		9003502970",
                "RTN.A.JAMES		9842751133",
                "Vijayaraguram A		8248929947",
                "suresh kumar		9843444277",
                "jayaram		8682049492",
                "Prakash		8270138797",
                "raghupathy		9500979310",
                "Sabari		7339437737",
                "THILAK RAJA		9345364022",
                "LOGU		9003339991",
                "Sivakumar		9786215199",
                "sathish		9787645971",
                "NALLATHAMBI		9965573235",
                "MANIKANDAN M		7904993378",
                "Raja Prasanna		8778660799",
                "Raja prasanna		7539962589"






        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, SELAM);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(sa1neg.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}