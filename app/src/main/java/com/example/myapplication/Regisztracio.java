package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Regisztracio extends AppCompatActivity {


    EditText FirstName;
    EditText LastName;
    Button Regisztralas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regisztracio);


        FirstName=findViewById(R.id.Rfirst);
        LastName=findViewById(R.id.Rlast);

        Regisztralas=(Button) findViewById(R.id.Regisztralas);

        Regisztralas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namevalue =FirstName.getText().toString();
                String namevalue2 =LastName.getText().toString();
                Intent intent =new Intent(Regisztracio.this,Profil.class);
                intent.putExtra("Name",namevalue);
                intent.putExtra("Name2",namevalue2);
                startActivity(intent);


            }
        });
    }
}
