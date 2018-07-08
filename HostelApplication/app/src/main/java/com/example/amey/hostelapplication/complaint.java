package com.example.amey.hostelapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.ArrayList;

public class complaint extends AppCompatActivity {

    ListView l1;
    Button b1;
    public ArrayList<String> complaint=new ArrayList<>();
    private Firebase mref;
    private View llayout1;
    //String[] value1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint);
        Firebase.setAndroidContext(this);
        //alue1=new String[]{};
        b1=(Button)findViewById(R.id.save);
        mref= new Firebase("https://hostelapplication-e9def.firebaseio.com/complaints");

        l1=(ListView)findViewById(R.id.Complaints1);

        //final customAdapter customAdapter=new customAdapter();

        final ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,complaint);
        l1.setAdapter(arrayAdapter);

        mref.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String value=dataSnapshot.getValue(String.class);
                complaint.add(value);
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
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String state= Environment.getExternalStorageState();
                if(!Environment.MEDIA_MOUNTED.equals(state))
                {
                    Toast.makeText(complaint.this,"NOyhing Happend",Toast.LENGTH_SHORT).show();
                }
                File pdfDir=new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS),"MyApp");
                if(!pdfDir.exists())
                {
                    pdfDir.mkdir();
                }
                Bitmap screen;
                View v1=l1;
                v1.setDrawingCacheEnabled(true);
                screen=Bitmap.createBitmap(l1.getDrawingCache());
                l1.setDrawingCacheEnabled(false);
                File pdfFile = new File(pdfDir,"complaint.pdf");
                try
                {
                    Document document=new Document();
                    PdfWriter.getInstance(document,new FileOutputStream(pdfDir));
                    document.open();
                    ByteArrayOutputStream stream =new ByteArrayOutputStream();
                    screen.compress(Bitmap.CompressFormat.JPEG,100,stream);
                    byte[] byteArray =stream.toByteArray();
                    addImage(document,byteArray);
                    document.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
                /*Intent email=new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL,"RECIVER ID");
                email.putExtra(Intent.EXTRA_SUBJECT,"COMPLAINTS");
                email.putExtra(Intent.EXTRA_TEXT,"email body");
                Uri uri= Uri.fromFile(new File(pdfDir,"complaint.pdf"));
                email.putExtra(Intent.EXTRA_STREAM,uri);
                email.setType("hostelapplication/pdf");
                email.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(email);*/
            }
        });
    }
    private static void addImage(Document document,byte[] byteArray)
    {
        Image image=null;
        try{
            image=Image.getInstance(byteArray);
        }
        catch (BadElementException e)
        {
            e.printStackTrace();
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            document.add(image);
        }
        catch (DocumentException e)
        {
            e.printStackTrace();
        }
    }
    /*public class customAdapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return complaint.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view=getLayoutInflater().inflate(R.layout.custom_complaints,null);

            TextView comp=(TextView)findViewById(R.id.complaint_name);
            Button done=(Button)findViewById(R.id.done);
            Button notdone=(Button)findViewById(R.id.notdone);

            comp.setText(value);
            Log.i("complaint", String.valueOf(comp));
            return view;

        }
    }*/


}
