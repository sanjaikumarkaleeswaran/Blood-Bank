package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class sopos extends AppCompatActivity {
    private ListView listViewDonors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sopos);
        listViewDonors = findViewById(R.id.sopos);
        final String[] SELAM= {
                "selvamani		9688485646",
                "v.vignesh		9842856528",
                "S.A prabhukumar		8667008783",
                "g.vijayarajan		9003921711",
                "kavitha periasamy		9442188665",
                "Manikandan G		9894919845",
                "Gobianand Kuppannan		9444108619",
                "P SURESH		9994646540",
                "M.Sathyanarayanan		8870519136",
                "Sundaravadivel R		9360137375",
                "Murugan		9943445050",
                "subramaniyan		9566540218",
                "Gokul		9578504396",
                "Dineshkumar		9677451987",
                "jagadeesh		9994239227",
                "Dr.AMARNATH		0944326949",
                "Ramesh		8778583636",
                "vairakannan		9894967841",
                "MohanRaja Mahendran		8870428794",
                "Karthi Kutty		9047871326",
                "Siva lingam. E		9443731569",
                "Umasankar M		9025133320",
                "Siva.A		9361972010",
                "Jagathesan		9787170335",
                "Ravi		7010684101",
                "Karthik Raja V		9008176978",
                "Santhosh S U		9944809940",
                "Dr.Gowtham Krishnan		7708158070",
                "pk.bhaskaran		8838608587",
                "GUNASEKARAN		9942699911"


        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, SELAM);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(sopos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}