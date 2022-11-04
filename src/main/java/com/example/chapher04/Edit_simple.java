package com.example.chapher04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Edit_simple extends AppCompatActivity implements View.OnFocusChangeListener {
private  EditText et_phone;
private EditText et_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_simple);
        et_phone = findViewById(R.id.et_phone);
        et_password = findViewById(R.id.et_password);
        et_password.setOnFocusChangeListener(this);
    }
    @Override
    public void onFocusChange(View view, boolean b) {
        if(b){
            String phone=et_phone.getText().toString();
            if(TextUtils.isEmpty(phone)||phone.length()<11){
                et_phone.requestFocus();
                Toast.makeText(this,"请输入11位手机号码",Toast.LENGTH_SHORT).show();
            }
        }
    }
}