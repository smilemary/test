package com.example.chapher04;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class date_pickerActiviity extends AppCompatActivity implements View.OnClickListener, DatePickerDialog.OnDateSetListener {
private DatePicker dp_date;
private TextView tv_date;
private Button btn_OK;
private Button btn_date;
private String desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker_activiity);
        dp_date=findViewById(R.id.dp_date);
        tv_date=findViewById(R.id.tv_date);
        btn_OK=findViewById(R.id.btn_OK);
        btn_OK.setOnClickListener(this);
        btn_date=findViewById(R.id.btn_date);
    }

    @Override
    public void onClick(View view) {
    switch (view.getId()){
        case R.id.btn_OK:
            String desc =String.format("您选择的日期是%d年%d月%d日",dp_date.getYear(),dp_date.getMonth(),dp_date.getDayOfMonth());
            btn_OK.setEnabled(false);
            tv_date.setText(desc);
            break;
        case R.id.btn_date:
            Calendar calenlar=Calendar.getInstance();
            calenlar.get(Calendar.YEAR);
            calenlar.get(Calendar.MONTH);
            calenlar.get(Calendar.DAY_OF_MONTH);
            DatePickerDialog dialog=new DatePickerDialog(this,this,2090,5,11);
            dialog.show();
            break;
        default:throw new IllegalStateException("Unexpected value: " + view.getId());


    }
    }

    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
        String desc =String.format("您选择的日期是%d年%d月%d日",dp_date.getYear(),dp_date.getMonth(),dp_date.getDayOfMonth());

    }
}