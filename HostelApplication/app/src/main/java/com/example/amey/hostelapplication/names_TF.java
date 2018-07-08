package com.example.amey.hostelapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;

public class names_TF extends AppCompatActivity {

    TextView t1;
    Button b1;
    EditText e1,e2;
    private Firebase mref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_names);

        mref= new Firebase("https://hostelapplication-e9def.firebaseio.com/Third_Floor_Girls");



        t1=(TextView)findViewById(R.id.textforname);
        b1=(Button)findViewById(R.id.add);
        e1=(EditText)findViewById(R.id.names);
        e2=(EditText)findViewById(R.id.roomno);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String names=e1.getText().toString();
                String room=e2.getText().toString();
                if(names.equals(""))
                {
                    //Firebase child =mref.child("Third_Floor_Girls");
                }
                else
                {
                    Firebase child1 =mref.child(room);
                    child1.setValue(names);
                    e1.setText("");
                    e2.setText("");
                    Toast.makeText(getApplicationContext(),"Room Details Are Entered Successfully",Toast.LENGTH_SHORT).show();


                }
            }
        });
    }
}
