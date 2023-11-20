package com.android.doctorinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import soup.neumorphism.NeumorphButton;

public class MainActivity extends AppCompatActivity {
    NeumorphButton neuDoctor,neuHospital;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        neuDoctor = findViewById( R.id.neuDoctor);
        neuHospital = findViewById(R.id.neuHospital);


        neuDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ByDiseaseActivity.class);
                startActivity(intent);
            }
        });
        neuHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HospitalActivity.class);
                startActivity(intent);
            }
        });
    }
}