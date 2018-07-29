package com.dzone.module4;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Others extends Fragment{
    private RecyclerView recyclerView;
    private MainAdapter adapter;
    private List<MainRecyclerItems> listItems;
    private String name[] = {"Indian Coast Guard",
            "Assam Rifles",
            "Special Frontier Force",
            "Central Reserve Police Force",
            "Border Security Force",
            "Indo-Tibetan Border Police",
            "Sashastra Seema Bal",
            "Central Industrial Security Force",
            "National Security Guard",
            "Special Protection Group",
            "Railway Protection Force",
            "National Disaster Response Force"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.other, container, false);
        recyclerView= (RecyclerView)rootView.findViewById(R.id.other_menu_recycler);
        listItems = new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        int[] pic = new int[]{
                R.drawable.icg,
                R.drawable.ar,
                R.drawable.sff,
                R.drawable.crpf,
                R.drawable.bsf,
                R.drawable.indo,
                R.drawable.seema,
                R.drawable.cisf,
                R.drawable.nsg,
                R.drawable.spg,
                R.drawable.rpf,
                R.drawable.ndrf
        };
        for(int i=0;i<12;i++)
        {
            listItems.add(new MainRecyclerItems(pic[i],name[i]));
        }
        adapter = new MainAdapter(listItems,this);
        recyclerView.setAdapter(adapter);
        return rootView;
    }
}
