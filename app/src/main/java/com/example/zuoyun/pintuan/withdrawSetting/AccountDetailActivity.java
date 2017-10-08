package com.example.zuoyun.pintuan.withdrawSetting;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.zuoyun.pintuan.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AccountDetailActivity extends AppCompatActivity {
    Context context;

    @BindView(R.id.tv_topbar_title)
    TextView tv_topbar_title;
    @BindView(R.id.tv_topbar_right)
    TextView tv_topbar_right;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_detail);
        context = this;
        ButterKnife.bind(this);

        tv_topbar_title.setText("员工账户");
        tv_topbar_right.setVisibility(View.VISIBLE);
        tv_topbar_right.setText("提现");
    }

    @OnClick({R.id.iv_topbar_back, R.id.tv_topbar_right})
    public void OnClick(View v) {
        switch (v.getId()) {
            case R.id.iv_topbar_back:
                finish();
                break;
            case R.id.tv_topbar_right:
                //startActivity(new Intent(this, AccountDetailActivity.class));
                break;
        }
    }
}
