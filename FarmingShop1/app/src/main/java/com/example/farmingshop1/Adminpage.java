package com.example.farmingshop1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Adminpage extends AppCompatActivity {
ImageView imag1,imag2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminpage);
        imag2=findViewById(R.id.image2);
        imag1=findViewById(R.id.aa);
        imag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Adminpage.this,Producttype.class);
                startActivity(i);
            }
        });
        imag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Adminpage.this,Adminorderdetails.class);
                startActivity(i);
            }
        });

    }
}