package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class cbpos extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbpos);
        listViewDonors = findViewById(R.id.cbpos);
        final String[] capos= {
                "Sreenath subramanaian		9600507984",
                "JOHNSON		9894748772",
                "Venkateshwaran		9952506531",
                "ganapathy		9003817269",
                "SUGUNA ACHUTHAN		09952423611",
                "Kannan		9940145772",
                "Rajaguru		9629883799",
                "Arun Balan K		9944020770",
                "divaher cm		9952176115",
                "SIVA PRAKASH		9597454458",
                "R.MUTHURAJU		9894699949",
                "malarsaravanan		9940712316",
                "Manjunaath Alagirisamy		9443051904",
                "pandiyan		9514261230",
                "Dhamodhara prasad		9659367945",
                "Kanthavel.P		9865222482",
                "sivakumar.P		9677707769",
                "Srikeerthimanikandan		8667299370",
                "Vignesh		9486416047",
                "Senthilmurugan V		7708233133",
                "Kavinath		8675810908",
                "Durai@1966		9894675561",
        "R.B.VIMAL RAJ		9688416416",
        "Sriram		9095547019",
        "ansar a		9952164947",
        "yasser		8056480199",
        "Sakthivel S		9944529920",
        "s venkateshwaran		9952719721",
        "Mahendhiran Parthasarathi		9860309831",
        "suresh		8220799495"






        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, capos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(cbpos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}