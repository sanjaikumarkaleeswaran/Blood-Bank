package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class toneg extends AppCompatActivity {
    private ListView listViewDonors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toneg);
        listViewDonors = findViewById(R.id.toneg);
        final String[] capos = {

                "selvakumar		9688066862",
                "abdurrahman		9843086807",
                "T.Sathish		9342624002",
                "Prakash		9025917942",
                "punniamoorthi. s		9750180401",
                "Ravi Kumar		9600942978",
                "VIVEK		9786104959",
                "Duraiselvan		9488132123",
                "MohanRaj.k		9789554467",
                "sathish kumar		9944831682",
                "Senthil Kumar PS		9894052463",
                "A.Kaja maideen		8015887884",
                "SHOUKHAT ALI.A		9629676998",
                "Sakthivel		6369423401",
                "S K Ashwin Kumar		8870319305",
                "sabari nathan		9597938752",
                "Mohammed Abdullah		7010655410",
                "pandeeswaran		8124205158",
                "SaravananKumar		8220179348",
                "indhumathi		7013245881",
                "Sridharan		9585552345",
                "K.manoj		9489263656",
                "periyasamy		9095851111",
                "Dinesh.l		9677354404",
                "JAYANTHARAN		9597223548",
                "Jay Smiley		9092539696",
                "Divakar. R		9095272728",
                "JAWAHAR ALI		9944001755",
                "Prakash		9025917942",
                "abadul rajak		9600536339"






        };



        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, capos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(toneg.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}