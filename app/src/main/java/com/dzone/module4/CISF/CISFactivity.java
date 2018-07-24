package com.dzone.module4.CISF;

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

public class CISFactivity extends AppCompatActivity {
    Button about,history,martyrs,gallantry,ranks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cisfactivity);

        about = (Button)findViewById(R.id.cisf_about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CISFactivity.this,CISFaboutActivity.class));
            }
        });

        history = (Button)findViewById(R.id.cisf_history);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CISFactivity.this,CISFhistoryActivity.class));
            }
        });

          martyrs = (Button)findViewById(R.id.cisf_martyrs);
          martyrs.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                  if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                          connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                      //we are connected to a network

                      Uri uri = Uri.parse("https://www.cisf.gov.in/wp-content/uploads/2015/06/list_of_MARTYS.pdf"); // missing 'http://' will cause crashed
                      Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                      startActivity(intent);
                  }
                  else
//
                      Snackbar.make(view, "You're not connected to internet. Check your internet connection !", Snackbar.LENGTH_LONG)
                              .setAction("Action", null).show();
              }
          });

          gallantry = (Button)findViewById(R.id.cisf_award);
          gallantry.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                  if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                          connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                      //we are connected to a network

                      Uri uri = Uri.parse("https://www.outlookindia.com/newsscroll/34-cisf-personnel-awarded-presidents-medals-on-republic-day/974598"); // missing 'http://' will cause crashed
                      Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                      startActivity(intent);
                  }
                  else
//
                      Snackbar.make(view, "You're not connected to internet. Check your internet connection !", Snackbar.LENGTH_LONG)
                              .setAction("Action", null).show();
              }
          });

    ranks = (Button)findViewById(R.id.cisf_ranks);
    ranks.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(CISFactivity.this,CISFranksActivity.class));
        }
    });
    }
}
