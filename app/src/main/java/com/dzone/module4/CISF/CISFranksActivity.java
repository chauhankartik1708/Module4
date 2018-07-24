package com.dzone.module4.CISF;

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

public class CISFranksActivity extends AppCompatActivity {
    private RecyclerView recyclerView1,recyclerView2;
    private CISFrankAdapter adapter1,adapter2;
    private List<CISFrankRecyclerItems> listItems1,listItems2;

    private String rank1[] = {"Director-General (DG)","Additional Director General","Inspector-General (IG)",
            "Deputy Inspector-General (DIG)","Additional Deputy Inspector-General","Commandant","Deputy Commandant (DC)","Assistant Commandant (AC)"};

    private String rank2[] = {"Subedar major","Inspector","Sub-Inspector (SI)","Assistant Sub-Inspector (ASI)","Head Constable (HC)","Constable","Tradesmen"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cisfranks);
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
                Uri uri = Uri.parse("https://www.cisf.gov.in/recruitment/"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        recyclerView1 = (RecyclerView)findViewById(R.id.cisf_rank_recycler1);


        listItems1 = new ArrayList<>();
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        for(String a:rank1){
            listItems1.add(new CISFrankRecyclerItems(a));
        }
        adapter1 = new CISFrankAdapter(listItems1,this);
        recyclerView1.setAdapter(adapter1);

        recyclerView2 = (RecyclerView)findViewById(R.id.cisf_rank_recycler2);


        listItems2 = new ArrayList<>();
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        for(String a:rank2){
            listItems2.add(new CISFrankRecyclerItems(a));
        }
        adapter2 = new CISFrankAdapter(listItems2,this);
        recyclerView2.setAdapter(adapter2);


    }
}
