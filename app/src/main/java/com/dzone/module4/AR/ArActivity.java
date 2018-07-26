package com.dzone.module4.AR;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dzone.module4.NSG.NsgActivity;
import com.dzone.module4.NSG.NsgHistoryActivity;
import com.dzone.module4.R;

public class ArActivity extends AppCompatActivity {
    Button about,hist,org,rank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar);

        hist = (Button)findViewById(R.id.ar_history);
        hist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ArActivity.this,ArHistoryActivity.class));
            }
        });

        about = (Button)findViewById(R.id.ar_about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ArActivity.this,ArAboutActivity.class));
            }
        });

        org = (Button)findViewById(R.id.ar_organ_struct);
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ArActivity.this,ArOrganStructActivity.class));
            }
        });

        rank = (Button)findViewById(R.id.ar_ranks);
        rank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ArActivity.this,ArRankActivity.class));
            }
        });
    }
}
