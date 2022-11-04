package com.example.chapher04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.VibrationEffect;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SimpleA extends AppCompatActivity {

    private ListView list;
    private List<Map<String, Object>> listItems;
    private String[] names = new String[]{"虎头", "弄玉", "李清照", "李白"};
    private String[] descs = new String[]{"可爱的小孩", "一个擅长音乐的女孩", "一个擅长文学的女性", "浪漫主义诗人"};
    private int[] imageIds = new int[]{R.mipmap.image333, R.mipmap.image222, R.mipmap.image444, R.mipmap.image555};
    private int position;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        listItems = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            Map<String, Object> listItem = new HashMap<>();
            listItem.put("header", imageIds[i]);
            listItem.put("personName", names[i]);
            listItem.put("desc", descs[i]);
            listItems.add(listItem);

        }

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, listItems, R.layout.activity_main, new String[]{"personName", "header", "desc"}, new int[]{R.id.name, R.id.header, R.id.desc});
        list = (ListView) findViewById(R.id.mylist);

        list.setAdapter((ListAdapter) simpleAdapter);
        list.setOnItemClickListener((parent,view,position,id)->{Log.i("-CRAZYIT",names[position]+"被单机了");});
        list.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i("—CRAZYIT",names[position]+"被选中了");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




    }
}
