package com.example.chapher04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import com.example.chapher04.R.id;

public class switchActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
private TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);
        Switch sw_status=findViewById(R.id.sw_status);
        tv_result= findViewById(id.tv_result);
       sw_status.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        String desc=String.format("Switch按钮的状态是%s",b?"开":"关");
    tv_result.setText("您已经点击了按钮");

    }
}