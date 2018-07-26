package com.dzone.module4;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.dzone.module4.CRPF.CRPFactivity;
import com.dzone.module4.SFF.SFFactivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MainAdapter adapter;
    private List<MainRecyclerItems> listItems;
    private String name[] = {"Indian Coast Guard",
        "Assam Rifles",
        "Special Frontier Force",
        "Central Reserve Police Force",
        "Border Security Force",
        "Indo-Tibetan Border Police",
        "Sashastra Seema Bal",
        "Central Industrial Security Force",
        "National Security Guard",
        "Special Protection Group",
        "Railway Protection Force",
        "National Disaster Response Force"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= (RecyclerView)findViewById(R.id.other_menu_recycler);
        listItems = new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        int[] pic = new int[]{
                R.drawable.icg,
                R.drawable.ar,
                R.drawable.sff,
                R.drawable.crpf,
                R.drawable.bsf,
                R.drawable.indo,
                R.drawable.seema,
                R.drawable.cisf,
                R.drawable.nsg,
                R.drawable.spg,
                R.drawable.rpf,
                R.drawable.ndrf
        };
        for(int i=0;i<12;i++)
        {
            listItems.add(new MainRecyclerItems(pic[i],name[i]));
        }
        adapter = new MainAdapter(listItems,this);
        recyclerView.setAdapter(adapter);

    }
}