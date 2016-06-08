package com.example.kid.plumbingtools;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.TabHost;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by niuwa on 2016/6/7.
 */
public class FunctionActivity extends AppCompatActivity {

    public final static String FUNCTION_INDEX = "functionIndex";
    @BindView(R.id.real_tab_content)
    FrameLayout mRealTabContent;
    @BindView(R.id.tab_host)
    FragmentTabHost mTabHost;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function);
        ButterKnife.bind(this);
        initView();
    }

    private void initView(){
        mTabHost.setup(this, getSupportFragmentManager(), R.id.real_tab_content);
        initTabs();

    }

    private void initTabs(){
        MainFunction[] functions = MainFunction.values();
        for (int i = 0; i < functions.length; i++){
            MainFunction function = functions[i];
            String functionName = getString(function.getFunctionName());
            Drawable functionImage = getResources().getDrawable(function.getFunctionImage());
            TabHost.TabSpec tabSpec = mTabHost.newTabSpec(functionName);
            tabSpec.setIndicator(functionName,functionImage);
            mTabHost.addTab(tabSpec, function.getClz(), null);
        }
    }
}
