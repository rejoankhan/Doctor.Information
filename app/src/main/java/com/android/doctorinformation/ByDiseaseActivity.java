package com.android.doctorinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import soup.neumorphism.NeumorphButton;

public class ByDiseaseActivity extends AppCompatActivity {

    NeumorphButton disGyn,disBrain,disChild,disDental,disEye, disHeart, disLiver,disMedicine, disNeck,
    disOrtho, disOthers,disSkin,getDisDental;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_by_disease);
        disGyn = findViewById(R.id.disGyn);
        disBrain = findViewById(R.id.disBrain);
        disChild = findViewById(R.id.disChild);
        disDental = findViewById(R.id.disDental);
        disEye = findViewById(R.id.disEye);
        disHeart = findViewById(R.id.disHeart);
        disLiver = findViewById(R.id.disLiver);
        disMedicine = findViewById(R.id.disMedicine);
        disNeck = findViewById(R.id.disNeck);
        disOrtho = findViewById(R.id.disOrtho);
        disOthers = findViewById(R.id.disOthers);
        disSkin = findViewById(R.id.disSkin);
        disDental = findViewById(R.id.disDental);



        disGyn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ByDiseaseActivity.this,DisGyneActivity.class);
                startActivity(intent);
            }
        });

        disBrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ByDiseaseActivity.this,DisBrainActivity.class);
                startActivity(intent);
            }
        });
        disChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ByDiseaseActivity.this,DisChildActivity.class);
                startActivity(intent);
            }
        });
        disDental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ByDiseaseActivity.this,DisDentalActivity.class);
                startActivity(intent);
            }
        });
        disEye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ByDiseaseActivity.this,DisEyeActivity.class);
                startActivity(intent);
            }
        });
        disHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ByDiseaseActivity.this,DisHearActivity.class);
                startActivity(intent);
            }
        });
        disLiver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ByDiseaseActivity.this,DisLiverActivity.class);
                startActivity(intent);
            }
        });
        disMedicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ByDiseaseActivity.this, DisMedicineActivity.class);
                startActivity(intent);
            }
        });
        disNeck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ByDiseaseActivity.this,DisNeckActivity.class);
                startActivity(intent);
            }
        });
        disOrtho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ByDiseaseActivity.this,DisOrthoActivity.class);
                startActivity(intent);
            }
        });
        disOthers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ByDiseaseActivity.this, DisOthersActivity.class);
                startActivity(intent);
            }
        });
        disSkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ByDiseaseActivity.this, DisSkinActivity.class);
                startActivity(intent);
            }
        });
        disDental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ByDiseaseActivity.this, DentalActivity.class);
                startActivity(intent);
            }
        });


    }
}