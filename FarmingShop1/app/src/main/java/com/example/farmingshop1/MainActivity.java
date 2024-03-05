package com.example.farmingshop1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a=findViewById(R.id.t1);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Login.class);
                startActivity(i);
            }
        });

    }
}