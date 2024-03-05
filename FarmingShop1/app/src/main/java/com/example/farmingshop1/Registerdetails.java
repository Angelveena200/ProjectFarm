package com.example.farmingshop1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class Registerdetails extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<String> name,mobile,email,pass;
    DBHelper db;
    MyAdapter myAdapter;
    EditText EMAIL;
    Button update,delete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerdetails);
        db=new DBHelper(this);
        name=new ArrayList<>();
        mobile=new ArrayList<>();
        email=new ArrayList<>();
        pass=new ArrayList<>();
        recyclerView=findViewById(R.id.recycerview);
        myAdapter=new MyAdapter(this,name,mobile,email,pass);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        displaydata();

        EMAIL=findViewById(R.id.email);

        update=findViewById(R.id.b1);
        delete=findViewById(R.id.b2);


        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email = EMAIL.getText().toString();
                Boolean checkudeletedata = db.deletedata(Email);
                if(checkudeletedata==true)
                    Toast.makeText(Registerdetails.this, "Entry Deleted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(Registerdetails.this, "Entry Not Deleted", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void displaydata() {
        Cursor cursor=db.getregisterdata();
        if(cursor.getCount()==0)
        {
            Toast.makeText(Registerdetails.this, "No Enrty Exists", Toast.LENGTH_SHORT).show();
            return;
        }
        else
        {
            while (cursor.moveToNext())
            {
                name.add(cursor.getString(0));
                mobile.add(cursor.getString(1));
                email.add(cursor.getString(2));
                pass.add(cursor.getString(3));

            }
        }
    }
}