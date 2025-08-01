package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ca1neg extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ca1neg);  listViewDonors = findViewById(R.id.ca1neg);
        final String[] capos= {
                "Krishna Kumar		9943586864",
                "Vijayakumar		9952729921",
                "S Jaya Sankar		9144009090",
                "Bala Murali Krishna		8122269610",
                "Indrajit indran		8778952046",
                "Paasamuthu		8667835503",
                "MUTHUKUMARASAAMI K R		9442278565",
                "Siva.G		7010031187",
                "Ramesh		9514067995",
                "bharath d		9042471408",
                "BAIJU JOHN		9995577015",
                "P.Rajendran		9443049596",
                "Barathkumar		8754986485",
                "Nirmal kumar		9842012604",
                "Karthikeyan		9865911315",
                "avanthika vivekanandan		8248208402",
                "Vigneshbabu		8870692981",
                "kavyakrishnasamy		6380974121",
                "Vivek		9600976147",
                "S.Narayanan		9894031101",
                "Vinoth A		8220885480",
                "R.SHYAM SUNDER		9952269844",
                "pradeep		6369637412",
                "Rajasekar.c		9489470755",
                "ATHITHYA RAM		9965612312",
                "A.Mouleeswar		9789713777",
                "jeevananthan		9585599440",
                "Sridhar		9095095765",
                "Sivakumar Nagarajan		9894556719",
                "Prasanna		9710041688"






        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, capos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(ca1neg.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}