package com.example.kid.plumbingtools;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.astuetz.PagerSlidingTabStrip;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by niuwa on 2016/6/7.
 */
public abstract class BaseViewPagerFragment extends Fragment {

    @BindView(R.id.pager_tab_strip)
    PagerSlidingTabStrip mPagerTabStrip;
    @BindView(R.id.view_pager)
    ViewPager mViewPager;

    ViewPageFragmentAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_base_view_pager, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){

        mAdapter = new ViewPageFragmentAdapter(getChildFragmentManager(), mPagerTabStrip, mViewPager);
        setupTabAdapter(mAdapter);
    }

    public abstract void setupTabAdapter(ViewPageFragmentAdapter adapter);
}
