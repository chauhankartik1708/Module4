package com.dzone.module4.SFF;

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

public class SFFequipmentsActivity extends AppCompatActivity {
    private RecyclerView recyclerView1;
    private SFFequipmentAdapter adapter1;
    private List<SFFequipmentRecyclerItems> listItems1;

    private String equipment[] = {"M4A1 Carbine","MPi KMS-72 East Germany made side-folded Kalashnikov Rifle","FN SCAR Assault Rifle",
    "SVD Dragunov Semi-automatic Sniper Rifle","IWI Galil Sniper Semi-automatic Sniper Rifle","Mauser SP66 Bolt-action Sniper Rifle",
    "PKM General Purpose Machine Gun","Uk vz. 59L Light Machine Gun","Taser Gun","MG 2A1 General Purpose Machine Gun","AGS-17 Plamya Automatic Grenade Launcher",
    "C-90-CR-RB (M3) Disposal Rocket Launcher","RL MkIII 84mm Recoilles Rifle","B-300 Shipon 82mm Rocket Launcher","Advance Audio Communication Set",
    "GPS & GPRS Technological Systems","Special Tactical Gears","Thermal Imaging Cameras","Ghillie suit"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sffequipments);
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
                Uri uri = Uri.parse("https://bootcampmilitaryfitnessinstitute.com/elite-special-forces/indian-elite-special-forces/indian-special-frontier-force-sff/"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        recyclerView1 = (RecyclerView)findViewById(R.id.sff_rank_recycler1);


        listItems1 = new ArrayList<>();
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        for(String a:equipment){
            listItems1.add(new SFFequipmentRecyclerItems(a));
        }
        adapter1 = new SFFequipmentAdapter(listItems1,this);
        recyclerView1.setAdapter(adapter1);
    }
}
