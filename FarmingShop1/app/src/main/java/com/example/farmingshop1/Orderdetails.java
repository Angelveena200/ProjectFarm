package com.example.farmingshop1;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Orderdetails extends AppCompatActivity {


    TextView pname,pquantity,pprice;
    EditText pemail,mobile,paddress;
    Button submit;
    Spinner spinner;
   DBHelperone dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderdetails);

        Intent intent = getIntent();
        String a =intent.getStringExtra("rice");
        String b =intent.getStringExtra("quan");
        String c =intent.getStringExtra("price");


        spinner=findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.quantity, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);


        dbHelper=new DBHelperone(this);
       pname = findViewById(R.id.pname);
        pquantity = findViewById(R.id.pquantity);
        pprice = findViewById(R.id.pprice);
        submit= findViewById(R.id.submit);
        spinner= findViewById(R.id.spinner);
        pemail= findViewById(R.id.pemail);
        mobile= findViewById(R.id.pmobile);
        paddress= findViewById(R.id.paddress);

        pname.setText(a);
        pquantity.setText(b);
        pprice.setText(c);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((!pname.getText().toString().equals("")) && (!pquantity.getText().toString().equals("")) && (!pprice.getText().toString().equals("")) && (!spinner.getSelectedItem().toString().equals("")) && (!mobile.getText().toString().equals("")) && (!pemail.getText().toString().equals("")) && (!paddress.getText().toString().equals("")))
                {
                    String NAME=pname.getText().toString();
                    String PHONE=pquantity.getText().toString();
                    String EMAIL=pprice.getText().toString();
                    String PASSWORD=spinner.getSelectedItem().toString();
                    String MOBILE=mobile.getText().toString();
                    String PEMAIL=pemail.getText().toString();
                    String ADDRESS=paddress.getText().toString();
                    dbHelper.addorders(NAME,PHONE,EMAIL,PASSWORD,MOBILE,PEMAIL,ADDRESS);
                    Toast.makeText(Orderdetails.this, "Products Order Successfully...", Toast.LENGTH_SHORT).show();
                    pname.setText("");
                    paddress.setText("");
                    pquantity.setText("");
                    pprice.setText("");
                    mobile.setText("");
                    pemail.setText("");
                    Intent i=new Intent(Orderdetails.this,Producttype.class);
                    startActivity(i);

                }
                else {
                    Toast.makeText(Orderdetails.this, "Please Enter Above Details...", Toast.LENGTH_SHORT).show();
                }


        }

            });




    }
}