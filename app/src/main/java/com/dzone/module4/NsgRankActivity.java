package com.dzone.module4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NsgRankActivity extends AppCompatActivity {
    private RecyclerView recyclerView1,recyclerView2,recyclerView3;
    private NsgRankAdapter adapter1,adapter2,adapter3;
    private List<NsgRankRecyclerItems> listItems1,listItems2,listItems3;
    private String rank1[] = {"Director-General (Lieutenant-General)",
            "Additional Director-General (Lieutenant-General)",
            "Inspector-General (Major-General)",
            "Deputy Inspector-General (Brigadier)",
            "Group Commander (Colonel)",
            "Squadron Commander (Lieutenant-Colonel)",
            "Team Commander (Major/Capt)"};
    private String rank2[] = {"Assistant Commander Grade I (Subedar Major)","Assistant Commander Grade II (Subedar)","Assistant Commander Grade III (Naib Subedar)"};
    private String rank3[] = {"Ranger Grade I","Ranger Grade II","Combatised tradesmen"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nsg_rank);

        recyclerView1 = (RecyclerView)findViewById(R.id.nsg_rank_recycler1);
        recyclerView2 = (RecyclerView)findViewById(R.id.nsg_rank_recycler2);
        recyclerView3 = (RecyclerView)findViewById(R.id.nsg_rank_recycler3);

        listItems1 = new ArrayList<>();
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        for(String a:rank1){
            listItems1.add(new NsgRankRecyclerItems(a));
        }
        adapter1 = new NsgRankAdapter(listItems1,this);
        recyclerView1.setAdapter(adapter1);

        listItems2 = new ArrayList<>();
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        for(String a:rank2){
            listItems2.add(new NsgRankRecyclerItems(a));
        }
        adapter2 = new NsgRankAdapter(listItems2,this);
        recyclerView2.setAdapter(adapter2);

        listItems3 = new ArrayList<>();
        recyclerView3.setLayoutManager(new LinearLayoutManager(this));
        for(String a:rank3){
            listItems3.add(new NsgRankRecyclerItems(a));
        }
        adapter3 = new NsgRankAdapter(listItems3,this);
        recyclerView3.setAdapter(adapter3);
    }
}
