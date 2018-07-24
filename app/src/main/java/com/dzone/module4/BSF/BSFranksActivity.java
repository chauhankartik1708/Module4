package com.dzone.module4.BSF;

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

public class BSFranksActivity extends AppCompatActivity {
    private RecyclerView recyclerView1,recyclerView2,recyclerView3;
    private bsfRankAdapter adapter1,adapter2,adapter3;
    private List<BsfRankRecyclerItems> listItems1,listItems2,listItems3;
    private String rank1[] = {"Assistant Commandant","Deputy Commandant","Second-in-Command","Commandant","Deputy Inspector General",
            "Inspector General", "Additional Director General","Special Director General","Director General"};

    private String rank2[] ={"Constable","Head Constable","Assistant Sub Inspector","Sub Inspector","Inspector","Subedar Major"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsfranks);
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
                Uri uri = Uri.parse("http://bsf.nic.in/en/recruitment.html"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

        recyclerView1 = (RecyclerView)findViewById(R.id.bsf_rank_recycler1);
        recyclerView2 = (RecyclerView)findViewById(R.id.bsf_rank_recycler2);

        listItems1 = new ArrayList<>();
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        for(String a:rank1){
            listItems1.add(new BsfRankRecyclerItems(a));
        }
        adapter1 = new bsfRankAdapter(listItems1,this);
        recyclerView1.setAdapter(adapter1);

        listItems2 = new ArrayList<>();
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        for(String a:rank2){
            listItems2.add(new BsfRankRecyclerItems(a));
        }
        adapter2 = new bsfRankAdapter(listItems2,this);
        recyclerView2.setAdapter(adapter2);
    }
}
