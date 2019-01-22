package com.test.orange.ui;

import com.test.orange.R;
import com.test.orange.base.BaseActivity;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class SearshActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.searsh_layout;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {


    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread() {

    }

}
