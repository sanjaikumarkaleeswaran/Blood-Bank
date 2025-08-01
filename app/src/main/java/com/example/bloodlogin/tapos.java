package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class tapos extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tapos);
        listViewDonors = findViewById(R.id.tapos);
        final String[] capos= {
                "Kaviya v		9514346911",
                "ADITH KRISHNAN M		9994951590",
                "chandrasekaran. R		9894336083",
                "Anish Selvaraj		9750998866",
                "thanga pandi		8144088372",
                "Vignesh.G		9360555946",
                "NAGARAJ A		9843026567",
                "Narayana siva		9865059144",
                "A.Muruganatham		7708918244",
                "mariyappan.m		7373424099",
                "SURIYA TAMILARASAN		8144808991",
                "vishnu kumar		9600492627",
                "Bhoopathi		9976718485",
                "Sharveshwaran R S		8754818270",
                "R. Janarthanan		9750736136",
                "jafar sathik		6379018517",
                "karthikeyan		8608847744",
                "boopathi		9894413443",
                "m.kandhasamy		9994399220",
                "jagathes kumar		8754863393",
                "Gowtham		8946025260",
                "Sachin		9597051504",
                "suriyanarayanan p		8778543934",
                "A.VELUSAMY		9442818094",
                "SRIRAMAN R S		9524216555",
                "Muralikumar Padmanaban		9843341223",
                "K S AMMAPATTI		9865951912",
                "Krishna Prasanth B		8883384222",
                "Prasanth		9500519797",
                "Jahier hussain		9786365945"




        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, capos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(tapos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}