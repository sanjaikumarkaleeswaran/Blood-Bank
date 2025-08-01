package com.example.bloodlogin;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class reg2 extends AppCompatActivity {

    EditText nameEditText;
    Spinner bloodTypeSpinner;
    Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg2);

        nameEditText = findViewById(R.id.nameEditText);
        bloodTypeSpinner = findViewById(R.id.bloodTypeSpinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.blood_types_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        bloodTypeSpinner.setAdapter(adapter);

        registerButton = findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString().trim();
                String bloodType = bloodTypeSpinner.getSelectedItem().toString().trim();

                if (name.isEmpty()) {
                    nameEditText.setError("Name is required");
                    return;
                }

                if (bloodType.isEmpty()) {
                    Toast.makeText(reg2.this, "Please select a blood type", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Perform registration process
                Toast.makeText(reg2.this, "Registration successful for " + name + " with blood type " + bloodType, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
