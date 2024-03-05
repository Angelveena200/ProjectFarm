package com.example.farmingshop1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    ImageView image1,im2,im3,im4,im5;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        image1=findViewById(R.id.productsclik);
        im2=findViewById(R.id.image2);
        im3=findViewById(R.id.image3);
        im4=findViewById(R.id.image4);
        im5=findViewById(R.id.image5);




        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity2.this, Producttype.class);
                startActivity(i);
            }
        });
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity2.this, Orderdetailspage.class);
                startActivity(i);
            }
        });
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity2.this, Delivery.class);
                startActivity(i);
            }
        });
        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity2.this, Aboutus.class);
                startActivity(i);
            }
        });
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity2.this, Contactus.class);
                startActivity(i);
            }
        });

    }
}