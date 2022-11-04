package com.example.chapher04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class selectbutton extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectbutton);
   CheckBox ck_system=findViewById(R.id.ck_system);
   CheckBox ck_custom=findViewById(R.id.ck_custom);
       ck_system.setOnCheckedChangeListener(this);
        ck_system.setOnCheckedChangeListener(this);
    }
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        String desc=String.format("您%s了这个checkBox",isChecked ?"勾选":"取消勾选");//  ？ 语句1：语句2
        buttonView.setText(desc);

    }

    @Override
    public void onClick(View view) {

    }
}