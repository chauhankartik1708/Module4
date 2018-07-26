package com.dzone.module4.ICG;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dzone.module4.AR.ArActivity;
import com.dzone.module4.AR.ArHistoryActivity;
import com.dzone.module4.R;

public class IcgActivity extends AppCompatActivity {
    Button about,hist,mission,rank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icg);

        hist = (Button)findViewById(R.id.icg_history);
        hist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IcgActivity.this,IcgHistoryActivity.class));
            }
        });

        about = (Button)findViewById(R.id.icg_about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IcgActivity.this,IcgAboutActivity.class));
            }
        });

        mission = (Button)findViewById(R.id.icg_mission);
        mission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IcgActivity.this,IcgMissionActivity.class));
            }
        });

        rank = (Button)findViewById(R.id.icg_ranks);
        rank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IcgActivity.this,IcgRankActivity.class));
            }
        });
    }
}
