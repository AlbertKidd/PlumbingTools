package com.example.kid.plumbingtools.function_P;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kid.plumbingtools.R;

/**
 * Created by niuwa on 2016/6/13.
 */
public class PDrainageDitchFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.p_drainage_ditch, null);
        return v;
    }
}
