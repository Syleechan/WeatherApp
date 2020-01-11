package com.example.myweather;

import android.app.Activity;
import android.os.Bundle;
import android.os.strictmode.CleartextNetworkViolation;
import android.view.View;
import android.widget.ImageView;
import android.content.Intent;
import android.widget.TextView;

import java.util.List;

import cn.edu.pku.leechan.bean.City;
import cn.edu.pku.leechan.widget.ClearEiditText;

public class SelectCity extends Activity implements View.OnClickListener{
    private ImageView mBackBtn;
    private TextView mTitleCity;
    private List<City> citys;
    private ClearEiditText mClearEiditText;

    @Override
    protected void onCreate(Bundle savedInstancesState){
        super.onCreate(savedInstancesState);

        setContentView(R.layout.select_city);
        initViews();
        mBackBtn = (ImageView)findViewById(R.id.title_back);
        mBackBtn.setOnClickListener(this);
    }

    private void initViews(){
        mBackBtn = (ImageView)findViewById(R.id.title_back);
        mBackBtn.setOnClickListener(this);

        mTitleCity = (TextView)findViewById(R.id.title_name);
        mClearEiditText = (ClearEiditText)findViewById(R.id.cet_clear_text);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.title_back:
                Intent i = new Intent();
                i.putExtra("cityCode", "101160101");
                setResult(RESULT_OK, i);
                finish();
                break;
            default:
                break;
        }
    }
}
