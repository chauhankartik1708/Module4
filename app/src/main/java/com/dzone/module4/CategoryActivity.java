package com.dzone.module4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        Intent inExtra = getIntent();
        Bundle b = inExtra.getExtras();
        if(b!=null)
        {
            String name = b.getString("page");
            Toast.makeText(this,name,Toast.LENGTH_LONG);
        }
    }
}
