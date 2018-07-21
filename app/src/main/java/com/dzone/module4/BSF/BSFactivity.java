package com.dzone.module4.BSF;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dzone.module4.R;

public class BSFactivity extends AppCompatActivity {
    Button hist,ranks,martyrs,award;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsfactivity);

        hist = (Button)findViewById(R.id.bsf_history);
        hist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BSFactivity.this,BSFmissionActivity.class));
            }
        });

        ranks = (Button)findViewById(R.id.bsf_ranks);
        ranks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BSFactivity.this,BSFranksActivity.class));
            }
        });

        martyrs = (Button)findViewById(R.id.bsf_martyrs);
        martyrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BSFactivity.this,BSFmartyrsActivity.class));
            }
        });

        award = (Button)findViewById(R.id.award);
        award.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://bsf.nic.in/doc/honours/pmg2.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}
