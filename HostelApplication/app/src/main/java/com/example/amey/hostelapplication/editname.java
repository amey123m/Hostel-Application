package com.example.amey.hostelapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;
import com.google.firebase.database.DatabaseReference;

public class editname extends AppCompatActivity {

    String message;
    int position;
    Button b1;
    EditText e1;
    private Firebase mref;
    private DatabaseReference dref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_names);

        mref= new Firebase("https://hostelapplication-e9def.firebaseio.com/Second_Floor");
        b1=(Button)findViewById(R.id.add);
        e1=(EditText)findViewById(R.id.names);
        final String names1=e1.getText().toString();
        Intent j=getIntent();
        message= j.getStringExtra(constient.INTENT_MESSAGE_DATA);
        position=j.getIntExtra(constient.INTENT_ITEM_POSITION,-1);
        EditText editmessage=(EditText)findViewById(R.id.names);
        editmessage.setText(message);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*String changemessage=((EditText)findViewById(R.id.names)).getText().toString();
                Intent j=new Intent();
                j.putExtra(constient.INTENT_CHANGED_MESSAGE,changemessage);
                j.putExtra(constient.INTENT_ITEM_POSITION,position);
                setResult(constient.RESULT_CODE_ONE,j);
                finish();*/


                //child.setValue(names1);

            }
        });


    }

}
