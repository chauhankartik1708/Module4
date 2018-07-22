package com.dzone.module4.SPG;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dzone.module4.NDRF.NdrfActivity;
import com.dzone.module4.NDRF.NdrfHistoryActivity;
import com.dzone.module4.R;

public class SpgActivity extends AppCompatActivity {
    Button about,organ,hist,award,mission;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spg);

        hist = (Button)findViewById(R.id.spg_history);
        hist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SpgActivity.this,SpgHistoryActivity.class));
            }
        });

        organ = (Button)findViewById(R.id.spg_organisation);
        organ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SpgActivity.this,SpgOrganActivity.class));
            }
        });

        about = (Button)findViewById(R.id.spg_about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SpgActivity.this,SpgAboutActivity.class));
            }
        });

        mission = (Button)findViewById(R.id.spg_mission);
        mission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SpgActivity.this,SpgMissionActivity.class));
            }
        });

        award = (Button)findViewById(R.id.spg_awards);
        award.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://spg.nic.in/awards.html"));
                startActivity(i);
            }
        });
    }
}
