package com.dzone.module4.SSB;

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

public class SSBactivity extends AppCompatActivity {
    Button about,history,martyrs,gallantry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ssbactivity);

        about = (Button)findViewById(R.id.ssb_about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SSBactivity.this,SSBaboutActivity.class));
            }
        });

        history = (Button)findViewById(R.id.ssb_history);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SSBactivity.this,SSBhistoryActivity.class));
            }
        });

        martyrs = (Button)findViewById(R.id.ssb_martyrs);
        martyrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network

                    Uri uri = Uri.parse("http://www.ssb.nic.in/index1.aspx?langid=1&lev=2&lsid=296&pid=56&Cid=0&lid=285"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else
//
                    Snackbar.make(view, "You're not connected to internet. Check your internet connection !", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
            }
        });

        gallantry = (Button)findViewById(R.id.ssb_award);
        gallantry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network

                    Uri uri = Uri.parse("http://www.ssb.nic.in/WriteReadData/LINKS/c3d2e7da-98da-4750-a071-a294b092a9ef.pdf"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else
//
                    Snackbar.make(view, "You're not connected to internet. Check your internet connection !", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
            }
        });
    }
}
