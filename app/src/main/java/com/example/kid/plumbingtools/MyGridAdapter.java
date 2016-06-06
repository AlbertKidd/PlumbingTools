package com.example.kid.plumbingtools;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by niuwa on 2016/6/6.
 */
public class MyGridAdapter extends BaseAdapter {

    @Override
    public int getCount() {
        return MainFunction.values().length;
    }

    @Override
    public Object getItem(int position) {
        return MainFunction.getFuction(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else
            viewHolder = (ViewHolder) convertView.getTag();
        MainFunction mainFunction = MainFunction.getFuction(position + 1);
        viewHolder.mGridItemImage.setImageResource(mainFunction.getFunctionImage());
        viewHolder.mGridItemText.setText(mainFunction.getFunctionName());
        return convertView;
    }

    static class ViewHolder {
        @BindView(R.id.grid_item_image)
        ImageView mGridItemImage;
        @BindView(R.id.grid_item_text)
        TextView mGridItemText;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
