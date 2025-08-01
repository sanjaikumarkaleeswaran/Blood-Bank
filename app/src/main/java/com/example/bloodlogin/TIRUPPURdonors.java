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

public class TIRUPPURdonors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiruppurdonors);

        ListView listview = findViewById(R.id.TIRUPPURdonors);
        List<String> list =new ArrayList<>();
        list.add("A+");
        list.add("A-");
        list.add("A1+");
        list.add("A1-");
        list.add("A1B+");
        list.add("A1B-");
       list.add("A2+");
       list.add("A2-");
        list.add("A2B+");
        list.add("A2B-");
        list.add("AB+");
        list.add("AB-");
        list.add("B+");
        list.add("B-");
        list.add("O+");
        list.add("O-");
       // list.add("1");


        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,list );
        listview.setAdapter(arrayAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0) {

                    startActivity(new Intent(TIRUPPURdonors.this, tapos.class));
                } else if(position==1){
                    //c
                    startActivity((new Intent(TIRUPPURdonors.this, taneg.class)));
                }else if(position==2){
                    //c
                    startActivity(new Intent(TIRUPPURdonors.this, ta1pos.class));
                }else if(position==3){
                    //c
                    startActivity(new Intent(TIRUPPURdonors.this, ta1neg.class));
                }else if(position==4){
                    //c
                    startActivity(new Intent(TIRUPPURdonors.this, ta1bpos.class));
                }else if(position==5){
                    //c
                    startActivity(new Intent(TIRUPPURdonors.this, ta1bneg.class));
                }else if (position==6){
                    //c
                    startActivity(new Intent(TIRUPPURdonors.this, ta2pos.class));
                }else if(position==7){
                    //c
                    startActivity(new Intent(TIRUPPURdonors.this, ta2neg.class));
                }
                else if(position==8) {
                    startActivity(new Intent(TIRUPPURdonors.this, ta2bpos.class));
                }
                else if(position==9){
                    //c
                    startActivity(new Intent(TIRUPPURdonors.this, ta2bneg.class));
                }else if(position==10){
                    //c
                    startActivity(new Intent(TIRUPPURdonors.this, tabpos.class));
                }else if(position==11){
                    //c
                    startActivity(new Intent(TIRUPPURdonors.this, tabneg.class));
                }else if(position==12){
                    //c
                    startActivity(new Intent(TIRUPPURdonors.this, tbpos.class));
                }else if(position==13){
                    //c
                    startActivity(new Intent(TIRUPPURdonors.this, tbneg.class));
                }else if(position==14){
                    //c
                    startActivity(new Intent(TIRUPPURdonors.this, topos.class));
                }
                else if(position==15){
                    //c
                    startActivity(new Intent(TIRUPPURdonors.this, toneg.class));
                }




            }
        });


    }
}