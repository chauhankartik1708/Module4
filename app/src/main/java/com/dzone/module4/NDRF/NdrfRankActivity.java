package com.dzone.module4.NDRF;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dzone.module4.NSG.NsgRankAdapter;
import com.dzone.module4.NSG.NsgRankRecyclerItems;
import com.dzone.module4.R;

import java.util.ArrayList;
import java.util.List;

public class NdrfRankActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private NdrfRankAdapter adapter;
    private List<NdrfRankRecyclerItems> itemsList;
    private String ranks[] = {"Director General",
            "Inspector General",
            "Deputy Inspector General",
            "Commandant",
            "Second-in-Command",
            "Deputy Commandant",
            "Assistant Commandant",
            "Subedar Major",
            "Inspector",
            "Sub-Inspector",
            "Asstt Sub Inspector",
            "Head Constable",
            "Constable"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ndrf_rank);

        recyclerView = (RecyclerView)findViewById(R.id.ndrf_rank_recycler);
        itemsList = new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        for(String a:ranks){
            itemsList.add(new NdrfRankRecyclerItems(a));
        }
        adapter = new NdrfRankAdapter(itemsList,this);
        recyclerView.setAdapter(adapter);
    }
}
