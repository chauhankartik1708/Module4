package com.dzone.module4.BSF;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.dzone.module4.R;

public class BSFactivity extends AppCompatActivity {
    Button hist,ranks,martyrs,award,about;

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
                ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network

                    Uri uri = Uri.parse("http://bsf.nic.in/doc/honours/pmg2.pdf"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else
//                    Toast.makeText(BSFactivity.this,"Check your internet connection !",Toast.LENGTH_SHORT).show();
                    Snackbar.make(view, "You're not connected to internet. Check your internet connection !", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

            }
        });

        about = (Button)findViewById(R.id.bsf_about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BSFactivity.this,BSFaboutActivity.class));
            }
        });
    }
}
