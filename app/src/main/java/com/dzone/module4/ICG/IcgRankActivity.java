package com.dzone.module4.ICG;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dzone.module4.AR.ArRankAdapter;
import com.dzone.module4.AR.ArRankRecyclerItems;
import com.dzone.module4.R;

import java.util.ArrayList;
import java.util.List;

public class IcgRankActivity extends AppCompatActivity {

    private IcgRankAdapter adapter;
    private RecyclerView recyclerView;
    private List<IcgRankRecyclerItems> itemsList;
    String rank[] = {"Director-General",
            "Special Director-General",
            "Additional Director-General",
            "Inspector-General",
            "Deputy Inspector-General",
            "Commandant",
            "Commandant (Junior Grade)",
            "Deputy Commandant",
            "Assistant Commandant (2 Years)",
            "Assistant Commandant"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icg_rank);

        recyclerView = (RecyclerView)findViewById(R.id.icg_rank_recycler);
        itemsList = new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        for(String a:rank){
            itemsList.add(new IcgRankRecyclerItems(a));
        }
        adapter = new IcgRankAdapter(itemsList,this);
        recyclerView.setAdapter(adapter);
    }
}
