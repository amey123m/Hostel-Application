package com.example.amey.hostelapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

import java.util.ArrayList;

public class RoomAllotmentBoys extends AppCompatActivity {

    Button b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,badd;
    ListView lv1;
    private ArrayList<String> allotment =new ArrayList<>();
    private Firebase mref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_alltment);
        Firebase.setAndroidContext(this);
        //initialize Buttons
        b2=(Button)findViewById(R.id.floor2);
        b3=(Button)findViewById(R.id.floor3);
        b4=(Button)findViewById(R.id.floor4);
        b5=(Button)findViewById(R.id.floor5);
        b6=(Button)findViewById(R.id.floor6);
        b7=(Button)findViewById(R.id.floor7);
        b8=(Button)findViewById(R.id.floor8);
        b9=(Button)findViewById(R.id.floor9);
        b10=(Button)findViewById(R.id.floor10);
        b11=(Button)findViewById(R.id.floor11);
        //b12=(Button)findViewById(R.id.floor12);
        //initialize list view
        lv1=(ListView)findViewById(R.id.Allot);


    }
    //see allotment for second floor
    public void onClickS(View view)
    {

        mref= new Firebase("https://hostelapplication-e9def.firebaseio.com/Second_Floor_Boys");
        final ArrayAdapter<String> secondfloor=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,allotment);
        allotment.clear();
        lv1.setAdapter(secondfloor);

        mref.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String second_floor_data=dataSnapshot.getValue(String.class);
                allotment.add(second_floor_data);
                secondfloor.notifyDataSetChanged();
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
    }
    public void onClickT(View view)
    {
        Firebase mref1= new Firebase("https://hostelapplication-e9def.firebaseio.com/Third_Floor_Boys");
        final ArrayAdapter<String> thirdfloor=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,allotment);
        lv1.setAdapter(thirdfloor);
        allotment.clear();

        mref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String second_floor_data=dataSnapshot.getValue(String.class);
                allotment.add(second_floor_data);
                thirdfloor.notifyDataSetChanged();
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
    }
    public void onClickF(View view)
    {
        Firebase mref4= new Firebase("https://hostelapplication-e9def.firebaseio.com/Fourth_Floor_Boys");
        final ArrayAdapter<String> fourthfloor=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,allotment);
        lv1.setAdapter(fourthfloor);
        allotment.clear();
        mref4.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String floor_data=dataSnapshot.getValue(String.class);
                allotment.add(floor_data);
                fourthfloor.notifyDataSetChanged();
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
    }
    public void onClickFi(View view)
    {
        Firebase mref5= new Firebase("https://hostelapplication-e9def.firebaseio.com/Fifth_Floor_Boys");
        final ArrayAdapter<String> fifthfloor=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,allotment);
        lv1.setAdapter(fifthfloor);
        allotment.clear();
        mref5.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String floor_data=dataSnapshot.getValue(String.class);
                allotment.add(floor_data);
                fifthfloor.notifyDataSetChanged();
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
    }
    public void onClickSi(View view)
    {
        Firebase mref6= new Firebase("https://hostelapplication-e9def.firebaseio.com/Sixth_Floor_Boys");
        final ArrayAdapter<String> sixthfloor=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,allotment);
        lv1.setAdapter(sixthfloor);
        allotment.clear();
        mref6.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String floor_data=dataSnapshot.getValue(String.class);
                allotment.add(floor_data);
                sixthfloor.notifyDataSetChanged();
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
    }
    public void onClickSe(View view)
    {
        Firebase mref7= new Firebase("https://hostelapplication-e9def.firebaseio.com/Seventh_Floor_Boys");
        final ArrayAdapter<String> seventhfloor=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,allotment);
        lv1.setAdapter(seventhfloor);
        allotment.clear();
        mref7.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String floor_data=dataSnapshot.getValue(String.class);
                allotment.add(floor_data);
                seventhfloor.notifyDataSetChanged();
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
    }
    public void onClickE(View view)
    {
        Firebase mref8= new Firebase("https://hostelapplication-e9def.firebaseio.com/Eighth_Floor_Boys");
        final ArrayAdapter<String> eighthfloor=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,allotment);
        lv1.setAdapter(eighthfloor);
        allotment.clear();
        mref8.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String floor_data=dataSnapshot.getValue(String.class);
                allotment.add(floor_data);
                eighthfloor.notifyDataSetChanged();
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
    }
    public void onClickN(View view)
    {
        Firebase mref9= new Firebase("https://hostelapplication-e9def.firebaseio.com/Ninth_Floor_Boys");
        final ArrayAdapter<String> ninthfloor=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,allotment);
        lv1.setAdapter(ninthfloor);
        allotment.clear();
        mref9.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String floor_data=dataSnapshot.getValue(String.class);
                allotment.add(floor_data);
                ninthfloor.notifyDataSetChanged();
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
    }
    public void onClickTe(View view)
    {
        Firebase mref10= new Firebase("https://hostelapplication-e9def.firebaseio.com/Tenth_Floor_Boys");
        final ArrayAdapter<String> tenthfloor=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,allotment);
        lv1.setAdapter(tenthfloor);
        allotment.clear();
        mref10.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String floor_data=dataSnapshot.getValue(String.class);
                allotment.add(floor_data);
                tenthfloor.notifyDataSetChanged();
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
    }
    public void onClickEl(View view)
    {
        Firebase mref11= new Firebase("https://hostelapplication-e9def.firebaseio.com/Eleventh_Floor_Boys");
        final ArrayAdapter<String> eleventhfloor=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,allotment);
        lv1.setAdapter(eleventhfloor);
        allotment.clear();
        mref11.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String floor_data=dataSnapshot.getValue(String.class);
                allotment.add(floor_data);
                eleventhfloor.notifyDataSetChanged();
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
    }

}
