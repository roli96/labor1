package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText FirstName;
    EditText LastName;
    Button Send;
    Button Reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Test1","MainActivity");

        FirstName=findViewById(R.id.FirstName);
        LastName=findViewById(R.id.LastName);

        Send=(Button) findViewById(R.id.Send);

        Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namevalue =FirstName.getText().toString();
                String namevalue2 =LastName.getText().toString();
                Intent intent =new Intent(MainActivity.this,Profil.class);
                intent.putExtra("Name",namevalue);
                intent.putExtra("Name2",namevalue2);
                startActivity(intent);


            }
        });


        Reg=(Button) findViewById(R.id.Reg);

        Reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,Regisztracio.class);
                startActivity(intent);


            }
        });


    }
}
