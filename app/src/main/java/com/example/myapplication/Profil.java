package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Profil extends AppCompatActivity {

    TextView  tv,tv1;
    Button up;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        tv=(TextView) findViewById(R.id.textView2);
        tv1=(TextView) findViewById(R.id.textView3);

        tv.setText(getIntent().getStringExtra("Name"));
        tv1.setText(getIntent().getStringExtra("Name2"));


        up=(Button) findViewById(R.id.up);

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Profil.this,MainActivity.class);
                startActivity(intent);


            }
        });
    }
}
