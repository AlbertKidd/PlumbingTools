package com.example.kid.plumbingtools;

/**
 * Created by niuwa on 2016/6/7.
 */
public class WaterSupplyFragment extends BaseViewPagerFragment {

    @Override
    public void setupTabAdapter(ViewPageFragmentAdapter adapter){
        String[] title = getResources().getStringArray(R.array.water_supply_arrays);
        adapter.addTab(title[0], JPipeCalculate.class);
        adapter.addTab(title[1], JInteriorPipe.class);
    }
}
