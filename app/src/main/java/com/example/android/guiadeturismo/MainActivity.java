package com.example.android.guiadeturismo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tab = (TabLayout) findViewById(R.id.tabs);
        tab.setTabMode(TabLayout.MODE_SCROLLABLE);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        tab.setupWithViewPager(viewPager);
        viewPager.setAdapter(adapter);
    }
}
