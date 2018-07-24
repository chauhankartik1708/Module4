package com.dzone.module4.ITBP;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.dzone.module4.R;

import java.util.ArrayList;
import java.util.List;

public class ITBPranksActivity extends AppCompatActivity {
    private RecyclerView recyclerView1;
    private ITBPrankAdapter adapter1;
    private List<ITBPrankRecyclerItems> listItems1;

    private String rank1[] = {"DG (Director General)","ADG (Additional Director General)","DIG (Deputy Inspector General)","Commandant",
            "Second-In-Commandant","DC (Deputy Commandant)","Assistant Commandant","Subedar Major","Inspector","SI (Sub-Inspector)",
            "ASI (Assistant Sub Inspector)","HC (Head Constable)","Constable"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itbpranks);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(android.support.v7.appcompat.R.drawable.abc_ic_ab_back_material);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onBackPressed();
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://recruitment.itbpolice.nic.in/"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        recyclerView1 = (RecyclerView)findViewById(R.id.itbp_rank_recycler1);


        listItems1 = new ArrayList<>();
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        for(String a:rank1){
            listItems1.add(new ITBPrankRecyclerItems(a));
        }
        adapter1 = new ITBPrankAdapter(listItems1,this);
        recyclerView1.setAdapter(adapter1);
    }
}
