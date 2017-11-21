package com.example.nicholas.movieposters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by Nick on 11/13/2017.
 */

public class FragmentPagerAdapter {
    private String tabTitles[] = new String[] { "Old City", "Liberty Bell"};

    public FragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new OldCityFragment();
        } else {
            return new LibertyFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
