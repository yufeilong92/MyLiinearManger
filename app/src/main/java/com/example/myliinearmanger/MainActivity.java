package com.example.myliinearmanger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRlvContent;
    private List<String> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mList = addData();
        initData();
    }

    private List<String> addData() {
        int a = 30;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            list.add("坐标" + i);
        }
        return list;
    }

    private void initData() {
        FlowLayoutManager manager = new FlowLayoutManager(this,true);
        mRlvContent.setLayoutManager(manager);
        RecyclerAdapter adapter = new RecyclerAdapter(this, mList);
        mRlvContent.setAdapter(adapter);

    }

    private void initView() {
        mRlvContent = (RecyclerView) findViewById(R.id.rlv_content);
    }
}
