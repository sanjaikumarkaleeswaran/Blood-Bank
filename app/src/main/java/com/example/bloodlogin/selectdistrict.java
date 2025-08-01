package com.example.bloodlogin;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class selectdistrict extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectbloodgroup);
        ListView listview =findViewById(R.id.listview);
        TextView textView=findViewById(R.id.txtt);
        Button button=findViewById(R.id.bttn);

        List<String> list =new ArrayList<>();
        list.add("Erode");
        list.add("Coimbatore");
        list.add("Tiruppur  ");
        list.add("Salem");


        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_activated_1,list );
        listview.setAdapter(arrayAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0) {

                    startActivity(new Intent(selectdistrict.this, eroaddonors.class));
                } else if(position==1){
                    //c
                    startActivity((new Intent(selectdistrict.this, CBEdonors.class)));
                }else if(position==2){
                    //c
                    startActivity(new Intent(selectdistrict.this, TIRUPPURdonors.class));
                }else if(position==3){
                    //c
                    startActivity(new Intent(selectdistrict.this, SELAMdonors.class));
                }
                else if(position==4){
                    //c
                    startActivity(new Intent(selectdistrict.this, SELAMdonors.class));
                }

            }
        });





    }
}
