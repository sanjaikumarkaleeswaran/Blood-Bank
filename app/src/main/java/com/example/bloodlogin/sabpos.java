package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class sabpos extends AppCompatActivity {
    private ListView listViewDonors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabpos);
        listViewDonors = findViewById(R.id.sabpos);
        final String[] SELAM= {
                "Balaji Srinivasan		9092335882",
                "Vignesh		9788655345",
                "Rajesh Kumar		9600411798",
                "Selvamurugan		8056607706",
                "Naveen Harsha		9952352136",
                "ABISHEK		8056969541",
                "Umamaheswari		9361446137",
                "B.J.pooja		9342071913",
                "Ajithkumar V		8778690636",
                "Rajesh Kumar		8608878558",
                "Prakash j		9566885216",
                "mohamed abbas		9952796901",
                "kanagaraju		7539988274",
                "A.ILAYARAJA		9940942715",
                "mathiyalagan		8667620018",
                "ROSHAN PARTHEEPHAN		7639681757",
                "Velmurugan		9886417910",
                "A K gopu		9488740618",
                "kesava kumar		7557557276",
                "S.Suresh		8526397716",
                "A. Mallika		9442966268",
                "A.Ilayaraja		9940942715",
                "PRASANTH		9789763340",
                "kumarkannan		9751969655",
                "Krishnamoorthy		9842272211",
                "Mugilan R		8940319166",
                "Govindaraj		7094378358",
                "Divya		9080306244",
                "v.srinivas		8428663399",
                "Prasad		8940705956"


        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, SELAM);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(sabpos.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}