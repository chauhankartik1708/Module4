package com.dzone.module4.BSF;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dzone.module4.R;

public class BSFactivity extends AppCompatActivity {
    Button hist,ranks;

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
    }
}
