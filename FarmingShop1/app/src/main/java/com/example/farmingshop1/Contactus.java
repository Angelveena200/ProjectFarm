package com.example.farmingshop1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Contactus extends AppCompatActivity {
    EditText name,email,message;
    Button sendme;
    DBHelperone db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);
        name=findViewById(R.id.pname);
        email=findViewById(R.id.pemail);
        message=findViewById(R.id.pmessage);
        sendme=findViewById(R.id.sendme);
        db=new DBHelperone(this);

        sendme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((!name.getText().toString().equals("")) && (!email.getText().toString().equals("")) && (!message.getText().toString().equals("")))
                {
                    String NAME=name.getText().toString();
                    String PHONE=email.getText().toString();
                    String EMAIL=message.getText().toString();
                    db.addmsg(NAME,PHONE,EMAIL);
                    Toast.makeText(Contactus.this, "Data inserted Successfully...", Toast.LENGTH_SHORT).show();
                    name.setText("");
                    email.setText("");
                    message.setText("");
                    Intent i=new Intent(Contactus.this,Login.class);
                    startActivity(i);

                }
                else {
                    Toast.makeText(Contactus.this, "Please Enter All The Data...", Toast.LENGTH_SHORT).show();
                }

            }
        });

           }
}