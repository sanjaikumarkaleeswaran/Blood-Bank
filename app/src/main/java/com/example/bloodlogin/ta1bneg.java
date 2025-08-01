package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ta1bneg extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ta1bneg);
        listViewDonors = findViewById(R.id.ta1bneg);
        final String[] capos = {
                "Gowthaman		9943675587",
                "Gowri		8124440840",
                "VENKATESAN		9842210135",
                "Sadham Hussain		9894131348",
                "Ajmeer Ali		8883885896",
                "Manoj Kumar.R		9585923281"
        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, capos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(ta1bneg.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}