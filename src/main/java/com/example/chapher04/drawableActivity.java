package com.example.chapher04;

import static com.example.chapher04.R.id.V_content;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class drawableActivity extends AppCompatActivity implements View.OnClickListener {
private View V_content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable);
        V_content= findViewById(R.id.V_content);
        findViewById(R.id.btn_rect).setOnClickListener(this);
        findViewById(R.id.btn_oval).setOnClickListener(this);
        V_content.setBackgroundResource(R.drawable.shape_rect_gold);
    }

    @Override
    public void onClick(View view) {
    switch (view.getId()){
        case R.id.btn_rect:
            V_content.setBackgroundResource(R.drawable.shape_rect_gold);
            break;
        case R.id.btn_oval:
            V_content.setBackgroundResource(R.drawable.shape_oval_rose);
            break;
    }
    }
}