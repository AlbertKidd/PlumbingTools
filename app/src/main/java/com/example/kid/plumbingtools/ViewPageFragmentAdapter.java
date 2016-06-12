package com.example.kid.plumbingtools;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.astuetz.PagerSlidingTabStrip;

import java.util.ArrayList;

/**
 * Created by niuwa on 2016/6/8.
 */
public class ViewPageFragmentAdapter extends FragmentStatePagerAdapter{

    private Context mContext;
    private ViewPager mViewPager;
    private PagerSlidingTabStrip mTabStrip;
    private ArrayList<ViewPagerInfo> mTabs = new ArrayList<ViewPagerInfo>();

    public ViewPageFragmentAdapter(FragmentManager fm, PagerSlidingTabStrip tabStrip, ViewPager pager){
        super(fm);
        mContext = pager.getContext();
        this.mViewPager = pager;
        this.mTabStrip = tabStrip;
        mViewPager.setAdapter(this);
        mTabStrip.setViewPager(mViewPager);
    }

    public void addTab(String title, Class<?> clz){
        ViewPagerInfo viewPagerInfo = new ViewPagerInfo(title, clz);
        addFragment(viewPagerInfo);
    }

    private void addFragment(ViewPagerInfo info){
        if (info == null){
            return;
        }
        View v = LayoutInflater.from(mContext).inflate(R.layout.base_viewpage_tag_item, null);
        TextView title = (TextView) v.findViewById(R.id.viewpage_tag_item_text);
        title.setText(info.title);
        mTabs.add(info);
        mTabStrip.notifyDataSetChanged();
        notifyDataSetChanged();
    }

    @Override
    public Fragment getItem(int position) {
        ViewPagerInfo info = mTabs.get(position);
        return Fragment.instantiate(mContext, info.clz.getName());
    }

    @Override
    public int getCount() {
        return mTabs.size();
    }

    @Override
    public CharSequence getPageTitle(int position){
        return mTabs.get(position).title;
    }
}
