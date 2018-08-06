package com.dzone.module4;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {

<<<<<<< HEAD:app/src/main/java/com/dzone/module4/TabbedActivity.java
public class TabbedActivity extends AppCompatActivity {

=======
>>>>>>> 8495531f8771f6ac0e14eca2e219a1ed95e63706:app/src/main/java/com/dzone/module4/HomeFragment.java
    private SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, null);


<<<<<<< HEAD:app/src/main/java/com/dzone/module4/TabbedActivity.java
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());


        mViewPager = (ViewPager) findViewById(R.id.container);
=======
        Toolbar toolbar = (Toolbar) root.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) root.findViewById(R.id.container);
>>>>>>> 8495531f8771f6ac0e14eca2e219a1ed95e63706:app/src/main/java/com/dzone/module4/HomeFragment.java
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) root.findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

<<<<<<< HEAD:app/src/main/java/com/dzone/module4/TabbedActivity.java
=======
        return root;
>>>>>>> 8495531f8771f6ac0e14eca2e219a1ed95e63706:app/src/main/java/com/dzone/module4/HomeFragment.java
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            switch (position){
                case 0:
                    Army army = new Army();
                    return army;
                case 1:
                    Navy navy = new Navy();
                    return navy;
                case 2:
                    AirForce airForce = new AirForce();
                    return airForce;
                case 3:
                    OthersActivity others = new OthersActivity();
                    return others;
                default:
                    return new OthersActivity();
            }

        }

        @Override
        public int getCount() {

            return 4;
        }
    }
}
