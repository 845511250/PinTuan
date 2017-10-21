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
import com.example.zuoyun.pintuan.R2;
import com.example.zuoyun.pintuan.staffSend.adapter.StaffSendAdapter;
import com.example.zuoyun.pintuan.staffSend.m.Staff;
import com.example.zuoyun.pintuan.withdrawSetting.AccountDetailActivity;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class StaffSendActivity extends AppCompatActivity {
    Context context;

    @BindView(R2.id.tv_topbar_title)
    TextView tv_topbar_title;
    @BindView(R2.id.tv_topbar_right)
    TextView tv_topbar_right;

    @BindView(R2.id.rv_staffSend)
    RecyclerView rv_staffSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_send);
        context = this;
        ButterKnife.bind(this);

        tv_topbar_title.setText("员工发放");
        tv_topbar_right.setVisibility(View.VISIBLE);
        tv_topbar_right.setText("员工管理");

        init();
    }

    @OnClick(R2.id.iv_topbar_back)
    void iv_topbar_back(){
        finish();
    }
    @OnClick(R2.id.tv_topbar_right)
    void tv_topbar_right(){
        startActivity(new Intent(this, StaffActivity.class));
    }
    @OnClick(R2.id.iv_add)
    void iv_add(){
        Toast.makeText(context, "添加", Toast.LENGTH_SHORT).show();
    }

    void init(){
        ArrayList<Staff> staffs = new ArrayList<>();
        for (int i=0;i<10;i++) {
            Staff staff = new Staff();
            staff.name = "张滨华";
            staff.shop = "众途" + i + "号店";
            staff.activityNum = i + "";
            staffs.add(staff);
        }
        StaffSendAdapter adapter = new StaffSendAdapter(context, staffs);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        rv_staffSend.setLayoutManager(layoutManager);
        rv_staffSend.setAdapter(adapter);

    }
}
