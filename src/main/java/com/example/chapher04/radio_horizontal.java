package com.example.chapher04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class radio_horizontal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
private RadioButton rg_gender;
private TextView tv_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_horizontal);
        RadioGroup rg_gender= findViewById(R.id.rg_gender);
         tv_result=findViewById(R.id.tv_result);
        rg_gender.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i){
            case R.id.rb_man:
                tv_result.setText("你是一个帅气的男孩");
                break;
            case R.id.rb_woman:
                tv_result.setText("你是一个漂亮的女孩");
                break;

        }
    }
}