package com.example.zuoyun.pintuan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.zuoyun.pintuan.staffSend.StaffSendActivity;
import com.example.zuoyun.pintuan.withdrawSetting.SettingActivity;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void click1(View v){
        startActivity(new Intent(this, SettingActivity.class));
    }
    public void click2(View v){
        startActivity(new Intent(this, StaffSendActivity.class));
    }
}
