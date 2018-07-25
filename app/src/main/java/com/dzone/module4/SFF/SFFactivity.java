package com.dzone.module4.SFF;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dzone.module4.R;

public class SFFactivity extends AppCompatActivity {
    Button about,history,formation,operation,equipments;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sffactivity);

        about = (Button)findViewById(R.id.sff_about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SFFactivity.this,SFFaboutActivity.class));
            }
        });

        history = (Button)findViewById(R.id.sff_history);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SFFactivity.this,SFFhistoryActivity.class));
            }
        });

        formation = (Button)findViewById(R.id.sff_formation);
        formation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SFFactivity.this,SFFformationActivity.class));
            }
        });

        operation = (Button)findViewById(R.id.sff_operations);
        operation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SFFactivity.this,SFFoperationsActivity.class));
            }
        });

        equipments = (Button)findViewById(R.id.sff_equipments);
        equipments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SFFactivity.this,SFFequipmentsActivity.class));
            }
        });
    }
}
