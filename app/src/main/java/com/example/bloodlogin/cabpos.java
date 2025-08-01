package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class cabpos extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cabpos);
        listViewDonors = findViewById(R.id.ca1bpos);
        final String[] capos= {
                "MADHAN MOHAN		9865448224",
                "Dinesh SR		9600797009",
                "M. Nandhagopal vettaikaran pudur		8610265059",
                "Goutham		9043095354",
                "PJ Stalin		9960642474",
                "Karthik		7200508096",
                "Inasu.T.J		9488001234",
                "R Karthik Addepalli		9003173939",
                "satheeswaran		9894939258",
                "Muruganandam		9843014347",
                "Saravanan N		9655331624",
                "Abdul raseeth		9524798197",
                "R.Prakash Kumar		9843431319",
                "KALIMUTHU MURUGASEN		9952427798",
                "sethuramalingam kasthuri		9443820909",
                "Gopinath Raja		9952436859",
                "Dhiraj vignesh		8667271562",
                "K.Srinivasan		9943182413",
                "Stanley Rex		9003554941",
                "Ajith Abhinesh		8508040952",
                "Bellaro John Regan		9786815894",
                "Manoj kumar b		7200242497",
                "Mano		9384563149",
                "vedibala		6380697348",
                "Aswin.A		7904609957",
                "Ajmal Alam		8870327936",
                "p.sivakumar		9942313333",
                "B Selvakumar		9791600461",
                "Ashok		8667813541",
                "F.anthony ravi		9600906965"




        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, capos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(cabpos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}