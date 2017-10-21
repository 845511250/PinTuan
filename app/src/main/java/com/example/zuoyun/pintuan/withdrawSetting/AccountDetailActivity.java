package com.example.zuoyun.pintuan.withdrawSetting;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.zuoyun.pintuan.R;
import com.example.zuoyun.pintuan.R2;
import com.example.zuoyun.pintuan.withdrawSetting.adapter.AccountDetailAdapter;
import com.example.zuoyun.pintuan.withdrawSetting.m.AccountDetail;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AccountDetailActivity extends AppCompatActivity {
    Context context;

    @BindView(R2.id.tv_topbar_title)
    TextView tv_topbar_title;
    @BindView(R2.id.tv_topbar_right)
    TextView tv_topbar_right;
    @BindView(R2.id.rv_accountDetail)
    RecyclerView rv_accountDetail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_detail);
        context = this;
        ButterKnife.bind(this);

        tv_topbar_title.setText("员工账户");
        tv_topbar_right.setVisibility(View.VISIBLE);
        tv_topbar_right.setText("提现");

        init();
    }

    @OnClick(R2.id.iv_topbar_back)
    void iv_topbar_back(){
        finish();
    }
    @OnClick(R2.id.tv_topbar_right)
    void tv_topbar_right(){
        startActivity(new Intent(this, WithdrawActivity.class));
    }

    void init(){
        ArrayList<AccountDetail> accountDetails = new ArrayList<>();
        AccountDetail accountDetail = new AccountDetail();
        accountDetail.change = "5";
        accountDetail.type = "拼团奖励";
        accountDetail.balance = "1000";
        accountDetail.date = "2017/08/11";
        for(int i=0;i<10;i++) {
            accountDetails.add(accountDetail);
        }
        AccountDetailAdapter adapter = new AccountDetailAdapter(context, accountDetails);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        rv_accountDetail.setLayoutManager(layoutManager);
        rv_accountDetail.setAdapter(adapter);
    }
}
