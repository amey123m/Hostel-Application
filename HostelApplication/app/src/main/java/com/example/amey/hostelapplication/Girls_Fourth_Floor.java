package com.example.amey.hostelapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

import java.util.ArrayList;

public class Girls_Fourth_Floor extends AppCompatActivity {

    Button b1;
    ListView lv1;
    TextView t1;
    private Firebase mref;
    private ArrayList<String> Girls_Fourth_Floor = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girls__forth__floor);
        com.firebase.client.Firebase.setAndroidContext(this);

            mref= new Firebase("https://hostelapplication-e9def.firebaseio.com/Fourth_Floor_Girls");
            b1=(Button)findViewById(R.id.add);
            t1=(TextView)findViewById(R.id.sfloor);
            lv1=(ListView)findViewById(R.id.list1);
            String message;


            final ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Girls_Fourth_Floor);
            lv1.setAdapter(arrayAdapter);

            mref.addChildEventListener(new ChildEventListener() {
                @Override
                public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                    String value=dataSnapshot.getValue(String.class);
                    Girls_Fourth_Floor.add(value);
                    arrayAdapter.notifyDataSetChanged();
                }

                @Override
                public void onChildChanged(DataSnapshot dataSnapshot, String s) {

                }

                @Override
                public void onChildRemoved(DataSnapshot dataSnapshot) {

                }

                @Override
                public void onChildMoved(DataSnapshot dataSnapshot, String s) {

                }

                @Override
                public void onCancelled(FirebaseError firebaseError) {

                }
            });
            lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                    Intent j=new Intent(getApplicationContext(),editname.class);
                    j.putExtra(constient.INTENT_MESSAGE_DATA,Girls_Fourth_Floor.get(i).toString());
                    j.putExtra(constient.INTENT_ITEM_POSITION,i);
                    startActivityForResult(j,constient.REQUEST_CODE_ONE);
                }

            });
        }

    public void onClickAddRoom(View view)
    {
        Intent i = new  Intent(getApplicationContext(),names_FF.class);
        startActivityForResult(i,constient.REQUEST_CODE);

    }


}

