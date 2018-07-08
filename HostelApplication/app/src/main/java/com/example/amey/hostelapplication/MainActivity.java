package com.example.amey.hostelapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    TextView t1,t2,t3;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.username);
        e2=(EditText)findViewById(R.id.password);
        t1=(TextView)findViewById(R.id.hostel);
        t2=(TextView)findViewById(R.id.detail);
        t3=(TextView)findViewById(R.id.footer);
        b1=(Button)findViewById(R.id.login);
        b2=(Button)findViewById(R.id.complaint);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname="hostel@1";
                String pass="student1234";
                String username=e1.getText().toString();
                String password=e2.getText().toString();
                if(username.equals(uname) && password.equals(pass)){
                    Intent i=new Intent(getApplicationContext(),menu.class);
                    startActivity(i);
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(MainActivity.this, "Wrong Credentials Password Or Username", Toast.LENGTH_SHORT).show();
                }
                e1.setText("");
                e2.setText("");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j= new Intent(getApplicationContext(),RegisterComplaint.class);
                startActivity(j);
            }
        });
    }
}
