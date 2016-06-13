package com.example.kid.plumbingtools;

import com.example.kid.plumbingtools.function_P.PDrainageDitchFragment;
import com.example.kid.plumbingtools.function_P.PInteriorPipeFragment;
import com.example.kid.plumbingtools.function_P.PPipeCalculateFragment;

/**
 * Created by niuwa on 2016/6/7.
 */
public class DrainageFragment extends BaseViewPagerFragment{
    @Override
    public void setupTabAdapter(ViewPageFragmentAdapter adapter) {
        String[] title = getResources().getStringArray(R.array.drainage_arrays);
        adapter.addTab(title[0], PPipeCalculateFragment.class);
        adapter.addTab(title[1], PDrainageDitchFragment.class);
        adapter.addTab(title[2], PInteriorPipeFragment.class);
    }
}
