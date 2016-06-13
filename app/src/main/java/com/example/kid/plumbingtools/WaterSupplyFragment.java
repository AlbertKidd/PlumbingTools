package com.example.kid.plumbingtools;

import com.example.kid.plumbingtools.function_J.JInteriorPipeFragment;
import com.example.kid.plumbingtools.function_J.JPipeCalculateFragment;
import com.example.kid.plumbingtools.function_J.JPipeFittingEquivalentFragment;

/**
 * Created by niuwa on 2016/6/7.
 */
public class WaterSupplyFragment extends BaseViewPagerFragment {

    @Override
    public void setupTabAdapter(ViewPageFragmentAdapter adapter){
        String[] title = getResources().getStringArray(R.array.water_supply_arrays);
        adapter.addTab(title[0], JPipeCalculateFragment.class);
        adapter.addTab(title[1], JInteriorPipeFragment.class);
        adapter.addTab(title[2], JPipeFittingEquivalentFragment.class);
    }
}
