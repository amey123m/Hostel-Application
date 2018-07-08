package com.example.amey.hostelapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.Firebase;

public class names_boys extends AppCompatActivity {

    //EditText e1,e2;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    private Firebase mref,mref1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_names_boys);
        Firebase.setAndroidContext(this);

        mref= new Firebase("https://hostelapplication-e9def.firebaseio.com/Third_Boys");
        //e1=(EditText)findViewById(R.id.rooms);
        //e2=(EditText)findViewById(R.id.names);
        b1=(Button)findViewById(R.id.f1);
        b2=(Button)findViewById(R.id.f2);
        b3=(Button)findViewById(R.id.f3);
        b4=(Button)findViewById(R.id.f4);
        b5=(Button)findViewById(R.id.f5);
        b6=(Button)findViewById(R.id.f6);
        b7=(Button)findViewById(R.id.f7);
        b8=(Button)findViewById(R.id.f8);
        b9=(Button)findViewById(R.id.f9);
        b10=(Button)findViewById(R.id.f10);
        b11=(Button)findViewById(R.id.f11);
        b12=(Button)findViewById(R.id.f12);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secfloor=new Intent(getApplicationContext(),SecondF_Names.class);
                startActivity(secfloor);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thirdfloor=new Intent(getApplicationContext(),ThirdF_Names.class);
                startActivity(thirdfloor);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forthfloor=new Intent(getApplicationContext(),FourthF_Names.class);
                startActivity(forthfloor);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fifthfloor=new Intent(getApplicationContext(),FifthF_Names.class);
                startActivity(fifthfloor);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sixthfloor=new Intent(getApplicationContext(),SixthF_Names.class);
                startActivity(sixthfloor);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent seventhfloor=new Intent(getApplicationContext(),SeventhF_Names.class);
                startActivity(seventhfloor);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eightfloor=new Intent(getApplicationContext(),EighthF_Names.class);
                startActivity(eightfloor);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ninthfloor=new Intent(getApplicationContext(),NinthF_Names.class);
                startActivity(ninthfloor);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tenthfloor=new Intent(getApplicationContext(),TenthF_Names.class);
                startActivity(tenthfloor);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eleventhfloor=new Intent(getApplicationContext(),EleventhF_Names.class);
                startActivity(eleventhfloor);
            }
        });
        /*b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent twelthfloor=new Intent(getApplicationContext(),TwelthF_Names.class);
                startActivity(twelthfloor);
            }
        });*/
    }


}
