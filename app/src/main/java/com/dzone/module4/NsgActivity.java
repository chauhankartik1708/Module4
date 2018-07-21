package com.dzone.module4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NsgActivity extends AppCompatActivity {
    Button hist,mission,ranks,reg_dep,sel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nsg);

        hist = (Button)findViewById(R.id.nsg_history);
        hist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NsgActivity.this,NsgHistoryActivity.class));
            }
        });

        mission = (Button)findViewById(R.id.nsg_mission);
        mission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NsgActivity.this,NsgMissionActivity.class));
            }
        });

        ranks = (Button)findViewById(R.id.nsg_ranks);
        ranks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NsgActivity.this,NsgRankActivity.class));
            }
        });

        sel = (Button)findViewById(R.id.nsg_sel);
        sel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NsgActivity.this,NsgSelActivity.class));
            }
        });

        reg_dep = (Button)findViewById(R.id.nsg_reg_dep);
        reg_dep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NsgActivity.this,NsgRegDepActivity.class));
            }
        });
    }
}
