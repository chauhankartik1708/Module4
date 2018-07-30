package com.dzone.module4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class AboutUsFragment extends Fragment {
    ImageView mem3,mem4;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_about_us, container, false);

        mem3 = v.findViewById(R.id.mem3);
        mem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.linkedin.com/in/sagar-jaiswal-5681ab138"));
                getActivity().startActivity(i);
            }
        });

        mem4 = v.findViewById(R.id.mem4);
        mem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.linkedin.com/in/kartik-chauhan-8a4564132"));
                getActivity().startActivity(i);
            }
        });

        return v;
    }
}
