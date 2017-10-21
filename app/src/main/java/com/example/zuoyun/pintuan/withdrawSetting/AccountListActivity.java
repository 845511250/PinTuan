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
import com.example.zuoyun.pintuan.withdrawSetting.adapter.AccountListAdapter;
import com.example.zuoyun.pintuan.withdrawSetting.m.Account;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AccountListActivity extends AppCompatActivity {
    Context context;

    @BindView(R2.id.tv_topbar_title)
    TextView tv_topbar_title;
    @BindView(R2.id.tv_topbar_right)
    TextView tv_topbar_right;

    @BindView(R2.id.rv_accountList)
    RecyclerView rv_accountList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_list);
        context = this;
        ButterKnife.bind(this);

        tv_topbar_title.setText("账户列表");
        tv_topbar_right.setVisibility(View.VISIBLE);
        tv_topbar_right.setText("筛选");

        init();
    }

    @OnClick(R2.id.iv_topbar_back)
    void iv_topbar_back(){
        finish();
    }
    @OnClick(R2.id.tv_topbar_right)
    void tv_topbar_right(){
        startActivity(new Intent(this, AccountDetailActivity.class));
    }

    void init(){
        ArrayList<Account> accounts = new ArrayList<>();
        Account account = new Account();
        account.name = "张滨华";
        account.commission = "1000";
        account.balance = "590";
        for (int i=0;i<10;i++) {
            accounts.add(account);
        }
        AccountListAdapter adapter = new AccountListAdapter(context, accounts);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        rv_accountList.setLayoutManager(layoutManager);
        rv_accountList.setAdapter(adapter);

    }
}
