package com.example.kid.plumbingtools;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.grid_functions)
    GridView mGridFunctions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }

    private void initView(){
        MyGridAdapter adapter = new MyGridAdapter();
        mGridFunctions.setAdapter(adapter);
        mGridFunctions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this, FunctionActivity.class);
                i.putExtra(FunctionActivity.FUNCTION_IDEX, String.valueOf(position));
                startActivity(i);
            }
        });
    }
}