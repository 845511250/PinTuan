package com.example.zuoyun.pintuan.staffSend;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.zuoyun.pintuan.R;
import com.example.zuoyun.pintuan.R2;
import com.example.zuoyun.pintuan.staffSend.adapter.ShopAdapter;
import com.example.zuoyun.pintuan.staffSend.adapter.StaffAdapter;
import com.example.zuoyun.pintuan.staffSend.m.Shop;
import com.example.zuoyun.pintuan.staffSend.m.Staff;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ShopActivity extends AppCompatActivity {
    Context context;

    @BindView(R2.id.tv_topbar_title)
    TextView tv_topbar_title;
    @BindView(R2.id.tv_topbar_right)
    TextView tv_topbar_right;

    @BindView(R2.id.rv_shop)
    RecyclerView rv_shop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        context = this;
        ButterKnife.bind(this);

        tv_topbar_title.setText("门店管理");

        init();
    }

    @OnClick(R2.id.iv_topbar_back)
    void iv_topbar_back(){
        finish();
    }
    @OnClick(R2.id.bt_add)
    void bt_add(){
        startActivity(new Intent(this, AddShopActivity.class));
    }

    void init(){
        ArrayList<Shop> shops = new ArrayList<>();
        Shop shop = new Shop();
        shop.name = "众途汽车美容维修一号店";
        shop.phone = "13866668888";
        shop.address = "厦门市思明区软件园";
        for (int i=0;i<10;i++) {
            shops.add(shop);
        }
        ShopAdapter adapter = new ShopAdapter(context, shops);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        rv_shop.setLayoutManager(layoutManager);
        rv_shop.setAdapter(adapter);

    }
}
