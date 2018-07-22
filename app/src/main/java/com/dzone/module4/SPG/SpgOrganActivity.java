package com.dzone.module4.SPG;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dzone.module4.NSG.NsgOperationAdapter;
import com.dzone.module4.NSG.NsgOperationRecyclerItems;
import com.dzone.module4.R;

import java.util.ArrayList;
import java.util.List;

public class SpgOrganActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private SpgOrganAdapter adapter;
    private List<SpgOrganRecyclerItems> listItems;
    String title[] = {"Operations","Training","Intelligence and Tours","Administration"};
    String desc[] = {"Looks after the actual protection duties. In the Operations Branch, there are components like the Communications Wing, Technical Wing and Transport Wing.",
            "Deals with the training of personnel on a continuous basis. The SPG imparts training in physical efficiency, marksmanship, anti-sabotage checks, communication and other operative aspects connected with close protection drills and having a bearing on VVIP security with a view to maintaining a high level of physical fitness and to fine-tune the operational skills of SPG Officers. The training programme is constantly reviewed and updated to effectively thwart threats from newer areas and in keeping with existing threat perception.",
            "Threat assessment, internal intelligence pertaining to personnel, verification of character and antecedents, tours and other allied jobs.",
            "Deals with personnel, finance, procurement and other related matters."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spg_organ);

        recyclerView = (RecyclerView)findViewById(R.id.spg_organ_recycler);

        listItems = new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        for(int i=0;i<title.length;i++){
            String a = title[i];
            String b = desc[i];
            listItems.add(new SpgOrganRecyclerItems(a,b));
        }
        adapter = new SpgOrganAdapter(listItems,this);
        recyclerView.setAdapter(adapter);
    }
}
