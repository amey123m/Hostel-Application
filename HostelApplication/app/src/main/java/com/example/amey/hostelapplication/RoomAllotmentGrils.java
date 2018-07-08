package com.example.amey.hostelapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;

public class RoomAllotmentGrils extends AppCompatActivity {

    private Firebase mref;

    Button b1,b2,b3,b4,b5,b6,b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_allotment_grils);
        com.firebase.client.Firebase.setAndroidContext(this);


        b1 = (Button) findViewById(R.id.second_floor);
        b2 = (Button) findViewById(R.id.third_floor);
        b3 = (Button) findViewById(R.id.fourth_floor);
        b4 = (Button) findViewById(R.id.fifth_floor);


    }
    public void onClickSecondFloor(View view)
    {

        Intent i=new Intent(getApplicationContext(),Girls_Second_Floor.class);
        startActivity(i);
    }
    public void onClickThirdFloor(View view)
    {
        Intent i=new Intent(getApplicationContext(),Girls_Third_Floor.class);
        startActivity(i);
    }
    public void onClickFourthFloor(View view)
    {
        Intent i=new Intent(getApplicationContext(),Girls_Fourth_Floor.class);
        startActivity(i);
    }
    public void onClickFifthFloor(View view)
    {
        Intent i=new Intent(getApplicationContext(),Girls_Fifth_Floor.class);
        startActivity(i);
    }


}
