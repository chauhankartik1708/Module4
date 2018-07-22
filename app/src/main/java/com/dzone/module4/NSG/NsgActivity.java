package com.dzone.module4.NSG;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dzone.module4.R;

public class NsgActivity extends AppCompatActivity {
    Button hist,martyrs,ranks,about,op;

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

        martyrs = (Button)findViewById(R.id.nsg_martyrs);
        martyrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.nsg.gov.in/our-martyrs/veer-gatha"));
                startActivity(i);
            }
        });

        about = (Button)findViewById(R.id.nsg_about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NsgActivity.this,NsgAboutActivity.class));
            }
        });

        ranks = (Button)findViewById(R.id.nsg_ranks);
        ranks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NsgActivity.this,NsgRankActivity.class));
            }
        });

        op = (Button)findViewById(R.id.nsg_operations);
        op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NsgActivity.this,NsgOperationActivity.class));
            }
        });

    }
}
