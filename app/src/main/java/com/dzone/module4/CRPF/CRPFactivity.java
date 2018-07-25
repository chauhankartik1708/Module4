package com.dzone.module4.CRPF;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.design.widget.Snackbar;
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

        history = (Button)findViewById(R.id.crpf_history);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CRPFactivity.this,CRPFhistoryActivity.class));
            }
        });

        martyrs = (Button)findViewById(R.id.crpf_martyrs);
        martyrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network

                    Uri uri = Uri.parse("https://www.crpf.gov.in/martyr-gallery.htm"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else
//
                    Snackbar.make(view, "You're not connected to internet. Check your internet connection !", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
            }
        });

        gallantry = (Button)findViewById(R.id.crpf_award);
        gallantry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network

                    Uri uri = Uri.parse("http://www.uniindia.com/35-gallantry-medals-including-2-shaurya-chakras-awarded-to-crpf-on-69th-r-day/india/news/1118050.html"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else
//
                    Snackbar.make(view, "You're not connected to internet. Check your internet connection !", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
            }
        });

        ranks = (Button)findViewById(R.id.crpf_ranks);
        ranks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CRPFactivity.this,CRPFranksActivity.class));
            }
        });

    }
}
