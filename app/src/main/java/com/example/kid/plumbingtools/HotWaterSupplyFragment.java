package com.example.kid.plumbingtools;

import com.example.kid.plumbingtools.function_R.RDrinkingWaterFragment;
import com.example.kid.plumbingtools.function_R.RHeatConsumptionFragment;

/**
 * Created by niuwa on 2016/6/7.
 */
public class HotWaterSupplyFragment extends BaseViewPagerFragment{
    @Override
    public void setupTabAdapter(ViewPageFragmentAdapter adapter) {
        String[] title = getResources().getStringArray(R.array.hot_water_arrays);
        adapter.addTab(title[0], RDrinkingWaterFragment.class);
        adapter.addTab(title[1], RHeatConsumptionFragment.class);
    }
}
