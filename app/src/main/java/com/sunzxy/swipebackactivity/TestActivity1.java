package com.sunzxy.swipebackactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TestActivity1 extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
    }
    public void click(View view){
        startActivity(new Intent(this,TestActivity2.class));
    }
}
