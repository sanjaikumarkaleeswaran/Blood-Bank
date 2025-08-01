package com.example.bloodlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hsel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hsel);

        // Initialize first button
        Button button1 = findViewById(R.id.bttn);

        // Set OnClickListener for the first button
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), hoosselect.class);
                startActivity(intent);
                finish();
            }
        });

        // Initialize second button
        Button button2 = findViewById(R.id.dis);

        // Set OnClickListener for the second button
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), selectdistrict.class);
                startActivity(intent);
                finish();
            }
        });
        Button button3 = findViewById(R.id.donar);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), reg2.class);
                startActivity(intent);
                finish();
            }
        });

        // Initialize third button

    }
}
