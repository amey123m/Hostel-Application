package com.example.amey.hostelapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Boys_Hostel_Selection extends AppCompatActivity {

    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boys__hostel__selection);
        b1=(Button)findViewById(R.id.addnames);
        b2=(Button)findViewById(R.id.roomallot);
    }
    public void onClickAddName(View view)
    {
        Intent addnames=new Intent(getApplicationContext(),names_boys.class);
        startActivity(addnames);
    }
    public void onClickRoomAllot(View view)
    {
        Intent roomallot=new Intent(getApplicationContext(),RoomAllotmentBoys.class);
        startActivity(roomallot);
    }
}
