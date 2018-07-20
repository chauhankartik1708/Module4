package com.dzone.module4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageButton ar,bsf,cisf,crsf,icg,itbp,ndrf,nsg,rpf,sff,spg,ssb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent in = new Intent(MainActivity.this,CategoryActivity.class);
        final Bundle b = new Bundle();
        nsg = (ImageButton)findViewById(R.id.nsg);
        nsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b.putString("page","nsg");
                in.putExtras(b);
                startActivity(in);
            }
        });

        spg = (ImageButton)findViewById(R.id.spg);
        spg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b.putString("page","spg");
                in.putExtras(b);
                startActivity(in);
            }
        });

        rpf = (ImageButton)findViewById(R.id.rpf);
        rpf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b.putString("page","rpf");
                in.putExtras(b);
                startActivity(in);
            }
        });

        ndrf = (ImageButton)findViewById(R.id.ndrf);
        ndrf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b.putString("page","ndrf");
                in.putExtras(b);
                startActivity(in);
            }
        });


    }
}
