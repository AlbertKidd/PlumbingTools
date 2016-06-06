package com.example.kid.plumbingtools;

/**
 * Created by niuwa on 2016/6/6.
 */
public enum MainFunction {

    WaterSupply(1, R.string.water_supply, R.mipmap.water_supply),
    Drainage(2, R.string.drainage, R.mipmap.drainage),
    HotWaterSupply(3, R.string.hot_water_supply, R.mipmap.hot_water),
    FireWaterSupply(4, R.string.fire_water_supply, R.mipmap.fire_water),
    AirDefenceWaterSupply(5, R.string.air_defence_water_supply, R.mipmap.air_defence),
    Other(6, R.string.other, R.drawable.ic_more_horiz_black_48dp);

    private int index;
    private int functionName;
    private int functionImage;

    private MainFunction(int index, int functionName, int functionImage){
        this.index = index;
        this.functionName = functionName;
        this.functionImage = functionImage;
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

    public static MainFunction getFuction(int index){
        for (MainFunction function : MainFunction.values()){
            if (function.getIndex() == index)
                return function;
        }
        return null;
    }
}
