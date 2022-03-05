package com.example.android.tabsdemoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabsLayoutAdapter adapter;
    TabLayout tabLayout;
    ViewPager viewPager;
    int [] tabIcons = {R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.myViewPager);
        tabLayout = findViewById(R.id.myTabLayout);
        adapter = new TabsLayoutAdapter(getSupportFragmentManager());
        adapter.addFragment(new FirstFragment(), "Tab 1");
        adapter.addFragment(new SecondFragment(), "Tab 2");
        adapter.addFragment(new ThirdFragment(), "Tab 3");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);


    }//end onCreate()
}//end class