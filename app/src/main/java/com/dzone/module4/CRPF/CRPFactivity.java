package com.dzone.module4.CRPF;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dzone.module4.R;

public class CRPFactivity extends AppCompatActivity {
    Button about,history,ranks,martyrs,gallantry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crpfactivity);

        about = (Button)findViewById(R.id.crpf_about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CRPFactivity.this,CRPFaboutActivity.class));
            }
        });
    }
}
