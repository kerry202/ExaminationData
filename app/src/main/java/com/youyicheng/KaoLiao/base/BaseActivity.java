package com.youyicheng.KaoLiao.base;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.youyicheng.KaoLiao.R;
import com.youyicheng.KaoLiao.http.OnDataListener;
import com.youyicheng.KaoLiao.util.MyEvents;

import org.greenrobot.eventbus.EventBus;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {

    public EventBus eventBus = OrangeApp.mEventBus;
    private Unbinder unbinder;
    public MyEvents myEvents = new MyEvents();
    protected BaseActivity activity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 设置状态栏底色白色
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        getWindow().setStatusBarColor(Color.WHITE);

        // 设置状态栏字体黑色
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);


        setContentView(getLayoutId());
//        eventBus.register(this);
        activity = this;
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
