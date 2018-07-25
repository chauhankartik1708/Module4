package com.dzone.module4.CRPF;

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

public class CRPFranksActivity extends AppCompatActivity {
    private RecyclerView recyclerView1,recyclerView2;
    private CRPFranksAdapter adapter1,adapter2;
    private List<CRPFrankRecyclerItems> listItems1,listItems2;
    private String rank1[] = {"Director General","Additional Director General","Inspector General","Deputy Inspector General","Additional Deputy Inspector General",
    "Commandant","Second - in - Command","Deputy Commandant","Assistant Commandant"};
    private String rank2[] = {"Subedar Major","Inspector","Sub-Inspector","Asstt. Sub. Inspetor","Head Constable","Constable"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crpfranks);
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
                Uri uri = Uri.parse("https://crpf.gov.in/recruitment.htm"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        recyclerView1 = (RecyclerView)findViewById(R.id.crpf_rank_recycler1);


        listItems1 = new ArrayList<>();
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        for(String a:rank1){
            listItems1.add(new CRPFrankRecyclerItems(a));
        }
        adapter1 = new CRPFranksAdapter(listItems1,this);
        recyclerView1.setAdapter(adapter1);

        recyclerView2 = (RecyclerView)findViewById(R.id.crpf_rank_recycler2);


        listItems2 = new ArrayList<>();
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        for(String a:rank2){
            listItems2.add(new CRPFrankRecyclerItems(a));
        }
        adapter2 = new CRPFranksAdapter(listItems2,this);
        recyclerView2.setAdapter(adapter2);
    }
}
