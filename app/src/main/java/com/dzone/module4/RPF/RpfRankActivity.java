package com.dzone.module4.RPF;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dzone.module4.NDRF.NdrfRankAdapter;
import com.dzone.module4.NDRF.NdrfRankRecyclerItems;
import com.dzone.module4.R;
import com.dzone.module4.RPF.RpfRankAdapter;
import com.dzone.module4.RPF.RpfRankRecyclerItems;

import java.util.ArrayList;
import java.util.List;

public class RpfRankActivity extends AppCompatActivity {

    private RecyclerView recyclerView1,recyclerView2;
    private RpfRankAdapter adapter1,adapter2;
    private List<RpfRankRecyclerItems> itemsList1,itemsList2;

    String rank1[] = {"Director General",
            "Additional Director General",
            "Chief Security Commissioner (Inspector-General; Additional Inspector-General; Deputy Inspector-General)",
    "Additional or Deputy Chief Security Commissioner",
    "Senior Divisional Security Commissioner",
    "Divisional Security Commissioner",
    "Assistant Security Commissioner"};

    String rank2[] = {"Inspector",
            "Sub-Inspector",
            "Assistant Sub-Inspector",
            "Head Constable",
            "Naik",
            "Constables",
            "Cook/ sweeper / Driver / Fire Extinguisher",
            "Ancillary staff"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpf_rank);

        recyclerView1 = (RecyclerView)findViewById(R.id.rpf_rank_recycler1);
        itemsList1 = new ArrayList<>();
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        for(String a:rank1){
            itemsList1.add(new RpfRankRecyclerItems(a));
        }
        adapter1 = new RpfRankAdapter(itemsList1,this);
        recyclerView1.setAdapter(adapter1);

        recyclerView2 = (RecyclerView)findViewById(R.id.rpf_rank_recycler2);
        itemsList2 = new ArrayList<>();
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        for(String a:rank2){
            itemsList2.add(new RpfRankRecyclerItems(a));
        }
        adapter2 = new RpfRankAdapter(itemsList2,this);
        recyclerView2.setAdapter(adapter2);
    }
}
