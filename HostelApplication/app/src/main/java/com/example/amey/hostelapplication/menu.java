package com.example.amey.hostelapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class menu extends AppCompatActivity {

    ImageButton i1,i2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
         i1=(ImageButton)findViewById(R.id.imageButton);
         i2=(ImageButton)findViewById(R.id.compl);

         i1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i=new Intent(getApplicationContext(),hostel.class);
                 startActivity(i);
             }
         });

         i2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent j=new Intent(getApplicationContext(),complaint.class);
                 startActivity(j);
             }
         });
    }
}
