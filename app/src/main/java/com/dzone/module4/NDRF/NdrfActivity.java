package com.dzone.module4.NDRF;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dzone.module4.MainActivity;
import com.dzone.module4.R;

public class NdrfActivity extends AppCompatActivity {
    Button hist,about,rank,award,dis_res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ndrf);

        hist = (Button)findViewById(R.id.ndrf_history);
        hist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NdrfActivity.this,NdrfHistoryActivity.class));
            }
        });

        about = (Button)findViewById(R.id.ndrf_about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NdrfActivity.this,NdrfAboutActivity.class));
            }
        });

        rank = (Button)findViewById(R.id.ndrf_ranks);
        rank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NdrfActivity.this,NdrfRankActivity.class));
            }
        });

        award = (Button)findViewById(R.id.ndrf_awards);
        award.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://ndrf.gov.in/PPMG"));
                startActivity(i);
            }
        });

        dis_res = (Button)findViewById(R.id.ndrf_dis_res);
        dis_res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NdrfActivity.this,NdrfDisResActivity.class));
            }
        });
    }
}
