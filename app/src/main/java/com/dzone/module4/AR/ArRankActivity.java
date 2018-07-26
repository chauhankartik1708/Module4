package com.dzone.module4.AR;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dzone.module4.R;
import com.dzone.module4.RPF.RpfRankAdapter;
import com.dzone.module4.RPF.RpfRankRecyclerItems;

import java.util.ArrayList;
import java.util.List;

public class ArRankActivity extends AppCompatActivity {

    private ArRankAdapter adapter;
    private RecyclerView recyclerView;
    private List<ArRankRecyclerItems> itemsList;
    String rank[] = {"Director General (Army officer on deputation)",
        "Inspector General (Army officer on deputation)",
        "Deputy Inspector General (Army officer on deputation)",
        "Commandant (Army Officer on deputation)",
        "Second in Command",
        "Deputy Commandant",
        "Assistant Commandant"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar_rank);

        recyclerView = (RecyclerView)findViewById(R.id.ar_rank_recycler);
        itemsList = new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        for(String a:rank){
            itemsList.add(new ArRankRecyclerItems(a));
        }
        adapter = new ArRankAdapter(itemsList,this);
        recyclerView.setAdapter(adapter);
    }
}
