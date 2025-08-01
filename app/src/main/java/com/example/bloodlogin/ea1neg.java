package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ea1neg extends AppCompatActivity {
    private ListView listViewDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ea1neg);
        listViewDonors = findViewById(R.id.ea1pos);
        final String[] ea1Pos = {
                "RAJAN BABU		9843207721",
                "Su.Bhalaji		9442775780",
                "Gowtham Rameshkumar		8220101113",
                "senthilkumar		9597290301",
                "SATHEESHKUMAR.A		9865899677",
                "Suresh prabhakaran		6381888729",
                "P.BALAMURUGAN		9788096636",
                "Kirubanand K		9577777555",
                "logeshkumar		9047807080",
                "ponmurugan k		9659002602",
                "JANARTHANAN.R		8903401515",
                "Swadhi Vivekanandham		9500514339",
                "shebi		8344685468",
                "kishor kumaar N		7010350287",
                "karthikeyan D		9791920930",
                "SOUNDERARAJAN		8056777473",
                "Venkatesh		9788392797",
                "Karthik Raja B		6381818503",
                "arunpradeep		9573924149",
                "Rajakannu		9842733484",
                "Thirumalai Kumar S		9994361989",
                "V JAYACHANDRAN		9842784144",
                "K.P.kavincumar		9884498744",
                "Amertha kumar M		8838320340",
                "Suresh		9751882310",
                "saigovindarajan N		6382533036",
                "Harishgowtham		8940411123",
                "Gowthamanvelmurugan		8072488792",
                "Thiness Babu		9943390096"
        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ea1Pos);


        listViewDonors.setAdapter(adapter);


        listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String donorDetails = (String) parent.getItemAtPosition(position);
                Toast.makeText(ea1neg.this, donorDetails, Toast.LENGTH_SHORT).show();
            }
        });
    }
}