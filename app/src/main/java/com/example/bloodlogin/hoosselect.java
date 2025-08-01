package com.example.bloodlogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

public class hoosselect extends AppCompatActivity {

    private Spinner locationSpinner;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoosselect);

        locationSpinner = findViewById(R.id.location_spinner);
        webView = findViewById(R.id.webview);

        // Set up Spinner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.locations, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        locationSpinner.setAdapter(adapter);

        // Set up WebView
        webView.getSettings().setJavaScriptEnabled(true);

        // Load default URL
        loadWebView("https://www.example.com");

        // Handle item selection in Spinner
        locationSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String selectedLocation = (String) adapterView.getItemAtPosition(position);
                String url = getUrlForLocation(selectedLocation);
                loadWebView(url);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // Do nothing
            }
        });

    }

    private String getUrlForLocation(String location) {

        switch (location) {
            case "Erode":
                return "https://www.justdial.com/Erode/Hospitals/nct-10253670?ismap=undefined&srcterm=Hospitals";
            case "Tirupur":
                return "https://www.justdial.com/Tirupur/Hospitals/nct-10253670?ismap=undefined&srcterm=Hospitals";
            case "Salem":
                return "https://www.justdial.com/Salem/Hospitals/nct-10253670?ismap=undefined&srcterm=Hospitals";
            case "Perundurai":
                return "https://www.justdial.com/Perundurai/Hospitals/nct-10253670?ismap=undefined&srcterm=Hospitals";
            case "Coimbatore":
                return "https://www.justdial.com/Coimbatore/Hospitals/nct-10253670?ismap=undefined&srcterm=Hospitals    ";
            default:
                return "https://www.example.com";
        }
    }

    private void loadWebView(String url) {
        webView.loadUrl(url);
    }
}