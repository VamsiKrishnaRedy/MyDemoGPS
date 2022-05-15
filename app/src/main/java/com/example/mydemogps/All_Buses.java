package com.example.mydemogps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class All_Buses extends AppCompatActivity {


    ArrayList<MyListData> listData;
   // private  MyAdapter.RecyclerViewClickListener listener;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_buses);
        listData = new ArrayList<>();
         listData.add(new MyListData("UPPAL","JBIET","MEHDIPATNAM","Route Number:1"));
         listData.add(new MyListData("LB NAGAR","JBIET","KONDAPUR","Route Number:2"));
         listData.add(new MyListData("MALAKPET","JBIET","MIDHANI","Route Number:3"));
         listData.add(new MyListData("ECIL","JBIET","SHENOY","Route Number:4"));
         listData.add(new MyListData("ALWAL","JBIET","KHARKANA","Route Number:5"));
         listData.add(new MyListData("MOULALI","JBIET","RTC X ROADS","Route Number:6"));
         listData.add(new MyListData("YOUSUFGUDA","JBIET","BANJARA HILLS","Route Number:7"));
         listData.add(new MyListData("SR NAGAR","JBIET","MEHDIPATNAM","Route Number:8"));
         listData.add(new MyListData("LINGAMPALLY","JBIET","KONAPUR","Route Number:9"));
        listData.add(new MyListData("NIZAMPET","JBIET","KONDAPUR","Route Number:10"));




        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycleview);
        MyAdapter adapter = new MyAdapter(listData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        /*listener=new MyAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {

                Toast.makeText(,"The selected bus is",Toast.LENGTH_LONG).show();
                *//*Intent intent=new Intent(getApplicationContext(),MapsActivity.class);
                intent.putExtra("Bus Number",listData.get(position).getRoute_number());
                startActivity(intent);*//*
            }
        };*/


    }
}