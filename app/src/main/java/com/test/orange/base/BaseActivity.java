package com.test.orange.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.test.orange.util.MyEvents;

import org.greenrobot.eventbus.EventBus;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {

    public EventBus eventBus = OrangeApp.mEventBus;
    private Unbinder unbinder;
    public MyEvents myEvents = new MyEvents();
    protected Activity mActivity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
//        eventBus.register(this);
        mActivity = this;
        unbinder = ButterKnife.bind(this);
        initView();
        initData();

    }

    @Override
    public void onClick(View v) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
        eventBus.unregister(this);
    }

    protected abstract int getLayoutId();

    protected abstract void initView();

    protected abstract void initData();

}
