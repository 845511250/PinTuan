package com.example.zuoyun.pintuan.withdrawSetting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.zuoyun.pintuan.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SettingActivity extends AppCompatActivity {
    @BindView(R.id.tv_topbar_title)
    TextView tv_topbar_title;
    @BindView(R.id.tv_topbar_right)
    TextView tv_topbar_right;
    @BindView(R.id.cb_persent)
    CheckBox cb_persent;
    @BindView(R.id.cb_num)
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

    @OnClick({R.id.iv_topbar_back, R.id.rl_persent, R.id.rl_num, R.id.tv_topbar_right})
    public void OnClick(View v) {
        switch (v.getId()) {
            case R.id.iv_topbar_back:
                finish();
                break;
            case R.id.rl_persent:
                clearCB();
                cb_persent.setChecked(true);
                break;
            case R.id.rl_num:
                clearCB();
                cb_num.setChecked(true);
                break;
            case R.id.tv_topbar_right:
                startActivity(new Intent(this, AccountListActivity.class));
                break;
        }
    }

    private void clearCB(){
        cb_persent.setChecked(false);
        cb_num.setChecked(false);
    }
}
