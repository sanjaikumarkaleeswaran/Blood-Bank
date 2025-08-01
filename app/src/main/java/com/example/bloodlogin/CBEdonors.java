package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class CBEdonors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbedonors);
        ListView listview = findViewById(R.id.cbelist);
        List<String> list =new ArrayList<>();
        list.add("A+");
        list.add("A-");
        list.add("A1+");
        list.add("A1-");
        list.add("A1B+");
        list.add("A1B-");
        
        list.add("A2B+");
        list.add("A2B-");
        list.add("AB+");
        list.add("AB-");
        list.add("B+");
        list.add("B-");
        list.add("O+");
        list.add("O-");
       // list.add("1");


        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_activated_1,list );
        listview.setAdapter(arrayAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0) {

                    startActivity(new Intent(CBEdonors.this, capos.class));
                } else if(position==1){
                    //c
                    startActivity((new Intent(CBEdonors.this, caneg.class)));
                }else if(position==2){
                    //c
                    startActivity(new Intent(CBEdonors.this, ca1pos.class));
                }else if(position==3){
                    //c
                    startActivity(new Intent(CBEdonors.this, ca1neg.class));
                }else if(position==4){
                    //c
                    startActivity(new Intent(CBEdonors.this, ca1bpos.class));
                }else if(position==5){
                    //c
                    startActivity(new Intent(CBEdonors.this, ca1bneg.class));
                }
                else if(position==6) {
                    startActivity(new Intent(CBEdonors.this, ca2bpos.class));
                }
                else if(position==7){
                    //c
                    startActivity(new Intent(CBEdonors.this, ca2bneg.class));
                }else if(position==8){
                    //c
                    startActivity(new Intent(CBEdonors.this, cabpos.class));
                }else if(position==9){
                    //c
                    startActivity(new Intent(CBEdonors.this, cabneg.class));
                }else if(position==10){
                    //c
                    startActivity(new Intent(CBEdonors.this, cbpos.class));
                }else if(position==11){
                    //c
                    startActivity(new Intent(CBEdonors.this, cbneg.class));
                }else if(position==12){
                    //c
                    startActivity(new Intent(CBEdonors.this, copos.class));
                }
                else if(position==13){
                    //c
                    startActivity(new Intent(CBEdonors.this, coneg.class));
                }




            }
        });


    }
}