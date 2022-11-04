package com.example.chapher04;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AlertDialogActivity extends AppCompatActivity implements View.OnClickListener {
private TextView tv_alert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);
        findViewById(R.id.btn_alert).setOnClickListener(this);
        tv_alert=findViewById(R.id.tv_alert);

    }

    @Override
    public void onClick(View view) {
        //创建提醒对话框的建构器
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("尊敬的用户");
        builder.setMessage("你真的要卸载我吗？");
        builder.setPositiveButton("残忍卸载", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                tv_alert.setText("虽然依依不舍，但是只能离开了");
            }
        });
        builder.setNegativeButton("我再想想", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                tv_alert.setText("我在陪你三百六十五个夜晚");
            }
        });
        AlertDialog dialog= builder.create();
        dialog.show();

    }
}