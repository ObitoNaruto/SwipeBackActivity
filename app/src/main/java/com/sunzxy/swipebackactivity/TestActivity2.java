package com.sunzxy.swipebackactivity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TestActivity2 extends BaseActivity {
    private RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
    }

    @Override
    protected void onStart() {
        super.onStart();
        List<String> datas = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            datas.add(String.valueOf(i));
        }
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        mRecyclerView.setAdapter(new MyRecyclerViewAdapter(datas));
    }
}
