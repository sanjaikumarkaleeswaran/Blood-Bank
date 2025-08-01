package com.example.bloodlogin;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;



public class doonorlauncher extends AppCompatActivity {
    TextInputEditText editTextEmail, editTextPassword;
    Button buttonlogin;
    FirebaseAuth mAuth;
    ProgressBar progressBar;
    TextView textView ;
    @Override
    public void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            Intent intent=new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doonorlauncher);

        mAuth = FirebaseAuth.getInstance();
        editTextEmail = findViewById(R.id.email);
        editTextPassword = findViewById(R.id.password);
        buttonlogin  = findViewById(R.id.BtLogin);
        progressBar = findViewById(R.id.progressBar);
        textView = findViewById(R.id.regnow);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), register.class);
                startActivity (intent);
                finish();

            }
        });
        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(view.VISIBLE);
                String email, password;
                email= String.valueOf(editTextEmail.getText().toString());
                password=String.valueOf(editTextPassword.getText());


                char text;
                if(TextUtils.isEmpty(email)){
                    Toast.makeText(doonorlauncher.this, "ENTER EMAIL", Toast.LENGTH_SHORT).show();

                    return;
                }
                if(TextUtils.isEmpty(password)){
                    Toast.makeText(doonorlauncher.this, "ENTER PASSWORD", Toast.LENGTH_SHORT).show();

                    return;
                }
                mAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                progressBar.setVisibility(view.GONE);
                                if (task.isSuccessful()) {
                                    Toast.makeText(doonorlauncher.this, "LOGINSUCESSFULL",
                                            Toast.LENGTH_SHORT).show();
                                    Intent intent=new Intent(getApplicationContext(), hsel.class);
                                    startActivity(intent);
                                    finish();
                                } else {
                                    Toast.makeText(doonorlauncher.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();
                                }
                            }
                        });



            }
        });

    }
}