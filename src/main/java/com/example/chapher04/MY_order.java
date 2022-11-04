package com.example.chapher04;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MY_order extends AppCompatActivity implements View.OnClickListener {

 private EditText tv_msg1;
 private EditText tv_msg2;
 private EditText tv_msg3;
 private Button btn_ensure;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);
        tv_msg1=findViewById(R.id.tv_msg1);
        tv_msg2=findViewById(R.id.tv_msg2);
        tv_msg3= findViewById(R.id.tv_msg3);

        btn_ensure=findViewById(R.id.btn_ensure);

        btn_ensure.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        reset();
        }
        private void reset(){
        tv_msg1.setCursorVisible(false);
        tv_msg2.setCursorVisible(false);
        tv_msg3.setCursorVisible(false);
        }
    }
