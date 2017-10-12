package com.example.zuoyun.pintuan.staffSend;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zuoyun.pintuan.R;
import com.example.zuoyun.pintuan.staffSend.adapter.StaffAdapter;
import com.example.zuoyun.pintuan.staffSend.m.Staff;
import com.example.zuoyun.pintuan.withdrawSetting.AccountDetailActivity;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AddStaffActivity extends AppCompatActivity {
    Context context;

    @BindView(R.id.tv_topbar_title)
    TextView tv_topbar_title;
    @BindView(R.id.tv_topbar_right)
    TextView tv_topbar_right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_staff);
        context = this;
        ButterKnife.bind(this);

        tv_topbar_title.setText("新增员工");

        init();
    }

    @OnClick({R.id.iv_topbar_back, R.id.bt_add})
    public void OnClick(View v) {
        switch (v.getId()) {
            case R.id.iv_topbar_back:
                finish();
                break;
            case R.id.bt_add:
                Toast.makeText(context, "添加", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    void init(){

    }
}
