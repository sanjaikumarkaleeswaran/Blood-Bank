package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class tbpos extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tbpos);
        listViewDonors = findViewById(R.id.tbpos);
        final String[] capos = {

                "GOPINATH A		9940890401",
                "sathish Kumar		9944476484",
                "Dhandapani s		9788097610",
                "Krishnamurthy		9443058880",
                "alagar Raja		9952824098",
                "Rajeshkannan S		8973090724",
                "Chandhru V		9659509911",
                "Abishake AM		9597018410",
                "Vinoth pandian		9047461414",
                "Gopal		9750893274",
                "Sathasivam V		9659241773",
                "SABARINATHAN		9043865748",
                "Suresh Kumar		9942052005",
                "DEEPIKA		8526426660",
                "sevadesikan		9976190562",
                "Siva Kumar		9095346441",
                "G THIRUMALAISAMY		7010417258",
                "Arunkumar		8072421689",
                "Sridhar M		9677826838",
                "Balathandapani		9629351535",
                "Dinesh		9894025620",
                "Ragavan		7904105966",
                "P.SIVASANKAR		8667783507",
                "L Eswaramoorthi		9715577999",
                "arvind		7502750794",
                "Sakthi kumar		9940910101",
                "Mohaideen Sulthan		7092440650",
                "Dinesh kumar		9345128993",
                "sarath kumar		8220618634",
                "Ajay B		9080622432"




        };



        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, capos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(tbpos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}