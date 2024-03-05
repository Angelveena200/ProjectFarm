package com.example.farmingshop1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Producttype extends AppCompatActivity {
ImageView image1,image2,image3,image4,image5,image6,image7,image8,image9,image10,image11,image12,image13,
    image14,image15,image16,image17,image18,image19,image20,image21,image22,image23,image24;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producttype);
        image1=findViewById(R.id.i1);
        image2=findViewById(R.id.i2);
        image3=findViewById(R.id.i3);
        image4=findViewById(R.id.i4);
        image5=findViewById(R.id.i5);
        image6=findViewById(R.id.i6);
        image7=findViewById(R.id.i7);
        image8=findViewById(R.id.i8);
        image9=findViewById(R.id.i9);
        image10=findViewById(R.id.i10);
        image11=findViewById(R.id.i11);
        image12=findViewById(R.id.i12);
        image13=findViewById(R.id.i13);
        image14=findViewById(R.id.i14);
        image15=findViewById(R.id.i15);
        image16=findViewById(R.id.i16);
        image17=findViewById(R.id.i17);
        image18=findViewById(R.id.i18);
        image19=findViewById(R.id.i19);
        image20=findViewById(R.id.i21);
        image21=findViewById(R.id.i22);
        image22=findViewById(R.id.i23);
        image23=findViewById(R.id.i24);
        image24=findViewById(R.id.i25);






        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.rice, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Rice");
                                i.putExtra("quan","1 KG");
                                i.putExtra("price","$40");
                                startActivity(i);
                            }
                        });
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog=dialog.create();
                alertDialog.show();
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.corn, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Corn");
                                i.putExtra("quan","1 KG");
                                i.putExtra("price","$50");
                                startActivity(i);
                            }
                        });
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog=dialog.create();
                alertDialog.show();
            }
        });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.yam, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Yam");
                                i.putExtra("quan","1 KG");
                                i.putExtra("price","$35");
                                startActivity(i);
                            }
                        });
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog=dialog.create();
                alertDialog.show();
            }
        });
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.wheat, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Wheat");
                                i.putExtra("quan","1 KG");
                                i.putExtra("price","$70");
                                startActivity(i);
                            }
                        });
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog=dialog.create();
                alertDialog.show();
            }
        });
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.chickpeans, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Chick Peans");
                                i.putExtra("quan","1 KG");
                                i.putExtra("price","$40");
                                startActivity(i);
                            }
                        });
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog=dialog.create();
                alertDialog.show();
            }
        });
        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.bundleofrice, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Bundle of Rice");
                                i.putExtra("quan","1 Bundle ");
                                i.putExtra("price","$1200");
                                startActivity(i);
                            }
                        });
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog=dialog.create();
                alertDialog.show();
            }
        });
        image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.splitgramlentil, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Split Gramlentil");
                                i.putExtra("quan","1 KG");
                                i.putExtra("price","$35");
                                startActivity(i);
                            }
                        });
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog=dialog.create();
                alertDialog.show();
            }
        });
        image8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.greencrop, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Green Crop");
                                i.putExtra("quan","1 KG");
                                i.putExtra("price","$70");
                                startActivity(i);
                            }
                        });
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog=dialog.create();
                alertDialog.show();
            }
        });
        image9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.bundleofcorn, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Bundle of Corn");
                                i.putExtra("quan"," 1 Bundle ");
                                i.putExtra("price","$2150");
                                startActivity(i);
                            }
                        });
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog=dialog.create();
                alertDialog.show();
            }
        });
        image10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.greencrop, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Green Crop");
                                i.putExtra("quan","1 KG");
                                i.putExtra("price","$70");
                                startActivity(i);
                            }
                        });
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog=dialog.create();
                alertDialog.show();
            }
        });
        image11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.tomato, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Tomato");
                                i.putExtra("quan","1 KG");
                                i.putExtra("price","$30");
                                startActivity(i);
                            }
                        });
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog=dialog.create();
                alertDialog.show();
            }
        });
        image12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.eggplant, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Egg Plant");
                                i.putExtra("quan","1 KG");
                                i.putExtra("price","$40");
                                startActivity(i);
                            }
                        });
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog=dialog.create();
                alertDialog.show();
            }
        });
        image13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.ladiesfinger, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Ladies Finger");
                                i.putExtra("quan","1 KG");
                                i.putExtra("price","$40");
                                startActivity(i);
                            }
                        });
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog=dialog.create();
                alertDialog.show();
            }
        });
        image14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.onion, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Onion");
                                i.putExtra("quan","1 KG");
                                i.putExtra("price","$45");
                                startActivity(i);
                            }
                        });
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog=dialog.create();
                alertDialog.show();
            }
        });
        image17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.potatoes, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Potatoes");
                                i.putExtra("quan","1 KG");
                                i.putExtra("price","$60");
                                startActivity(i);
                            }
                        });
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog=dialog.create();
                alertDialog.show();
            }
        });
        image18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.chili, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Chili");
                                i.putExtra("quan","1 KG");
                                i.putExtra("price","$25");
                                startActivity(i);
                            }
                        });
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog=dialog.create();
                alertDialog.show();
            }
        });
        image15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.corrot, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Corrot");
                                i.putExtra("quan","1 KG");
                                i.putExtra("price","$40");
                                startActivity(i);
                            }
                        });
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog=dialog.create();
                alertDialog.show();
            }
        });
        image16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.kos, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Kos");
                                i.putExtra("quan","1 KG");
                                i.putExtra("price","$35");
                                startActivity(i);
                            }
                        });
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog=dialog.create();
                alertDialog.show();
            }
        });
        image19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.pumpkin, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Pumpkin");
                                i.putExtra("quan","1 KG");
                                i.putExtra("price","$50");
                                startActivity(i);
                            }
                        });
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog=dialog.create();
                alertDialog.show();
            }
        });
        image20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.bittergourd, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Bittergourd");
                                i.putExtra("quan","1 KG");
                                i.putExtra("price","$30");
                                startActivity(i);
                            }
                        });
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog=dialog.create();
                alertDialog.show();
            }
        });
        image21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.coriander, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Coriander");
                                i.putExtra("quan","1 Bundle");
                                i.putExtra("price","$60");
                                startActivity(i);
                            }
                        });
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog=dialog.create();
                alertDialog.show();
            }
        });
        image22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.curryleanes, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Curry Leanes");
                                i.putExtra("quan","1 Bundle");
                                i.putExtra("price","$50");
                                startActivity(i);
                            }
                        });
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog=dialog.create();
                alertDialog.show();
            }
        });
        image23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.mint, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Mint");
                                i.putExtra("quan","1 Bundle");
                                i.putExtra("price","$45");
                                startActivity(i);
                            }
                        });
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog=dialog.create();
                alertDialog.show();
            }
        });
        image24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.waterspinach, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Water Spinach");
                                i.putExtra("quan","1 Bundle");
                                i.putExtra("price","$40");
                                startActivity(i);
                            }
                        });
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog=dialog.create();
                alertDialog.show();
            }
        });






    }
}