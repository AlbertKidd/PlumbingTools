package com.example.kid.plumbingtools;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by niuwa on 2016/6/7.
 */
public class WaterSupplyFragment extends BaseViewPagerFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.activity_main, null);
    }
}
