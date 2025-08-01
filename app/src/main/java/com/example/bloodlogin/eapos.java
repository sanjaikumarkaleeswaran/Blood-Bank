package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class eapos extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eapos);
        listViewDonors = findViewById(R.id.eaposlist);
        final String[] a1bPositiveDonors = {
                "Saravana Kumar  8667365380",
                "S.Kannan	7708929133",
                "K.G. Palani Samy  9842838183",
                "Nayeemudeen 9566645616",
                "sivakumar. R	9566313265",
                "AMEER HASSHAN	9865749601",
                "karthikeyan.n	9500553127",
                "Rajesh kumar T	9443816805",
                "Rathishkumar	8754499334",
                "Sathish kumar	9514711419",
                "Nayeem A.1		9566645616",
                "Joe Ravi Fernandas A	7904298590",
                "saravanan		9865667793",
                "srikanth		8220360264",
                "Mohamed Wasig		9894549111",
                "Selvakumar.E		9688748110",
                "Sanoj Kumar.R		9688168273",
                "Kumar		9659362332",
                "Dineshkumar		9788289002",
                "thangavel		9698258211",
                "Shanmuga sundaram		9677773348",
                "T VIJAYAKRISHNAN		9244426679",
                "Raghunathan		6379999361",
                "Jeyaraj		9486198101",
                "Muthukumar		9843725934",
                "S. GOWTHAM		9025659352",
                "mohanavel		9952291222",
                "prabhakaran		9865171616",
               "Krishna Kumar		8015587102",
                "rutrakkumaar A P		9994133941"

        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, a1bPositiveDonors);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(eapos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}