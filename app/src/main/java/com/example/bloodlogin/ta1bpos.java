package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ta1bpos extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ta1bpos);
        listViewDonors = findViewById(R.id.ta1bpos);
        final String[] capos = {
                "suresh		9092740324",
                "Manju Nagamanikam		9952185377",
                "K.Mohanraj		9688808901",
                "Anandharajan		8489080809",
                "Vasudevan		9843666231",
                "Madhan Kumar		9566351609",
                "Gopalakrishnan		9842296033",
                "Rajendiran		7402220234",
                "sriram		8870219437",
                "Praveen chidambaram		7904302627",
                "Eswaramoorthy R		9626410266",
                "Anand		9600420045",
                "Hariprasath		6382910847",
                "madhusudhanan		7373275012",
                "Sabareeswaran		9865750050",
                "saravanakumar.p		9789766176",
                "Stephen Raj		9698746432",
                "Kalaiarasi.T.		9865187911",
                "vinothkumar R		9787000007",
                "Amjed Ali		8428489594",
                "K. G. Vijayakumar		9788656481",
                "karthick		8610905085",
                "Rengarasu A		9976388801",
                "Mani Bharathi E		9360002845",
                "saravanan		7845679882",
                "NITHIYANANDHAKUMAR SELLAMUTHU		8012295940",
                "Narayanan		9965194413",
                "Ponsankar.kn2989		9442215544",
                "kotteswaran		9865258583",
                "Kaviraj		9952169530"




        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, capos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(ta1bpos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}