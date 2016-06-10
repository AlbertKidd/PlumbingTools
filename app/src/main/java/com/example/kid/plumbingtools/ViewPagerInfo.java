package com.example.kid.plumbingtools;

/**
 * Created by niuwa on 2016/6/10.
 */
public class ViewPagerInfo {
    public String title;
    public Class<?> clz;
    public int viewId;

    public ViewPagerInfo(String title, Class<?> clz, int viewId){
        this.title = title;
        this.clz = clz;
        this.viewId = viewId;
    }
}
