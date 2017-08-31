package com.example.android.guiadeturismo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private int mCount = 5;

    public MyFragmentPagerAdapter(FragmentManager fm) {

        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new CidadeFragment();
            case 1:
                return new TurismoFragment();
            case 2:
                return new LazerFragment();
            case 3:
                return new AlimentacaoFragment();
            case 4:
                return new SaudeFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Cidade";
            case 1:
                return "Turismo";
            case 2:
                return "Lazer";
            case 3:
                return "Alimentação";
            case 4:
                return "Saúde";
        }
        return null;

    }
}

