package com.example.zuoyun.pintuan.withdrawSetting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.zuoyun.pintuan.R;
import com.example.zuoyun.pintuan.R2;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SettingActivity extends AppCompatActivity {
    @BindView(R2.id.tv_topbar_title)
    TextView tv_topbar_title;
    @BindView(R2.id.tv_topbar_right)
    TextView tv_topbar_right;
    @BindView(R2.id.cb_persent)
    CheckBox cb_persent;
    @BindView(R2.id.cb_num)
    CheckBox cb_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        ButterKnife.bind(this);

        tv_topbar_title.setText("提成设置");
        tv_topbar_right.setVisibility(View.VISIBLE);
        tv_topbar_right.setText("提现");
    }

    @OnClick(R2.id.iv_topbar_back)
    void iv_topbar_back(){
        finish();
    }
    @OnClick(R2.id.rl_persent)
    void rl_persent(){
        clearCB();
        cb_persent.setChecked(true);
    }
    @OnClick(R2.id.rl_num)
    void rl_num(){
        clearCB();
        cb_num.setChecked(true);
    }
    @OnClick(R2.id.tv_topbar_right)
    void tv_topbar_right(){
        startActivity(new Intent(this, AccountListActivity.class));
    }

    private void clearCB(){
        cb_persent.setChecked(false);
        cb_num.setChecked(false);
    }
}
