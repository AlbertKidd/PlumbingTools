package com.example.kid.plumbingtools;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import com.astuetz.PagerSlidingTabStrip;

/**
 * Created by niuwa on 2016/6/8.
 */
public class ViewPageFragmentAdapter extends FragmentStatePagerAdapter{

    public ViewPageFragmentAdapter(FragmentManager fm, PagerSlidingTabStrip tabStrip, ViewPager pager){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
