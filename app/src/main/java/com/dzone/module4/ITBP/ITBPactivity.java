package com.dzone.module4.ITBP;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dzone.module4.R;

public class ITBPactivity extends AppCompatActivity {
    Button about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itbpactivity);

        about = (Button)findViewById(R.id.itbp_about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ITBPactivity.this,ITBPaboutActivity.class));
            }
        });
    }
}
