package com.example.chapher04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class lineinTextActivity extends AppCompatActivity {
    private TextView tv_111;
    private  TextView tv_222;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linein_text);
        tv_111=findViewById(R.id.tv_111);
        tv_222=findViewById(R.id.tv_222);
    }
}