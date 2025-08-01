package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ta1pos extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ta1pos);
        listViewDonors = findViewById(R.id.ta1pos);
        final String[] capos = {
                "Deepanchakkaravarthi		9843098319",
                "Abishai		6379856334",
                "Satham Hussain		6380628250",
                "yuvaneshwaran		9944848247",
                "Aksam Prasad		6382656647",
                "manoj kumar		7871002895",
                "Antony		9789634418",
                "Aadithyakiran		9488652074",
                "Selvakumar		9361993966",
                "Siva Shakti		9688327896",
                "Naveen		9677619667",
                "Sukumar		8220047626",
                "Siva Kumaran		9095865553",
                "Sakthivel A		9944720361",
                "kalaiselvan k		9894198572",
                "ManojKumar		9965353505",
                "Arun.R		9840840788",
                "Deepikaa V		9677947623",
                "Dhasthahir Muhaidheen		8946086067",
                "Jebastin samuvel		8610318501",
                "Gunaa Sekaran. M		9843776060",
                "Silambarasan		9080652768",
                "Saravanan		9698738875",
                "Hari v		9566718394",
                "Dinesh.R		8428162204",
                "Durairaj M		9715989886",
                "yuvaraj		9500517780",
                "Pravin Kumar		9994350745",
                "Karthikeyan		7603834154",
                "G.PALANISAMY		8807040135"


        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, capos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(ta1pos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
