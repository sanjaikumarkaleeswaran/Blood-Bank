package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ea1bneg extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ea1bneg);
        listViewDonors = findViewById(R.id.ea1bneg);
        final String[] ea1bneg = {
                "s.a.Dharani tharan		9842978323",
                "s.gunasekar		9940792449",
                "Seenivasan		9688002627",
                "RAJA GOUNDER SENGOTTAIYAN		9994677166",
                "John		9360548809",
                "Thirunavukkarasu		9698656564",
                "Sankar		9442610593",
                "VT GANGATHARAN		9003789730",
                "Karunakaran G		9585446701",
                "A.DAVID		9443071700",
                "S.gunasekar		9080267181",
                "Saravanan		7373857867"

        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ea1bneg);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(ea1bneg.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
