package com.example.amey.hostelapplication;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.Firebase;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

public class RegisterComplaint extends AppCompatActivity {


    EditText e1;
    Button b1;
    private Firebase mref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_complaint);
        com.firebase.client.Firebase.setAndroidContext(this);


        e1=(EditText)findViewById(R.id.comp);

        b1=(Button)findViewById(R.id.save);
        ConnectivityManager cm=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork=cm.getActiveNetworkInfo();


        mref= new Firebase("https://hostelapplication-e9def.firebaseio.com/");

    }
    public void onClickButtonExample(View view){
        AlertDialog.Builder abd=new AlertDialog.Builder(this);

        ConnectivityManager cm=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork1=cm.getActiveNetworkInfo();
        if(null!= activeNetwork1)
        {
            if(activeNetwork1.getType()==ConnectivityManager.TYPE_WIFI || activeNetwork1.getType()==ConnectivityManager.TYPE_MOBILE)
            {

                final Date currdate = Calendar.getInstance().getTime();
                final String hos=e1.getText().toString();
                if(hos.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"PLease Enter Valid Credentials",Toast.LENGTH_LONG).show();
                }
                else
                {

                    abd.setMessage("Do you Want To Register Complaint");
                    abd.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Firebase child=mref.child("complaints");
                            child.push().setValue(hos+currdate);
                            Toast.makeText(getApplicationContext(),"Complaint Registered Successfully......Thank You!!",Toast.LENGTH_SHORT).show();
                            Intent i1=new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(i1);
                        }
                    });
                    abd.setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getApplicationContext(),"Complaint Not Registered",Toast.LENGTH_SHORT).show();
                            Intent i2=new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(i2);
                        }
                    });
                    AlertDialog ad=abd.create();
                    ad.show();
                }
            }
        }
        else
        {
            Toast.makeText(getApplicationContext(),"NO INTERNET CONNECTION.......",Toast.LENGTH_SHORT).show();
            Intent i3=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i3);
        }

    }

}

