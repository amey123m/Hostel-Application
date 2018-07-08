package com.example.amey.hostelapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hostel extends AppCompatActivity {

    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hostel);

        b1=(Button)findViewById(R.id.boys);
        b2=(Button)findViewById(R.id.girls);
    }

    public void onClickBoys(View view)
    {
        Intent boys=new Intent(getApplicationContext(),Boys_Hostel_Selection.class);
        startActivity(boys);
    }
    public void onClickGirls(View view)
    {
        Intent girls =new Intent(getApplicationContext(),RoomAllotmentGrils.class);
        startActivity(girls);
    }
}
