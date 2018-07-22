package com.dzone.module4.RPF;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dzone.module4.R;

public class RpfActivity extends AppCompatActivity {
    Button about,hist,rank,martyr,award;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpf);

        about = (Button)findViewById(R.id.rpf_about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RpfActivity.this,RpfAboutActivity.class));
            }
        });

        hist = (Button)findViewById(R.id.rpf_history);
        hist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RpfActivity.this,RpfHistoryActivity.class));
            }
        });

        martyr = (Button)findViewById(R.id.rpf_martyrs);
        martyr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/security/downloads/2016/Martyrs_list.pdf"));
                startActivity(i);
            }
        });

        award = (Button)findViewById(R.id.rpf_awards);
        award.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/security/downloads/2017/Gallantary%20Medal.pdf"));
                startActivity(i);
            }
        });

        rank = (Button)findViewById(R.id.rpf_ranks);
        rank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RpfActivity.this,RpfRankActivity.class));
            }
        });
    }
}
