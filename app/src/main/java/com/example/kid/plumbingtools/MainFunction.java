package com.example.kid.plumbingtools;

/**
 * Created by niuwa on 2016/6/6.
 */
public enum MainFunction {

    WaterSupply(0, R.string.water_supply, R.mipmap.water_supply, WaterSupplyFragment.class),
    Drainage(1, R.string.drainage, R.mipmap.drainage, DrainageFragment.class),
    HotWaterSupply(2, R.string.hot_water_supply, R.mipmap.hot_water, HotWaterSupplyFragment.class),
    FireWaterSupply(3, R.string.fire_water_supply, R.mipmap.fire_water, FireWaterSupplyFragment.class),
    AirDefenceWaterSupply(4, R.string.air_defence_water_supply, R.mipmap.air_defence,
            AirDefenceWaterSupplyFragment.class),
    Others(5, R.string.other, R.drawable.ic_more_horiz_black_48dp, OthersFragment.class);

    private int index;
    private int functionName;
    private int functionImage;
    private Class<?> clz;

    private MainFunction(int index, int functionName, int functionImage, Class<?> clz){
        this.index = index;
        this.functionName = functionName;
        this.functionImage = functionImage;
        this.clz = clz;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getFunctionName() {
        return functionName;
    }

    public void setFunctionName(int functionName) {
        this.functionName = functionName;
    }

    public int getFunctionImage() {
        return functionImage;
    }

    public void setFunctionImage(int functionImage) {
        this.functionImage = functionImage;
    }

    public Class<?> getClz() {
        return clz;
    }

    public void setClz(Class<?> clz) {
        this.clz = clz;
    }

    public static MainFunction getFuction(int index){
        for (MainFunction function : MainFunction.values()){
            if (function.getIndex() == index)
                return function;
        }
        return null;
    }
}
