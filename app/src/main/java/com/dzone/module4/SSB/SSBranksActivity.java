package com.dzone.module4.SSB;

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

public class SSBranksActivity extends AppCompatActivity {
    private RecyclerView recyclerView1,recyclerView2;
    private SSBranksAdapter adapter1,adapter2;
    private List<SSBrankRecyclerItems> listItems1,listItems2;

    private String rank1[] = {"Director-General (DG)","Special Director","Additional Director-General (ADG)","Inspector-General (IG)",
            "Deputy Inspector-General (DIG)","Commandant","Second-in-Command","Deputy Commandant (DC)","Assistant Commandant (AC)"};

    private String rank2[] = {"Inspector","Sub-Inspector (SI)","Assistant Sub-Inspector (ASI)","Head Constable (HC)","Constable","Tradesmen"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ssbranks);
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
                Uri uri = Uri.parse("http://www.ssbrectt.gov.in/recruitments.aspx"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        recyclerView1 = (RecyclerView)findViewById(R.id.ssb_rank_recycler1);


        listItems1 = new ArrayList<>();
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        for(String a:rank1){
            listItems1.add(new SSBrankRecyclerItems(a));
        }
        adapter1 = new SSBranksAdapter(listItems1,this);
        recyclerView1.setAdapter(adapter1);

        recyclerView2 = (RecyclerView)findViewById(R.id.ssb_rank_recycler2);


        listItems2 = new ArrayList<>();
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        for(String a:rank2){
            listItems2.add(new SSBrankRecyclerItems(a));
        }
        adapter2 = new SSBranksAdapter(listItems2,this);
        recyclerView2.setAdapter(adapter2);
    }
}
