package com.dzone.module4.NSG;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dzone.module4.R;

import java.util.ArrayList;
import java.util.List;

public class NsgMartyrActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private NsgMartyrAdapter adapter;
    private List<NsgMartyrRecyclerItems> listItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nsg_martyr);

        recyclerView= (RecyclerView)findViewById(R.id.nsg_martyr_recycler);
        listItems = new ArrayList<>();
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        int[] pic = new int[]{
            R.drawable.lt_col_niranjan_e_k,
            R.drawable.gajendra_singh,
            R.drawable.sandeep_unnikrishan
        };
        listItems.add(new NsgMartyrRecyclerItems(pic[0],"Niranjan E. K."));
        listItems.add(new NsgMartyrRecyclerItems(pic[1],"Gajendra Singh"));
        listItems.add(new NsgMartyrRecyclerItems(pic[2],"Sandeep Unnikrishan"));
        adapter = new NsgMartyrAdapter(listItems,this);
        recyclerView.setAdapter(adapter);
    }
}
