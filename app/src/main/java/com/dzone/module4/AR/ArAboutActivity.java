package com.dzone.module4.AR;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.dzone.module4.R;

public class ArAboutActivity extends AppCompatActivity {

    TextView link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar_about);

        link = (TextView)findViewById(R.id.ar_web_link);
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("assamrifles.gov.in"));
                startActivity(i);
            }
        });
    }
}
