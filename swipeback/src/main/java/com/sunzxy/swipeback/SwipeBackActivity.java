package com.sunzxy.swipeback;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by zhengxiaoyong on 16/3/4.
 */
public class SwipeBackActivity extends AppCompatActivity implements ISwipeLayoutExtension {

    private SwipeBackLayoutHelper mSwipeBackHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mSwipeBackHelper = SwipeBackLayoutHelper.create(this);
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        getSwipeBackLayout().attachToActivity(this);
    }

    @Override
    public void finish() {
        super.finish();
    }

    @Override
    public View findViewById(int id) {
        View view = super.findViewById(id);
        if (view == null && mSwipeBackHelper != null) {
            view = getSwipeBackLayout().findViewById(id);
        }
        return view;
    }

    @Override
    public void setSwipeBackEnabled(boolean isEnabled) {
        getSwipeBackLayout().setEnableGesture(isEnabled);
    }

    @Override
    public SwipeBackLayout getSwipeBackLayout() {
        return mSwipeBackHelper.getSwipeBackLayout();
    }
}
